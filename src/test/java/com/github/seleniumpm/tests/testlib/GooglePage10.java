package com.github.seleniumpm.tests.testlib;

import com.github.seleniumpm.Selenium;
import com.github.seleniumpm.pagemodel.WebPage;
import com.github.seleniumpm.pagemodel.webelements.TextField;

public class GooglePage10 extends WebPage {
    public TextField searchField;

    public GooglePage10(Selenium sel) {
        super(sel, "http://www.google.com");
        searchField = new TextField(sel, "q");
    }

    public GooglePage10(Selenium sel, String path) {
        super(sel, path);
        searchField = new TextField(sel, "q");
    }

    public WebPage waitForPageLoad() {
        sel.waitForPageToLoad();
        return this;
    }

    public void validate() {
        searchField.waitForPresentAndVisible();
    }
}
