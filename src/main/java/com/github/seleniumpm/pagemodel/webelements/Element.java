package com.github.seleniumpm.pagemodel.webelements;

import com.github.seleniumpm.Selenium;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.IllegalLocatorException;
import org.openqa.selenium.NotFoundException;

public class Element {

    protected Selenium sel;
    protected Object locator;
    protected int waitTime = 10000;

    public Element(Selenium sel, Object locator) {
        this.sel = sel;
        this.locator = locator;
    }

    public Object getLocator() {
        return locator;
    }

    public boolean isVisible() {
        return sel.isVisible(locator);
    }

    public boolean isDisplayed() {
        return sel.isDisplayed(locator);
    }

    public boolean isEnabled() {
        return sel.isEnabled(locator);
    }

    public boolean isSelected() {
        return sel.isSelected(locator);
    }

    public boolean isPresent() { return sel.isPresent(locator);}

    public boolean isPresentAndVisible() {
        return sel.isPresent(locator) && sel.isVisible(locator);
    }

    public Element present() throws NotFoundException {
        if (!sel.isPresent(locator))
            throw new NotFoundException("locator='" + locator + "' was not found!");
        return this;
    }

    public Element visible() throws ElementNotVisibleException {
        if (!sel.isVisible(locator))
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
        sel.waitForPresent(locator, waitTime);
        return this;
    }

    public Element waitForVisible(int waitTime) {
        sel.waitForVisible(locator, waitTime);
        return this;
    }

    public Element waitForPresent() {
        return waitForPresent(waitTime);
    }

    public Element waitForVisible() {
        return waitForVisible(waitTime);
    }

    public Element waitForPresentAndVisible(long waitTime) {
        sel.waitForPresentAndVisible(locator, waitTime);
        return this;
    }

    public Element waitForPresentAndVisible() {
        return waitForPresentAndVisible(waitTime);
    }
}
