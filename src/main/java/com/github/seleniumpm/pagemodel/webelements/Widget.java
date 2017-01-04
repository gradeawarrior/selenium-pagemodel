package com.github.seleniumpm.pagemodel.webelements;

import com.github.seleniumpm.Selenium;
import org.apache.commons.lang.NotImplementedException;

public class Widget extends Element {

    public Widget(Selenium sel, Object locator) {
        super(sel, locator);
    }

    public void click() {
        waitForPresentAndVisible();
        sel.click(locator);
    }

    public void validate() {
        throw new NotImplementedException();
    }
}
