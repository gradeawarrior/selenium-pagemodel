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

package com.github.seleniumpm;

import com.google.common.base.Preconditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.ConnectException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

public abstract class WebPage {

    protected WebDriver driver;
    protected URI server = null;
    protected String path = "";
    protected long pageWaitTime = 30000;
    protected long elementWaitTime = 10000;

    public WebPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebPage(WebDriver driver, URI server) {
        this.driver = driver;
        this.server = server;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public void open() {
        Preconditions.checkNotNull(server, "server was not specified!");
        String newURL = server.getScheme() + "://" + server.getHost() + ":" + server.getPort() + path;
        open(newURL);
    }

    public void open(String url) {
        driver.navigate().to(url);
    }

    public void close() {
        driver.close();
    }

    public void quit() {
        driver.quit();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public WebPage waitForTitle(String title) {
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
