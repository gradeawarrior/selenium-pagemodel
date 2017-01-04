package com.github.seleniumpm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.URISyntaxException;
import java.util.List;

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
