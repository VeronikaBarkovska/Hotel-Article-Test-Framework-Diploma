package org.hotel.article.infobuilder;

import org.hotel.article.pages.enums.CityEnum;
import org.hotel.article.pages.enums.CountryEnum;

public class InfoBuilder {
        private String nameText;
        private CountryEnum country;
        private String dataOfConstruction;
        private CityEnum city;
        private String shortDescriptionText;
        private String descriptionText;
        private String notesText;

        public InfoBuilder(){

        }
        public InfoBuilder(String nameText, String dataOfConstruction, CountryEnum country, CityEnum city, String shortDescriptionText, String descriptionText, String notesText){
            this.nameText = nameText;
            this.dataOfConstruction = dataOfConstruction;
            this.country = country;
            this.city = city;
            this.shortDescriptionText = shortDescriptionText;
            this.descriptionText = descriptionText;
            this.notesText = notesText;
        }

    public CountryEnum getCountry() {
        return country;
    }

    public void setCountry(CountryEnum country) {
        this.country = country;
    }

    public String getNameText() {
        return nameText;
    }

    public void setNameText(String nameText) {
        this.nameText = nameText;
    }

    public String getDataOfConstruction() {
        return dataOfConstruction;
    }

    public void setDataOfConstruction(String dataOfConstruction) {
        this.dataOfConstruction = dataOfConstruction;
    }

    public String getShortDescriptionText() {
        return shortDescriptionText;
    }

    public void setShortDescriptionText(String shortDescriptionText) {
        this.shortDescriptionText = shortDescriptionText;
    }

    public String getDescriptionText() {
        return descriptionText;
    }

    public void setDescriptionText(String descriptionText) {
        this.descriptionText = descriptionText;
    }

    public CityEnum getCity() {
        return city;
    }

    public void setCity(CityEnum city) {
        this.city = city;
    }

    public String getNotesText() {
        return notesText;
    }

    public void setNotesText(String notesText) {
        this.notesText = notesText;
    }

    public InfoBuilder enterNameText(String nameText){
            this.nameText = nameText;
            return this;
        }

    public InfoBuilder enterDataOfConstruction(String dataOfConstruction){
        this.dataOfConstruction = dataOfConstruction;
        return this;
    }

    public InfoBuilder enterCountry(CountryEnum country){
        this.country = country;
        return this;
    }

    public InfoBuilder enterCity(CityEnum city){
        this.city = city;
        return this;
    }

    public InfoBuilder enterShortDescriptionText(String shortDescriptionText){
        this.shortDescriptionText = shortDescriptionText;
        return this;
    }

    public InfoBuilder enterDescriptionText(String descriptionText){
        this.descriptionText = descriptionText;
        return this;
    }

    public InfoBuilder enterNotesText(String notesText){
        this.notesText = notesText;
        return this;
    }

        public InfoBuilder build() {
            return new InfoBuilder(nameText, dataOfConstruction, country, city, shortDescriptionText, descriptionText, notesText);}
    }

