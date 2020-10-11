package org.hotel.article.pages;

import org.hotel.article.utils.TestHelper;
import org.openqa.selenium.WebDriver;

public abstract class AbstractPage {
    protected WebDriver driver;

    public boolean isPageLoad(){
        return new TestHelper(driver).isPageLoad();
    }
}
