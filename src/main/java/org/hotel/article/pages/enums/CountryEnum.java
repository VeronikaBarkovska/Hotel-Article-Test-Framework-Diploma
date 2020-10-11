package org.hotel.article.pages.enums;

public enum CountryEnum {
    UKRAINE("Ukraine"),
    USA("USA"),
    UK("UK");
    private String name;

    CountryEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
