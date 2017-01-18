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

package com.github.seleniumpm.webelements;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Element {

    protected WebDriver driver;
    protected By locator;
    protected int waitTime = 10000;

    public Element(WebDriver driver, By locator) {
        this.driver = driver;
        this.locator = locator;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public By getLocator() {
        return locator;
    }

    public boolean isVisible() {
        try {
            // TODO - Apparently setting to 0 does not actually trigger a timeout immediately.
            waitForVisible(0);
            return true;
        } catch (TimeoutException e) {
            return false;
        } catch (NotFoundException e) {
            return false;
        }
    }

    public boolean isDisplayed() {
        return driver.findElement(locator).isDisplayed();
    }

    public boolean isEnabled() {
        return driver.findElement(locator).isEnabled();
    }

    public boolean isSelected() {
        return driver.findElement(locator).isSelected();
    }

    public boolean isPresent() {
        try {
            // TODO - Apparently setting to 0 does not actually trigger a timeout immediately.
            waitForPresent(0);
            driver.findElement(locator);
            return true;
        } catch (TimeoutException e) {
            return false;
        } catch (NotFoundException e) {
            return false;
        }
    }

    public boolean isPresentAndVisible() {
        return isPresent() && isVisible();
    }

    public Element present() throws NotFoundException {
        if (!isPresent())
            throw new NotFoundException("locator='" + locator + "' was not found!");
        return this;
    }

    public Element visible() throws ElementNotVisibleException {
        if (!isVisible())
            throw new ElementNotVisibleException("locator='" + locator + "' was not visible!");
        return this;
    }

    public Element presentAndVisible() throws NotFoundException, ElementNotVisibleException {
        return present().visible();
    }

    public Element notPresentAndVisible() throws IllegalLocatorException {
        try {
            presentAndVisible();
            throw new IllegalLocatorException("locator='" + locator + "' was found but expected not to be present!");
        }
        catch (NotFoundException nfe) {
            return this;
        }
        catch (ElementNotVisibleException enve) {
            return this;
        }
    }

    public Element waitForPresent(long waitTime) {
        WebDriverWait wait = new WebDriverWait(driver, TimeUnit.MILLISECONDS.toSeconds(waitTime));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return this;
    }

    public Element waitForVisible(long waitTime) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return this;
    }

    public Element waitForPresent() {
        waitForPresent(waitTime);
        return this;
    }

    public Element waitForVisible() {
        waitForVisible(waitTime);
        return this;
    }

    public Element waitForPresentAndVisible(long waitTime) {
        return waitForPresent(waitTime).waitForVisible(waitTime);
    }

    public Element waitForPresentAndVisible() {
        return waitForPresentAndVisible(waitTime);
    }
}
