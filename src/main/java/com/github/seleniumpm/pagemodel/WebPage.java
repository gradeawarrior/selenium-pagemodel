/*
 * Copyright 2017 Peter Salas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.seleniumpm.pagemodel;

import com.github.seleniumpm.Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

public abstract class WebPage {

    protected Selenium sel;
    protected String path = "";
    protected long pageWaitTime = 30000;
    protected long elementWaitTime = 10000;

    public WebPage(Selenium sel) {
        this.sel = sel;
    }

    public WebPage(Selenium sel, String path) {
        this.sel = sel;
        this.path = path;
    }

    public void open() throws URISyntaxException {
        sel.openRelativePath(path);
    }

    public void close() {
        sel.close();
    }

    public void quit() {
        sel.quit();
    }

    public void open(String uri) {
        sel.open(uri);
    }

    public String getTitle() {
        return sel.getTitle();
    }

    public WebPage waitForTitle(String title) {
        WebDriver driver = sel.getDriver();
        final String ftitle = title.toLowerCase();
        (new WebDriverWait(driver, TimeUnit.MILLISECONDS.toSeconds(elementWaitTime))).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith(ftitle);
            }
        });
        return this;
    }

    public abstract WebPage waitForPageLoad();

    public abstract void validate();
}
