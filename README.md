Selenium-PageModel
==================

This project helps **Test Engineers** by abstracting out the implementation -- in this case Selenium -- from the actual set of **Actions** necessary to perform a single **Test Scenario**. The `Selenium-PageModel` library does this by defining a set of well defined `PageModel` constructs that **Test Engineers** can extend/implement to describe a Website. These `PageModel` constructs includes the following:

1. WebPage
2. Button
3. Checkbox
4. DropDown
6. Link
7. Table
8. TextElement
9. TextField
10. Widget

Using these constructs, you can describe a `WebPage` as having the following web-elements:

1. A Header `Widget` containing:
	* A Home `Link`
	* A Login `Link`
	* A Register `Link`
2. A form `Widget` containing:
	* A username `TextField`
	* A password `TextField`
	* A Submit `Button`
	* A potential Error message `TextElement` (in the event of a login failure)

Once a `PageModel` is defined, a _login test_ for an imaginary website may look like this:

	homePage.open();
	loginPage.waitForPageLoad().validate();
	loginPage.loginForm.userName.type("myuser");
	loginPage.loginForm.password.type("mypassword");
	loginPage.loginForm.submitButton.click();
	homePage.waitForPageLoad().isLoggedIn();

# Prerequisites

* Java 7+
* Maven 3.0.2+

# Installation

Please add the dependency to your `pom.xml`:

		<dependency>
			<groupId>com.github.gradeawarrior</groupId>
			<artifactId>selenium-pagemodel</artifactId>
			<version>2.0</version>
		</dependency>
		
_*NOTE:* Please take a look at the [RELEASE_NOTES.md](https://github.com/gradeawarrior/selenium-pagemodel/blob/master/RELEASE_NOTES.md) for the latest version available at this time_

# Usage

TODO

# Dev Release Instructions

Please see the [RELEASE_SELENIUMPM.md](https://github.com/gradeawarrior/selenium-pagemodel/blob/master/RELEASE_SELENIUMPM.md) documentation for the commands and steps necessary to publish a new build

# Language Support

The Selenium PageModel implementation is not limited to just one language. Here are other language implementations:

* **Python** - [python-seleniumpm](https://github.com/gradeawarrior/python-seleniumpm)
* **Ruby** - In consideration depending on needs and popularity.