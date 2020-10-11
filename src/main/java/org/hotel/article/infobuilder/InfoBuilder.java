package org.hotel.article.infobuilder;

import org.hotel.article.pages.enums.CountryEnum;

public class InfoBuilder {
        private String nameText;
        private CountryEnum country;
        private String dataOfConstruction;

        public InfoBuilder(){

        }
        public InfoBuilder(String nameText, String dataOfConstruction, CountryEnum country){
            this.nameText =nameText;
            this.dataOfConstruction=dataOfConstruction;
            this.country =country;
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

        public InfoBuilder build() {
            return new InfoBuilder(nameText, dataOfConstruction, country);}
    }

