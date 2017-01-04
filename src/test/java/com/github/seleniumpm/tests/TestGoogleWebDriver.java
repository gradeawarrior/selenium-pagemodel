package com.github.seleniumpm.tests;

import com.github.seleniumpm.Selenium;
import com.github.seleniumpm.SeleniumWebdriver;
import com.github.seleniumpm.tests.testlib.GooglePageWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

/**
 * This is a sample Google test using a combination of the Selenium WebDriver example and the included PageObject
 * implementation. For the original Google Webdriver example, see: http://www.seleniumhq.org/docs/03_webdriver.jsp
 */
public class TestGoogleWebDriver {

    @Test
    public void testSearchGoogle() throws MalformedURLException, InterruptedException, URISyntaxException {
        String server = System.getProperty("selenium.server", "http://localhost:4444") + "/wd/hub";
        String google_url = System.getProperty("google.url", "http://www.google.com");
        WebDriver browser = null;

        try {
            // Specifying where the tests will run will be based on URL
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName("firefox");
            browser = new RemoteWebDriver(new URL(server), capabilities);
            Selenium sel = new SeleniumWebdriver(browser, new URI(google_url));
            GooglePageWebDriver google = new GooglePageWebDriver(sel);
            String searchTerm = "Cheese!";

            // Open Gurukula

            // And now use this to visit Google
            google.open();

            // Enter something to search for
            google.searchField.type(searchTerm);

            // Now submit the form. WebDriver will find the form for us from the element
            google.searchField.submit();

            // Check the title of the page
            String title = google.getTitle();
            System.out.println("Page title is: " + title);
            // Should see: "cheese! - Google Search"
            title = google.waitForTitle(searchTerm).getTitle();
            System.out.println("Page title is: " + title);
            Assert.assertEquals(title, searchTerm + " - Google Search", "Expecting the title to be the same as the search term");
            google.validate();
        } finally {
            //Close the browser
            if (browser != null)
                browser.quit();
        }
    }
}
