package org.hotel.article.dataproviders;

import org.hotel.article.infobuilder.InfoBuilder;
import org.hotel.article.pages.enums.CountryEnum;
import org.testng.annotations.DataProvider;

public class TextDataProvider {
    @DataProvider
    public Object[][] editNameNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterNameText("Malibu")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] alphanumericCharactersNameNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterNameText("Malibu")
                        .build()},
                {new InfoBuilder()
                        .enterNameText("Malibu5Star")
                        .build()},
                {new InfoBuilder()
                        .enterNameText("252525")
                        .build()},
                {new InfoBuilder()
                        .enterNameText("MALIBU")
                        .build()},
                {new InfoBuilder()
                        .enterNameText("malibu")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] validDataOfConstructionNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterDataOfConstruction("01.01.1")
                        .build()},
                {new InfoBuilder()
                        .enterDataOfConstruction("31.12.2019")
                        .build()}
        };
    }

    @DataProvider
    public Object[][] invalidDataOfConstructionNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterDataOfConstruction("00.01.1")
                        .build()},
                {new InfoBuilder()
                        .enterDataOfConstruction("31.02.2019")
                        .build()},
                {new InfoBuilder()
                        .enterDataOfConstruction("20.02.3029")
                        .build()}
        };
    }

    @DataProvider
    public Object[][] validCountryNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterCountry(CountryEnum.UKRAINE)
                        .build()},
                {new InfoBuilder()
                        .enterCountry(CountryEnum.UK)
                        .build()},
                {new InfoBuilder()
                        .enterCountry(CountryEnum.USA)
                        .build()}
        };
    }


}
