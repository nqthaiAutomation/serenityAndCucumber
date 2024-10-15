package com.example.common;

import io.cucumber.java.After;
import net.serenitybdd.core.annotations.events.AfterScenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class PageObject extends net.serenitybdd.core.pages.PageObject {

    public void switchWindow() {
        Set<String> handles = getDriver().getWindowHandles();
        String handle = getDriver().getWindowHandle();
        for (String nextHandle : handles) {
            if (!nextHandle.equals(handle)) {
                getDriver().switchTo().window(nextHandle);
            }
        }
    }

    public void inputToElement(String xPathElement, String value) {
        getElement(xPathElement).clear();
        getElement(xPathElement).sendKeys(value);
    }

    public WebElement getElement(String xPathElement) {
        return getDriver().findElement(By.xpath(xPathElement));
    }

    @After
    public void endTheAct() {
        if (getDriver() != null) {
            getDriver().quit();
        }


    }

}