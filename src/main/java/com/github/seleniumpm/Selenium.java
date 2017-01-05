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

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.URISyntaxException;
import java.util.List;

/**
 * Interface to normalize between Selenium 1.0 and 2.0 (WebDriver). Ultimately, this makes it simple to do migration
 * between the original Selenium and using WebDriver.
 */
public interface Selenium extends com.thoughtworks.selenium.Selenium {
    public WebDriver getDriver();

    public void openRelativePath(String path) throws URISyntaxException;

    public void quit();

    public Selenium click(Object locator);

    public Selenium clickAndWait(Object locator);

    public boolean isPresent(Object locator);

    public boolean isVisible(Object locator);

    public boolean isDisplayed(Object locator);

    public boolean isEnabled(Object locator);

    public boolean isSelected(Object locator);

    public Selenium waitForPresent(Object locator);

    public Selenium waitForPresent(Object locator, long waitTime);

    public Selenium waitForVisible(Object locator);

    public Selenium waitForVisible(Object locator, long waitTime);

    public Selenium waitForPresentAndVisible(Object locator);

    public Selenium waitForPresentAndVisible(Object locator, long waitTime);

    public Selenium waitForPageToLoad();

    public Selenium waitForPageToLoad(long timeout);

    public Selenium type(Object locator, String txt);

    public Selenium clear(Object locator);

    public String getText(Object locator);

    public Object getElement(Object locator);

    public List<WebElement> getElements(Object locator);

    public long getPageTimeout();

    public long getElementTimeout();
}
