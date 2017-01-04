package com.github.seleniumpm.pagemodel.webelements;

import com.github.seleniumpm.Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Table extends Element {

    public Table(Selenium sel, Object locator) {
        super(sel, locator);
    }

    public List<WebElement> getRows() {
        return sel.getElements(By.xpath("//tbody/tr"));
    }

    public int countRows() {
        return getRows().size();
    }
}
