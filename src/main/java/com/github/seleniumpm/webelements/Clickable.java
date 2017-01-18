package com.github.seleniumpm.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Clickable extends Element {

    public Clickable(WebDriver driver, By locator) {
        super(driver, locator);
    }

    public void click() {
        click(false);
    }

    public void click(boolean checkVisible) {
        if (checkVisible) {
            waitForPresentAndVisible();
        }
        driver.findElement(locator).click();
    }
}
