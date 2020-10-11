package org.hotel.article.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestHelper {

    private WebDriver driver;



    public TestHelper(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement waitUntilElementWillBeClickable(WebElement element){
        return new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitUntilElementIsDisplayed(WebElement element){
        return new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
    }

    public boolean isPageLoad(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        return js.executeScript("return document.readyState").equals("complete");
    }

}
