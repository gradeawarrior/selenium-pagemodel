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

import com.thoughtworks.selenium.DefaultSelenium;
import org.apache.commons.lang.NotImplementedException;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * This is a very quick wrapper around the original DefaultSelenium implementation.
 */
@Deprecated
public class Selenium10 extends DefaultSelenium implements Selenium {

    protected long elementWaitTime = 10000;
    protected long pageWaitTime = 30000;
    protected long sleepTimeInMilis = 1000;

    public Selenium10(String serverHost, int serverPort, String browserStartCommand, String browserURL) {
        super(serverHost, serverPort, browserStartCommand, browserURL);
        super.setTimeout(Long.toString(elementWaitTime));
    }

    public WebDriver getDriver() {
        throw new UnsupportedOperationException("getDriver is only available in Selenium WebDriver!");
    }

    public void openRelativePath(String path) {
        throw new UnsupportedOperationException("openRelative is not available in Selenium 1.0!");
    }

    public void quit() {
        super.close();
    }

    public Selenium click(Object locator) {
        super.click((String) locator);
        return this;
    }

    public Selenium clickAndWait(Object locator) {
        return click(locator).waitForPageToLoad();
    }

    public Selenium waitForPresent(Object locator) {
        throw new NotImplementedException();
    }

    public Selenium waitForVisible(Object locator) {
        throw new NotImplementedException();
    }

    public Selenium waitForPresentAndVisible(Object locator) {
        return waitForPresent(locator).waitForVisible(locator);
    }

    public Selenium waitForPresent(Object locator, long waitTime) throws NotFoundException {
        long currentTime = System.nanoTime();
        long endTime = currentTime + TimeUnit.MILLISECONDS.toNanos(elementWaitTime);

        while (currentTime <= endTime) {
            if (isPresent(locator))
                return this;
            try {
                Thread.sleep(sleepTimeInMilis);
            } catch (InterruptedException ie) {
                throw new NotFoundException("An InterruptedException occured!");
            }
            currentTime = System.nanoTime();
        }
        throw new NotFoundException(locator + "was not found in " + elementWaitTime + "ms!");
    }

    public Selenium waitForVisible(Object locator, long waitTime) throws NotFoundException {
        long currentTime = System.nanoTime();
        long endTime = currentTime + TimeUnit.MILLISECONDS.toNanos(elementWaitTime);

        while (currentTime <= endTime) {
            if (isVisible(locator))
                return this;
            try {
                Thread.sleep(sleepTimeInMilis);
            } catch (InterruptedException ie) {
                throw new NotFoundException("An InterruptedException occured!");
            }
            currentTime = System.nanoTime();
        }
        throw new NotFoundException(locator + "was not visible in " + elementWaitTime + "ms!");
    }

    public Selenium waitForPresentAndVisible(Object locator, long waitTime) {
        throw new NotImplementedException();
    }

    public Selenium waitForPageToLoad(long timeout) {
        super.waitForPageToLoad(Long.toString(timeout));
        return this;
    }

    public Selenium waitForPageToLoad() {
        super.waitForPageToLoad(Long.toString(pageWaitTime));
        return this;
    }

    public Selenium type(Object locator, String txt) {
        super.type((String) locator, txt);
        return this;
    }

    public Selenium clear(Object locator) {
        throw new NotImplementedException();
    }

    public String getText(Object locator) {
        return super.getText(locator.toString());
    }

    public Object getElement(Object locator) {
        throw new UnsupportedOperationException("getElement is not available in Selenium 1.0!");
    }

    public List<WebElement> getElements(Object locator) {
        throw new UnsupportedOperationException("getElements is not available in Selenium 1.0!");
    }

    public long getPageTimeout() {
        return pageWaitTime;
    }

    public long getElementTimeout() {
        return elementWaitTime;
    }

    public boolean isPresent(Object locator) {
        return super.isElementPresent((String) locator);
    }

    public boolean isVisible(Object locator) {
        return super.isVisible((String) locator);
    }

    public boolean isDisplayed(Object locator) {
        throw new UnsupportedOperationException("isDisplayed is not available in Selenium 1.0!");
    }

    public boolean isEnabled(Object locator) {
        throw new UnsupportedOperationException("isEnabled is not available in Selenium 1.0!");
    }

    public boolean isSelected(Object locator) {
        throw new UnsupportedOperationException("isSelected is not available in Selenium 1.0!");
    }

    public boolean isPresentAndVisible(Object locator) {
        return isPresent(locator) && isVisible(locator);
    }

}
