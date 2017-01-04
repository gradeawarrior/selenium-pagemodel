package com.github.seleniumpm.pagemodel.webelements;

import com.github.seleniumpm.Selenium;
import org.apache.commons.lang.NotImplementedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown extends Element {
    protected Select select = null;

    public DropDown(Selenium sel, Object locator) {
        super(sel, locator);
    }

    protected void instantiateSelect() {
        if (select == null) {
            select = new Select((WebElement) sel.getElement(locator));
        }
    }

    public int countOptions() {
        // TODO - Need to implement a way to get and modify the original locator to append '/option' (Assuming xpath)
        throw new NotImplementedException();
    }

    public DropDown selectByVisibleText(String txt) {
        instantiateSelect();
        select.selectByVisibleText(txt);
        return this;
    }

    public DropDown selectByIndex(int index) {
        instantiateSelect();
        select.selectByIndex(index);
        return this;
    }
}
