package org.hotel.article.pages;

import org.hotel.article.utils.TestHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends AbstractPage{
    private WebDriver driver;

    @FindBy(xpath = "//span[text()='Article']")
    private WebElement articleMenuLink;

    @FindBy(xpath = "//li[@class='ui-widget ui-menuitem ui-corner-all ui-menu-parent ui-menuitem-active']//span[text()='New']")
    private WebElement newMenuLink;

    @FindBy(xpath = "//li[@class='ui-widget ui-menuitem ui-corner-all ui-menu-parent ui-menuitem-active']//span[text()='Hotel']")
    private WebElement newHotelMenuLink;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean isHomePageLoad(){
        return new TestHelper(driver).isPageLoad();
    }
    public NewHotelPage openNewHotelPage(){
        Actions move = new Actions(driver);
        move.moveToElement(articleMenuLink).moveToElement(newMenuLink).moveToElement(newHotelMenuLink).click().build().perform();
        return new NewHotelPage(driver);
    }
}
