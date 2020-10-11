package org.hotel.article.utils;

import java.io.InputStream;
import java.util.Properties;

public final class PropertyUtil {

    public static Properties loadProperties(String propertyFile)  {
        Properties config = new Properties();
        InputStream input;
        try {
            input = PropertyUtil.class.getClassLoader().getResourceAsStream(propertyFile);
            config.load(input);
        } catch (Exception e) {
        }
        return config;
    }

}
