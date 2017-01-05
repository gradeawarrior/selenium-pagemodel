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

package com.github.seleniumpm.pagemodel.webelements;

import com.github.seleniumpm.Selenium;
import org.openqa.selenium.By;

public class TextField extends Element {

    public TextField(Selenium sel, Object locator) {
        super(sel, locator);
    }

    public void type(String txt) {
        sendKeys(txt);
    }

    public TextField clear() {
        sel.clear(locator);
        return this;
    }

    public void sendKeys(String txt) {
        waitForPresentAndVisible();
        sel.type(locator, txt);
    }

    public void submit() {
        waitForPresentAndVisible();
        sel.getDriver().findElement((By) locator).submit();
    }
}
