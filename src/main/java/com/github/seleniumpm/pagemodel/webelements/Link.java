package com.github.seleniumpm.pagemodel.webelements;

import com.github.seleniumpm.Selenium;

public class Link extends Element {

    public Link(Selenium sel, Object locator) {
        super(sel, locator);
    }

    public void click() {
        click(true);
    }

    public void click(boolean checkVisible) {
        if (checkVisible) {
            waitForPresentAndVisible();
        } else {
            waitForPresent();
        }
        sel.click(locator);
    }
}
