package com.github.seleniumpm;

import org.apache.commons.lang.NotImplementedException;
import org.openqa.selenium.*;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumWebdriver extends RemoteWebDriver implements Selenium {
    protected WebDriver driver;
    protected URI baseURI;
    protected long elementTimeout = 10000;
    protected long pageTimeout = 30000;

    public SeleniumWebdriver(WebDriver driver) {
        this.driver = driver;
        this.baseURI = null;
        setTimeouts();
    }

    public SeleniumWebdriver(WebDriver driver, URI baseURI) {
        this.driver = driver;
        this.baseURI = baseURI;
        setTimeouts();
    }

    protected void setTimeouts() {
        driver.manage().timeouts().implicitlyWait(elementTimeout, TimeUnit.MILLISECONDS);
        if (!(driver instanceof HtmlUnitDriver))
            driver.manage().timeouts().pageLoadTimeout(pageTimeout, TimeUnit.MILLISECONDS);
    }

    public void setExtensionJs(String s) {
        throw new NotImplementedException();
    }

    public void start() {
        throw new NotImplementedException();
    }

    public void start(String s) {
        throw new NotImplementedException();
    }

    public void start(Object o) {
        throw new NotImplementedException();
    }

    public void stop() {
        throw new NotImplementedException();
    }

    public void showContextualBanner() {
        throw new NotImplementedException();
    }

    public void showContextualBanner(String s, String s1) {
        throw new NotImplementedException();
    }

    public void click(String s) {
        throw new NotImplementedException();
    }

    public void doubleClick(String s) {
        throw new NotImplementedException();
    }

    public void contextMenu(String s) {
        throw new NotImplementedException();
    }

    public void clickAt(String s, String s1) {
        throw new NotImplementedException();
    }

    public void doubleClickAt(String s, String s1) {
        throw new NotImplementedException();
    }

    public void contextMenuAt(String s, String s1) {
        throw new NotImplementedException();
    }

    public void fireEvent(String s, String s1) {
        throw new NotImplementedException();
    }

    public void focus(String s) {
        throw new NotImplementedException();
    }

    public void keyPress(String s, String s1) {
        throw new NotImplementedException();
    }

    public void shiftKeyDown() {
        throw new NotImplementedException();
    }

    public void shiftKeyUp() {
        throw new NotImplementedException();
    }

    public void metaKeyDown() {
        throw new NotImplementedException();
    }

    public void metaKeyUp() {
        throw new NotImplementedException();
    }

    public void altKeyDown() {
        throw new NotImplementedException();
    }

    public void altKeyUp() {
        throw new NotImplementedException();
    }

    public void controlKeyDown() {
        throw new NotImplementedException();
    }

    public void controlKeyUp() {
        throw new NotImplementedException();
    }

    public void keyDown(String s, String s1) {
        throw new NotImplementedException();
    }

    public void keyUp(String s, String s1) {
        throw new NotImplementedException();
    }

    public void mouseOver(String s) {
        throw new NotImplementedException();
    }

    public void mouseOut(String s) {
        throw new NotImplementedException();
    }

    public void mouseDown(String s) {
        throw new NotImplementedException();
    }

    public void mouseDownRight(String s) {
        throw new NotImplementedException();
    }

    public void mouseDownAt(String s, String s1) {
        throw new NotImplementedException();
    }

    public void mouseDownRightAt(String s, String s1) {
        throw new NotImplementedException();
    }

    public void mouseUp(String s) {
        throw new NotImplementedException();
    }

    public void mouseUpRight(String s) {
        throw new NotImplementedException();
    }

    public void mouseUpAt(String s, String s1) {
        throw new NotImplementedException();
    }

    public void mouseUpRightAt(String s, String s1) {
        throw new NotImplementedException();
    }

    public void mouseMove(String s) {
        throw new NotImplementedException();
    }

    public void mouseMoveAt(String s, String s1) {
        throw new NotImplementedException();
    }

    public void type(String s, String s1) {
        throw new NotImplementedException();
    }

    public void typeKeys(String s, String s1) {
        throw new NotImplementedException();
    }

    public void setSpeed(String s) {
        throw new NotImplementedException();
    }

    public String getSpeed() {
        throw new NotImplementedException();
    }

    public String getLog() {
        throw new NotImplementedException();
    }

    public void check(String s) {
        throw new NotImplementedException();
    }

    public void uncheck(String s) {
        throw new NotImplementedException();
    }

    public void select(String s, String s1) {
        throw new NotImplementedException();
    }

    public void addSelection(String s, String s1) {
        throw new NotImplementedException();
    }

    public void removeSelection(String s, String s1) {
        throw new NotImplementedException();
    }

    public void removeAllSelections(String s) {
        throw new NotImplementedException();
    }

    public void submit(String s) {
        throw new NotImplementedException();
    }

    public void open(String s, String s1) {
        throw new NotImplementedException();
    }

    public void open(String s) {
        driver.navigate().to(s);
    }

    public void openWindow(String s, String s1) {
        throw new NotImplementedException();
    }

    public void selectWindow(String s) {
        throw new NotImplementedException();
    }

    public void selectPopUp(String s) {
        throw new NotImplementedException();
    }

    public void deselectPopUp() {
        throw new NotImplementedException();
    }

    public void selectFrame(String s) {
        throw new NotImplementedException();
    }

    public boolean getWhetherThisFrameMatchFrameExpression(String s, String s1) {
        throw new NotImplementedException();
    }

    public boolean getWhetherThisWindowMatchWindowExpression(String s, String s1) {
        throw new NotImplementedException();
    }

    public void waitForPopUp(String s, String s1) {
        throw new NotImplementedException();
    }

    public void chooseCancelOnNextConfirmation() {
        throw new NotImplementedException();
    }

    public void chooseOkOnNextConfirmation() {
        throw new NotImplementedException();
    }

    public void answerOnNextPrompt(String s) {
        throw new NotImplementedException();
    }

    public void goBack() {
        throw new NotImplementedException();
    }

    public void refresh() {
        throw new NotImplementedException();
    }

    public void close() {
        driver.close();
    }

    public void quit() {
        driver.quit();
    }

    public boolean isAlertPresent() {
        throw new NotImplementedException();
    }

    public boolean isPromptPresent() {
        throw new NotImplementedException();
    }

    public boolean isConfirmationPresent() {
        throw new NotImplementedException();
    }

    public String getAlert() {
        throw new NotImplementedException();
    }

    public String getConfirmation() {
        throw new NotImplementedException();
    }

    public String getPrompt() {
        throw new NotImplementedException();
    }

    public String getLocation() {
        throw new NotImplementedException();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public String getBodyText() {
        throw new NotImplementedException();
    }

    public String getValue(String s) {
        throw new NotImplementedException();
    }

    public String getText(String s) {
        throw new NotImplementedException();
    }

    public void highlight(String s) {
        throw new NotImplementedException();
    }

    public String getEval(String s) {
        throw new NotImplementedException();
    }

    public boolean isChecked(String s) {
        throw new NotImplementedException();
    }

    public String getTable(String s) {
        throw new NotImplementedException();
    }

    public String[] getSelectedLabels(String s) {
        throw new NotImplementedException();
    }

    public String getSelectedLabel(String s) {
        throw new NotImplementedException();
    }

    public String[] getSelectedValues(String s) {
        throw new NotImplementedException();
    }

    public String getSelectedValue(String s) {
        throw new NotImplementedException();
    }

    public String[] getSelectedIndexes(String s) {
        throw new NotImplementedException();
    }

    public String getSelectedIndex(String s) {
        throw new NotImplementedException();
    }

    public String[] getSelectedIds(String s) {
        throw new NotImplementedException();
    }

    public String getSelectedId(String s) {
        throw new NotImplementedException();
    }

    public boolean isSomethingSelected(String s) {
        throw new NotImplementedException();
    }

    public String[] getSelectOptions(String s) {
        throw new NotImplementedException();
    }

    public String getAttribute(String s) {
        throw new NotImplementedException();
    }

    public boolean isTextPresent(String s) {
        throw new NotImplementedException();
    }

    public boolean isElementPresent(String s) {
        throw new NotImplementedException();
    }

    public boolean isVisible(String s) {
        throw new NotImplementedException();
    }

    public boolean isEditable(String s) {
        throw new NotImplementedException();
    }

    public String[] getAllButtons() {
        throw new NotImplementedException();
    }

    public String[] getAllLinks() {
        throw new NotImplementedException();
    }

    public String[] getAllFields() {
        throw new NotImplementedException();
    }

    public String[] getAttributeFromAllWindows(String s) {
        throw new NotImplementedException();
    }

    public void dragdrop(String s, String s1) {
        throw new NotImplementedException();
    }

    public void setMouseSpeed(String s) {
        throw new NotImplementedException();
    }

    public Number getMouseSpeed() {
        throw new NotImplementedException();
    }

    public void dragAndDrop(String s, String s1) {
        throw new NotImplementedException();
    }

    public void dragAndDropToObject(String s, String s1) {
        throw new NotImplementedException();
    }

    public void windowFocus() {
        throw new NotImplementedException();
    }

    public void windowMaximize() {
        throw new NotImplementedException();
    }

    public String[] getAllWindowIds() {
        throw new NotImplementedException();
    }

    public String[] getAllWindowNames() {
        throw new NotImplementedException();
    }

    public String[] getAllWindowTitles() {
        throw new NotImplementedException();
    }

    public String getHtmlSource() {
        throw new NotImplementedException();
    }

    public void setCursorPosition(String s, String s1) {
        throw new NotImplementedException();
    }

    public Number getElementIndex(String s) {
        throw new NotImplementedException();
    }

    public boolean isOrdered(String s, String s1) {
        throw new NotImplementedException();
    }

    public Number getElementPositionLeft(String s) {
        throw new NotImplementedException();
    }

    public Number getElementPositionTop(String s) {
        throw new NotImplementedException();
    }

    public Number getElementWidth(String s) {
        throw new NotImplementedException();
    }

    public Number getElementHeight(String s) {
        throw new NotImplementedException();
    }

    public Number getCursorPosition(String s) {
        throw new NotImplementedException();
    }

    public String getExpression(String s) {
        throw new NotImplementedException();
    }

    public Number getXpathCount(String s) {
        throw new NotImplementedException();
    }

    public Number getCssCount(String s) {
        throw new NotImplementedException();
    }

    public void assignId(String s, String s1) {
        throw new NotImplementedException();
    }

    public void allowNativeXpath(String s) {
        throw new NotImplementedException();
    }

    public void ignoreAttributesWithoutValue(String s) {
        throw new NotImplementedException();
    }

    public void waitForCondition(String s, String s1) {
        throw new NotImplementedException();
    }

    public void setTimeout(String s) {
        throw new NotImplementedException();
    }

    public void waitForPageToLoad(String s) {
        throw new NotImplementedException();
    }

    public void waitForFrameToLoad(String s, String s1) {
        throw new NotImplementedException();
    }

    public String getCookie() {
        throw new NotImplementedException();
    }

    public String getCookieByName(String s) {
        throw new NotImplementedException();
    }

    public boolean isCookiePresent(String s) {
        throw new NotImplementedException();
    }

    public void createCookie(String s, String s1) {
        throw new NotImplementedException();
    }

    public void deleteCookie(String s, String s1) {
        throw new NotImplementedException();
    }

    public void deleteAllVisibleCookies() {
        throw new NotImplementedException();
    }

    public void setBrowserLogLevel(String s) {
        throw new NotImplementedException();
    }

    public void runScript(String s) {
        throw new NotImplementedException();
    }

    public void addLocationStrategy(String s, String s1) {
        throw new NotImplementedException();
    }

    public void captureEntirePageScreenshot(String s, String s1) {
        throw new NotImplementedException();
    }

    public void rollup(String s, String s1) {
        throw new NotImplementedException();
    }

    public void addScript(String s, String s1) {
        throw new NotImplementedException();
    }

    public void removeScript(String s) {
        throw new NotImplementedException();
    }

    public void useXpathLibrary(String s) {
        throw new NotImplementedException();
    }

    public void setContext(String s) {
        throw new NotImplementedException();
    }

    public void attachFile(String s, String s1) {
        throw new NotImplementedException();
    }

    public void captureScreenshot(String s) {
        throw new NotImplementedException();
    }

    public String captureScreenshotToString() {
        throw new NotImplementedException();
    }

    public String captureNetworkTraffic(String s) {
        throw new NotImplementedException();
    }

    public void addCustomRequestHeader(String s, String s1) {
        throw new NotImplementedException();
    }

    public String captureEntirePageScreenshotToString(String s) {
        throw new NotImplementedException();
    }

    public void shutDownSeleniumServer() {
        throw new NotImplementedException();
    }

    public String retrieveLastRemoteControlLogs() {
        throw new NotImplementedException();
    }

    public void keyDownNative(String s) {
        throw new NotImplementedException();
    }

    public void keyUpNative(String s) {
        throw new NotImplementedException();
    }

    public void keyPressNative(String s) {
        throw new NotImplementedException();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void openRelativePath(String path) throws URISyntaxException {
        // TODO - URIBuilder is URLEncoding '#'
        // URI uri = (new URIBuilder(baseURI)).setPath(path).build();
        String uri = baseURI + path;
        open(uri.toString());
    }

    public Selenium click(Object by) {
        driver.findElement((By) by).click();
        return this;
    }

    public Selenium clickAndWait(Object by) {
        throw new NotImplementedException("clickAndWait is only availablein Selenium 1.0");
    }

    public boolean isPresent(Object locator) {
        try {
            // TODO - Apparently setting to 0 does not actually trigger a timeout immediately.
            waitForPresent(locator, 0);
            this.driver.findElement((By) locator);
            return true;
        } catch (TimeoutException e) {
            return false;
        } catch (NotFoundException e) {
            return false;
        }
    }

    public boolean isVisible(Object locator) {
        try {
            // TODO - Apparently setting to 0 does not actually trigger a timeout immediately.
            waitForVisible(locator, 0);
            return true;
        } catch (TimeoutException e) {
            return false;
        } catch (NotFoundException e) {
            return false;
        }
    }

    public boolean isDisplayed(Object locator) {
        return this.driver.findElement((By) locator).isDisplayed();
    }

    public boolean isEnabled(Object locator) {
        return driver.findElement((By) locator).isEnabled();
    }

    public boolean isSelected(Object locator) {
        return driver.findElement((By) locator).isSelected();
    }

    public Selenium waitForPresent(Object by) {
        return waitForPresent(by, elementTimeout);
    }

    public Selenium waitForPresent(Object by, long waitTime) {
        WebDriverWait wait = new WebDriverWait(driver, TimeUnit.MILLISECONDS.toSeconds(waitTime));
        wait.until(ExpectedConditions.presenceOfElementLocated((By) by));
        return this;
    }

    public Selenium waitForVisible(Object by) {
        return waitForVisible(by, elementTimeout);
    }

    public Selenium waitForVisible(Object by, long waitTime) {
        WebDriverWait wait = new WebDriverWait(driver, waitTime);
        wait.until(ExpectedConditions.visibilityOfElementLocated((By) by));
        return this;
    }

    public Selenium waitForPresentAndVisible(Object by) {
        return waitForPresentAndVisible(by, TimeUnit.MILLISECONDS.toSeconds(elementTimeout));
    }

    public Selenium waitForPresentAndVisible(Object by, long waitTime) {
        return waitForPresent(by, waitTime).waitForVisible(by, waitTime);
    }

    public Selenium waitForPageToLoad() {
        throw new NotImplementedException("waitForPageToLoad() is only available in Selenium 1.0");
    }

    public Selenium waitForPageToLoad(long timeout) {
        throw new NotImplementedException();
    }

    public Selenium type(Object locator, String txt) {
        driver.findElement((By) locator).sendKeys(txt);
        return this;
    }

    public Selenium clear(Object locator) {
        driver.findElement((By) locator).clear();
        return this;
    }

    public String getText(Object locator) {
        return driver.findElement((By) locator).getText();
    }

    public Object getElement(Object locator) {
        return driver.findElement((By) locator);
    }

    public List<WebElement> getElements(Object locator) {
        return driver.findElements((By) locator);
    }

    public long getPageTimeout() {
        return pageTimeout;
    }

    public long getElementTimeout() {
        return elementTimeout;
    }
}
