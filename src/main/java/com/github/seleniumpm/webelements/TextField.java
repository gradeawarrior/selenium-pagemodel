/*
 * Copyright 2017 Peter Salas
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.seleniumpm.webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextField extends TextElement {

    public TextField(WebDriver driver, By locator) {
        super(driver, locator);
    }

    public void type(String txt) {
        sendKeys(txt);
    }

    public TextField clear() {
        driver.findElement(locator).clear();
        return this;
    }

    public void sendKeys(String txt) {
        driver.findElement(locator).sendKeys(txt);
    }

    public void submit() {
        driver.findElement(locator).submit();
    }
}
