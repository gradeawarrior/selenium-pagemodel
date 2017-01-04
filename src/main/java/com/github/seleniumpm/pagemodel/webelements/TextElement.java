package com.github.seleniumpm.pagemodel.webelements;

import com.github.seleniumpm.Selenium;

public class TextElement extends Element {

    public TextElement(Selenium sel, Object locator) {
        super(sel, locator);
    }

    public String getText() {
        return sel.getText(locator);
    }
}
