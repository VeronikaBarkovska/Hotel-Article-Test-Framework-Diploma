package org.hotel.article.pages;

import org.hotel.article.infobuilder.InfoBuilder;
import org.hotel.article.pages.enums.CountryEnum;
import org.hotel.article.utils.TestHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class NewHotelPage extends AbstractPage{
    private WebDriver driver;

    @FindBy(xpath = "//form[@id='add_hotel']")
    private WebElement dataSectionForm;

    @FindBy(xpath = "//span[text()='Save']")
    private WebElement saveBtn;

    @FindBy(xpath = "//input[@id='add_hotel:name']")
    private WebElement nameFld;

    @FindBy(xpath = "//input[@id='add_hotel:dateOfConstruction_input']")
    private WebElement dateOfConstructionFld;

    @FindBy(xpath = "//label[@id='add_hotel:country_label']")
    private WebElement countryFld;

    @FindBy(xpath = "//label[@for='add_hotel:name']/span")
    private WebElement asteriskNameFld;

    @FindBy(xpath = "//label[@for='add_hotel:dateOfConstruction_input']/span")
    private WebElement asteriskDateOfConstructionFld;

    @FindBy(xpath = "//label[@for='add_hotel:country_input']/span")
    private WebElement asteriskCountryFld;

    @FindBy(xpath = "//span[@class='ui-message-error-detail' and contains(text(),'Name')]")
    private WebElement alertMessageName;

    @FindBy(xpath = "//label[@class='ui-outputlabel ui-widget ui-state-error' and contains(text(),'Global Rating:')]")
    private WebElement alertMessageGlobalRating;

    @FindBy(xpath = "//span[@class='ui-message-error-detail' and contains(text(),'Date')]")
    private WebElement alertMessageDateOfConstruction;

    @FindBy(xpath = "//span[@class='ui-message-error-detail' and contains(text(),'Country')]")
    private WebElement alertMessageCountry;

    @FindBy(xpath = "//div[@id='add_hotel:rate']")
    private WebElement globalRateFld;

    @FindBy(xpath = "(//div[@id='add_hotel:rate']/div)[1]")
    private WebElement globalRateCancelBtn;

    @FindBy(xpath = "(//div[@id='add_hotel:rate']/div)[2]")
    private WebElement globalRateOneStarBtn;

    @FindBy(xpath = "(//div[@id='add_hotel:rate']/div)[3]")
    private WebElement globalRateTwoStarsBtn;

    @FindBy(xpath = "(//div[@id='add_hotel:rate']/div)[4]")
    private WebElement globalRateThreeStarsBtn;

    @FindBy(xpath = "(//div[@id='add_hotel:rate']/div)[5]")
    private WebElement globalRateFourStarsBtn;

    @FindBy(xpath = "(//div[@id='add_hotel:rate']/div)[6]")
    private WebElement globalRateFiveStarsBtn;

    @FindBy(xpath = "//span[@class='ui-button-icon-left ui-icon ui-icon-calendar']")
    private WebElement dateDropDownBtn;

    @FindBy(xpath = "//td[@data-year='2020' and @data-month='9']/a[contains(text(),'10')]")
    private WebElement specialDateFromCalendar;

    @FindBy(xpath = "(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[1]")
    private WebElement countryDropDownBtn;


    public NewHotelPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public boolean isNewHotelPageLoad(){
        return new TestHelper(driver).isPageLoad();
    }
    public boolean isDataSectionIsDispalyed(){
        return new TestHelper(driver).waitUntilElementIsDisplayed(dataSectionForm).isDisplayed();
    }
    public boolean isSaveButtonIsDispalyed(){
        return new TestHelper(driver).waitUntilElementIsDisplayed(saveBtn).isDisplayed();
    }
    public boolean isNameFldIsDispalyed(){
        return new TestHelper(driver).waitUntilElementWillBeClickable(nameFld).isDisplayed();
    }
    public boolean isAsteriskNameFldIsDispalyed(){
        return new TestHelper(driver).waitUntilElementIsDisplayed(asteriskNameFld).isDisplayed();
    }
    public void fillNameFld (String text){
        new TestHelper(driver).waitUntilElementWillBeClickable(nameFld).sendKeys(text);
    }
    public void enterNameFld(InfoBuilder info){
        fillNameFld(info.getNameText());
    }
    public String nameTextIsDisplayed(){
      return nameFld.getAttribute("value");
    }
    public boolean isAlertMessageNameDisplayed(){
        new TestHelper(driver).isPageLoad();
        return new TestHelper(driver).waitUntilElementIsDisplayed(alertMessageName).isDisplayed();
    }
    public boolean isNotAlertMessageNameDisplayed(){
        new TestHelper(driver).isPageLoad();
        try
        {
            if(alertMessageName.isDisplayed())
            {
                return false;
            }
            return false;
        }
        catch(Exception e)
        {
            System.out.println("No element displayed");
            return true;
        }
    }

    public boolean globalRateFldIsDisplayed(){
        return new TestHelper(driver).waitUntilElementIsDisplayed(globalRateFld).isDisplayed();
    }
    public void clickSaveBtn(){
        new TestHelper(driver).waitUntilElementWillBeClickable(saveBtn).click();
    }

    public void clickGlobalRateCancelBtn(){
        new TestHelper(driver).waitUntilElementWillBeClickable(globalRateCancelBtn).click();
    }
    public void clickGlobalRateOneStarBtn(){
        new TestHelper(driver).waitUntilElementWillBeClickable(globalRateOneStarBtn).click();
    }
    public void clickGlobalRateTwoStarsBtn(){
        new TestHelper(driver).waitUntilElementWillBeClickable(globalRateTwoStarsBtn).click();
    }
    public void clickGlobalRateThreeStarsBtn(){
        new TestHelper(driver).waitUntilElementWillBeClickable(globalRateThreeStarsBtn).click();
    }
    public void clickGlobalRateFourStarsBtn(){
        new TestHelper(driver).waitUntilElementWillBeClickable(globalRateFourStarsBtn).click();
    }
    public void clickGlobalRateFiveStarsBtn(){
        new TestHelper(driver).waitUntilElementWillBeClickable(globalRateFiveStarsBtn).click();
    }

    public boolean checkGlobalRate(){
        clickGlobalRateOneStarBtn();
        clickGlobalRateTwoStarsBtn();
        clickGlobalRateThreeStarsBtn();
        clickGlobalRateFourStarsBtn();
        clickGlobalRateCancelBtn();
        clickGlobalRateFiveStarsBtn();
        return new TestHelper(driver).waitUntilElementIsDisplayed(globalRateFiveStarsBtn).isEnabled();
    }

    public boolean isNotAlertMessageGlobalRateDisplayed(){
        new TestHelper(driver).isPageLoad();
        try
        {
            if(alertMessageGlobalRating.isDisplayed())
            {
                return false;
            }
            return false;
        }
        catch(Exception e)
        {
            System.out.println("No element displayed");
            return true;
        }
    }

    public boolean isDataOfConstructionFldIsDispalyed() {
        return new TestHelper(driver).waitUntilElementWillBeClickable(dateOfConstructionFld).isDisplayed();
    }

    public boolean isAsteriskDateOfConstructionFldIsDispalyed(){
        return new TestHelper(driver).waitUntilElementIsDisplayed(asteriskDateOfConstructionFld).isDisplayed();
    }
    public void fillDataOfConstructionFld (String text){
        new TestHelper(driver).waitUntilElementWillBeClickable(dateOfConstructionFld).sendKeys(text);
    }
    public void enterDataOfConstructionFld(InfoBuilder info){
        fillDataOfConstructionFld(info.getDataOfConstruction());
    }

    public String dataOfConstructionTextIsDisplayed(){
        return dateOfConstructionFld.getAttribute("value");
    }

    public boolean isAlertMessageDateOfConstructionDisplayed(){
        new TestHelper(driver).isPageLoad();
        return new TestHelper(driver).waitUntilElementIsDisplayed(alertMessageDateOfConstruction).isDisplayed();
    }

    public void clickDateDropDownBtn(){
        new TestHelper(driver).waitUntilElementWillBeClickable(dateDropDownBtn).click();
    }

    public void selectDateOfConstruction(InfoBuilder info){
        enterDataOfConstructionFld(info);
        Actions move = new Actions(driver);
        clickDateDropDownBtn();
        move.moveToElement(new TestHelper(driver).waitUntilElementIsDisplayed(specialDateFromCalendar)).click();
    }

    public boolean isNotAlertMessageDateOfConstructionDisplayed(){
        new TestHelper(driver).isPageLoad();
        try
        {
            if(alertMessageDateOfConstruction.isDisplayed())
            {
                return false;
            }
            return false;
        }
        catch(Exception e)
        {
            System.out.println("No element displayed");
            return true;
        }
    }

    public void clickCountryDropDownListBtn(){
        new TestHelper(driver).waitUntilElementWillBeClickable(countryDropDownBtn).click();
    }

    public void selectCountryDropDownList(InfoBuilder infoBuilder){
        clickCountryDropDownListBtn();
        List<WebElement> options = driver.findElements(By.xpath("(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[1]/li"));
        for (WebElement opt : options) {
            if (opt.getText().equals(infoBuilder.getCountry().getName())) {
                opt.click();
                return;
            }
        }
        throw new NoSuchElementException("Can't find " + infoBuilder + " in dropdown");
    }

    public boolean isCountryFldIsDispalyed() {
        return new TestHelper(driver).waitUntilElementWillBeClickable(countryFld).isDisplayed();
    }

    public boolean isAsteriskCountryFldIsDispalyed(){
        return new TestHelper(driver).waitUntilElementIsDisplayed(asteriskCountryFld).isDisplayed();
    }
    public boolean isAlertMessageCountryDisplayed(){
        new TestHelper(driver).isPageLoad();
        return new TestHelper(driver).waitUntilElementIsDisplayed(alertMessageCountry).isDisplayed();
    }
    public boolean isNotAlertMessageCountryDisplayed(){
        new TestHelper(driver).isPageLoad();
        try
        {
            if(alertMessageCountry.isDisplayed())
            {
                return false;
            }
            return false;
        }
        catch(Exception e)
        {
            System.out.println("No element displayed");
            return true;
        }
    }

    public String countryTextIsDisplayed(){
        return countryFld.getText();
    }

}
