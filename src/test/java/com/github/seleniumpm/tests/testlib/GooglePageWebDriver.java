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

package com.github.seleniumpm.tests.testlib;

import com.github.seleniumpm.Selenium;
import com.github.seleniumpm.pagemodel.WebPage;
import com.github.seleniumpm.pagemodel.webelements.TextField;
import org.apache.commons.lang.NotImplementedException;
import org.openqa.selenium.By;

public class GooglePageWebDriver extends WebPage {
    public TextField searchField;

    public GooglePageWebDriver(Selenium sel) {
        super(sel);
        searchField = new TextField(sel, By.name("q"));
    }

    public WebPage waitForPageLoad() {
        throw new NotImplementedException("This isn't implemented yet!");
    }

    public void validate() {
        searchField.waitForPresentAndVisible();
    }
}
