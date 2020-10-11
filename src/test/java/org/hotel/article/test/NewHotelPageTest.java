package org.hotel.article.test;

import org.hotel.article.dataproviders.TextDataProvider;
import org.hotel.article.infobuilder.InfoBuilder;
import org.hotel.article.pages.HomePage;
import org.hotel.article.pages.NewHotelPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewHotelPageTest extends BaseTest{

    private HomePage homePage;
    private NewHotelPage newHotelPage;
    private InfoBuilder infoBuilder;

    @BeforeMethod
    public void initPages(){
        homePage = new HomePage(driver);
    }


    @Test
    public void verifyThatNewHotelPageIsDisplayed(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        Assert.assertTrue(newHotelPage.isNewHotelPageLoad(),"Verify that Register new Hotel page is displayed when user selects Article->New->Hotel");
    }
     @Test
    public void verifyThatDataSectionIsDisplayed(){
         homePage.isHomePageLoad();
         newHotelPage = homePage.openNewHotelPage();
         Assert.assertTrue(newHotelPage.isDataSectionIsDispalyed(),"Verify that Data section is displayed on Register new Hotel");
     }

    @Test
    public void verifyThatSaveButtonIsDisplayed(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        Assert.assertTrue(newHotelPage.isSaveButtonIsDispalyed(),"Verify that save button is displayed on Register new Hotel");
    }
    @Test
    public void verifyThatNameFldIsDisplayed(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        Assert.assertTrue(newHotelPage.isNameFldIsDispalyed(),"Verify that Name field is displayed in Data section of Register new Hotel page");
    }

    @Test
    public void verifyThatAsteriskNameFldIsDisplayed(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        Assert.assertTrue(newHotelPage.isAsteriskNameFldIsDispalyed(),"Verify that Name field is marked with asterisk");
    }

    @Test(dataProvider = "editNameNewHotelData", dataProviderClass = TextDataProvider.class)
    public void verifyThatNameFldIsEditable(InfoBuilder infoData){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.enterNameFld(infoData);
        Assert.assertEquals(newHotelPage.nameTextIsDisplayed(),infoData.getNameText(),"Verify that Name field is editable");
    }

    @Test(dataProvider = "alphanumericCharactersNameNewHotelData", dataProviderClass = TextDataProvider.class)
    public void verifyThatAlphanumericCharNameFldIsAllowed(InfoBuilder infoData){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.enterNameFld(infoData);
        Assert.assertEquals(newHotelPage.nameTextIsDisplayed(),infoData.getNameText(),"Verify that Name field allows to input alphanumeric characters");
    }

    @Test
    public void verifyThatSaveEmptyNameIsNotPossible(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.clickSaveBtn();
        Assert.assertTrue(newHotelPage.isAlertMessageNameDisplayed(),"Verify that it is not possible to save the empty Name field and a meaningful error message is displayed");
    }

    @Test(dataProvider = "alphanumericCharactersNameNewHotelData", dataProviderClass = TextDataProvider.class)
    public void verifyThatSaveValidNameFldIsPossible(InfoBuilder infoData){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.enterNameFld(infoData);
        newHotelPage.clickSaveBtn();
        Assert.assertTrue(newHotelPage.isNotAlertMessageNameDisplayed(),"Verify that it is possible to save the valid name field");
    }
    @Test
    public void verifyThatGlobalRateFldIsDisplayed(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        Assert.assertTrue(newHotelPage.globalRateFldIsDisplayed(),"Verify that Global Rating field is displayed in Data section of Register new Hotel page");
    }

    @Test
    public void verifyThatGlobalRatingIsAllowed(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        Assert.assertTrue(newHotelPage.checkGlobalRate(),"Verify that Global Rating field allows to rating of the hotel (0-5 stars)");
    }
    @Test
    public void verifyThatSaveEmptyNameIsPossible(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.clickSaveBtn();
        Assert.assertTrue(newHotelPage.isNotAlertMessageGlobalRateDisplayed(),"Verify that it is possible to save the Global Rating field");
    }

    @Test
    public void verifyThatSaveValidGlobalRateFldIsPossible(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.clickGlobalRateFiveStarsBtn();
        newHotelPage.clickSaveBtn();
        Assert.assertTrue(newHotelPage.isNotAlertMessageGlobalRateDisplayed(),"Verify that it is possible to save valid Global Rating field");
    }

    @Test
    public void verifyThatDateOfConstructionFldIsDisplayed(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        Assert.assertTrue(newHotelPage.isDataOfConstructionFldIsDispalyed(),"Verify that Date of Construction field is displayed in Data section of Register new Hotel page");
    }

    @Test
    public void verifyThatAsteriskDateOfConstructionFldIsDisplayed(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        Assert.assertTrue(newHotelPage.isAsteriskDateOfConstructionFldIsDispalyed(),"Verify that Date of Construction field is marked with asterisk");
    }

    @Test
    public void verifyThatDataOfConstructionFldIsEditable(){
        infoBuilder = new InfoBuilder().enterDataOfConstruction("11102020");
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.enterDataOfConstructionFld(infoBuilder);
        Assert.assertEquals(newHotelPage.dataOfConstructionTextIsDisplayed(),infoBuilder.getDataOfConstruction(),"Verify that Date of Construction is editable");
    }

    @Test(dataProvider = "validDataOfConstructionNewHotelData", dataProviderClass = TextDataProvider.class)
    public void verifyThatEnterDataOfConstructionFldIsAllowed(InfoBuilder infoData){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.enterDataOfConstructionFld(infoData);
        Assert.assertEquals(newHotelPage.dataOfConstructionTextIsDisplayed(),infoData.getDataOfConstruction(),"Verify Date of Construction field allows to input in date format");
    }

    @Test
    public void verifyThatSelectDataOfConstructionFldIsAllowed(){
        infoBuilder = new InfoBuilder().enterDataOfConstruction("11.10.2020");
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.selectDateOfConstruction(infoBuilder);
        Assert.assertEquals(newHotelPage.dataOfConstructionTextIsDisplayed(),infoBuilder.getDataOfConstruction(),"Verify Date of Construction field allows to input in date format");
    }


    @Test(dataProvider = "invalidDataOfConstructionNewHotelData", dataProviderClass = TextDataProvider.class)
    public void verifyThatInvalidDataOfConstructionFldIsNotPossible(InfoBuilder infoData){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.enterDataOfConstructionFld(infoData);
        newHotelPage.clickSaveBtn();
        Assert.assertTrue(newHotelPage.isAlertMessageDateOfConstructionDisplayed(),"Verify that it is not possible to save incorrect  date format value Date of Construction field and a meaningful error message is displayed");
    }

    @Test
    public void verifyThatSaveEmptyDateOfConstructionIsNotPossible(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.clickSaveBtn();
        Assert.assertTrue(newHotelPage.isAlertMessageDateOfConstructionDisplayed(),"Verify that it is not possible to save the empty Date of Construction field and a meaningful error message is displayed");
    }

    @Test(dataProvider = "validDataOfConstructionNewHotelData", dataProviderClass = TextDataProvider.class)
    public void verifyThatSaveValidDataOfConstructionFldIsPossible(InfoBuilder infoData){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.enterDataOfConstructionFld(infoData);
        newHotelPage.clickSaveBtn();
        Assert.assertTrue(newHotelPage.isNotAlertMessageDateOfConstructionDisplayed(),"Verify that it is possible to save valid Date of Construction field");
    }

    @Test
    public void verifyThatCountryFldIsDisplayed(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        Assert.assertTrue(newHotelPage.isCountryFldIsDispalyed(),"Verify that Country field is displayed in Data section of Register new Hotel page");
    }

    @Test
    public void verifyThatAsteriskCountryFldIsDisplayed(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        Assert.assertTrue(newHotelPage.isAsteriskCountryFldIsDispalyed(),"Verify that Country fields is marked with asterisk");
    }

    @Test(dataProvider = "validCountryNewHotelData", dataProviderClass = TextDataProvider.class)
    public void verifyThatCountryFldIsEditable(InfoBuilder infoData){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.selectCountryDropDownList(infoData);
        Assert.assertEquals(newHotelPage.countryTextIsDisplayed(),infoData.getCountry().getName(),"Verify that Country field is editable");
    }

    @Test
    public void verifyThatSaveEmptyCountryIsNotPossible(){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.clickSaveBtn();
        Assert.assertTrue(newHotelPage.isAlertMessageCountryDisplayed(),"Verify that it is not possible to save the empty (with default value “Select me’) Country field");
    }

    @Test(dataProvider = "validCountryNewHotelData", dataProviderClass = TextDataProvider.class)
    public void verifyThatSaveValidCountryFldIsPossible(InfoBuilder infoData){
        homePage.isHomePageLoad();
        newHotelPage = homePage.openNewHotelPage();
        newHotelPage.selectCountryDropDownList(infoData);
        newHotelPage.clickSaveBtn();
        Assert.assertTrue(newHotelPage.isNotAlertMessageCountryDisplayed(),"Verify that it is possible to save the valid Country field");
    }





}
