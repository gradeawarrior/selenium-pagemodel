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

import org.apache.commons.lang.NotImplementedException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown extends Element {
    protected Select select = null;

    public Dropdown(WebDriver driver, By locator) {
        super(driver, locator);
    }

    protected void instantiateSelect() {
        if (select == null) {
            select = new Select(driver.findElement(locator));
        }
    }

    public int countOptions() {
        // TODO - Need to implement a way to get and modify the original locator to append '/option' (Assuming xpath)
        throw new NotImplementedException();
    }

    public Dropdown selectByVisibleText(String txt) {
        instantiateSelect();
        select.selectByVisibleText(txt);
        return this;
    }

    public Dropdown selectByIndex(int index) {
        instantiateSelect();
        select.selectByIndex(index);
        return this;
    }
}
