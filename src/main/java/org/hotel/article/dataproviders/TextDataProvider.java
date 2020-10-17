package org.hotel.article.dataproviders;

import org.hotel.article.infobuilder.InfoBuilder;
import org.hotel.article.pages.enums.CityEnum;
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

    @DataProvider
    public Object[][] validCityNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterCountry(CountryEnum.UKRAINE)
                        .enterCity(CityEnum.LVIV)
                        .build()},
                {new InfoBuilder()
                        .enterCountry(CountryEnum.UK)
                        .enterCity(CityEnum.LIVERPOOL)
                        .build()},
                {new InfoBuilder()
                        .enterCountry(CountryEnum.USA)
                        .enterCity(CityEnum.PHOENIX)
                        .build()}
        };
    }

    @DataProvider
    public Object[][] editShortDescriptionNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterShortDescriptionText("Malibu Hotel is the best hotel!!!")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] alphanumericCharactersShortDescriptionNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterShortDescriptionText("Malibu Hotel has 5 stars!!")
                        .build()},
                {new InfoBuilder()
                        .enterShortDescriptionText("252525")
                        .build()},
                {new InfoBuilder()
                        .enterShortDescriptionText("MALIBU")
                        .build()},
                {new InfoBuilder()
                        .enterShortDescriptionText("malibu2000")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] editDescriptionNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterDescriptionText("Malibu Hotel is the best hotel, the beach is the best on the island!!!")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] alphanumericCharactersDescriptionNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterDescriptionText("Malibu Hotel has 5 stars and some info plus!!")
                        .build()},
                {new InfoBuilder()
                        .enterDescriptionText("252525 24322")
                        .build()},
                {new InfoBuilder()
                        .enterDescriptionText("MALIBU AND SOME INFO PLUS")
                        .build()},
                {new InfoBuilder()
                        .enterDescriptionText("malibu2000 and some info plus")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] editNotesNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterNotesText("Malibu Hotel is the best hotel, the beach is the best on the island!!!")
                        .build()}

        };
    }

    @DataProvider
    public Object[][] alphanumericCharactersNotesNewHotelData() {
        return new Object[][]{
                {new InfoBuilder()
                        .enterNotesText("Malibu Hotel has 5 stars and some info plus!!")
                        .build()},
                {new InfoBuilder()
                        .enterNotesText("252525 24322")
                        .build()},
                {new InfoBuilder()
                        .enterNotesText("MALIBU AND SOME INFO PLUS")
                        .build()},
                {new InfoBuilder()
                        .enterNotesText("malibu2000 and some info plus")
                        .build()}

        };
    }


}
