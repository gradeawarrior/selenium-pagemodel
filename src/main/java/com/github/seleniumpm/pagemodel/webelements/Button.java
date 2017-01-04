package com.github.seleniumpm.pagemodel.webelements;

import com.github.seleniumpm.Selenium;

public class Button extends Element {

    public Button(Selenium sel, Object locator) {
        super(sel, locator);
    }

    public void click() {
        waitForPresentAndVisible();
        sel.click(locator);
    }

    public boolean isEnabled() {
        waitForPresentAndVisible();
        return sel.isEnabled(locator);
    }
}
