package org.hotel.article.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.hotel.article.utils.PropertyUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


    public abstract class BaseTest {
        public WebDriver driver;
        private final Properties config = PropertyUtil.loadProperties("test.properties");

        @BeforeMethod(alwaysRun = true)
        public void setup() {
            WebDriverManager
                    .chromedriver()
                    .version(config.getProperty("chromedriver.version"))
                    .setup();
            driver = new ChromeDriver();

            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();
            driver.get(config.getProperty("baseurl"));
        }


        @AfterMethod
        public void cleanup() {
            if (driver != null) {
                driver.manage().deleteAllCookies();
                this.driver.quit();
            }
        }

    }
