package org.hotel.article.pages.enums;

public enum CityEnum {
    KYIV("Kyiv"),
    LVIV("Lviv"),
    KHARKIV("Kharkiv"),
    DNIPROPETROVSK("Dnipropetrovsk"),
    ODESA("Odesa"),
    DONETSK("Donetsk"),
    ZAPORIZHIA("Zaporizhia"),
    KRYVYI_RIH("Kryvyi Rih"),
    MYKOLAIV("Mykolaiv"),
    NEW_YORK("New York"),
    LOS_ANGELES("Los Angeles"),
    CHICAGO("Chicago"),
    PHILADELPHIA("Philadelphia"),
    PHOENIX("Phoenix"),
    DALLAS("Dallas"),
    SAN_JOSE("San Jose"),
    INDIANAPOLIS("Indianapolis"),
    SAN_FRANCISCO("San Francisco"),
    DETROIT("Detroit"),
    BIRMINGHAM("Birmingham"),
    CAMBRIDGE("Cambridge"),
    CHESTER("Chester"),
    DERBY("Derby"),
    HEREFORD("Hereford"),
    LEEDS("Leeds"),
    LIVERPOOL("Liverpool"),
    MANCHESTER("Manchester"),
    LONDON("London"),
    NEWCASTLE("Newcastle");
    private String name;

    CityEnum(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
