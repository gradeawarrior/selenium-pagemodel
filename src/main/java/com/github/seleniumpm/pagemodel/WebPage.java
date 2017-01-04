package com.github.seleniumpm.pagemodel;

import com.github.seleniumpm.Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URISyntaxException;
import java.util.concurrent.TimeUnit;

public abstract class WebPage {

    protected Selenium sel;
    protected String path = "";
    protected long pageWaitTime = 30000;
    protected long elementWaitTime = 10000;

    public WebPage(Selenium sel) {
        this.sel = sel;
    }

    public WebPage(Selenium sel, String path) {
        this.sel = sel;
        this.path = path;
    }

    public void open() throws URISyntaxException {
        sel.openRelativePath(path);
    }

    public void close() {
        sel.close();
    }

    public void quit() {
        sel.quit();
    }

    public void open(String uri) {
        sel.open(uri);
    }

    public String getTitle() {
        return sel.getTitle();
    }

    public WebPage waitForTitle(String title) {
        WebDriver driver = sel.getDriver();
        final String ftitle = title.toLowerCase();
        (new WebDriverWait(driver, TimeUnit.MILLISECONDS.toSeconds(elementWaitTime))).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver d) {
                return d.getTitle().toLowerCase().startsWith(ftitle);
            }
        });
        return this;
    }

    public abstract WebPage waitForPageLoad();

    public abstract void validate();
}
