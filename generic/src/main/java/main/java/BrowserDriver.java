package main.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BrowserDriver {




        public static WebDriver driver = null;

        @Parameters({/*"useCloudEnv","cloudEnvName", */"os", "os_version", "browserName", "browserVersion", "url"})
        @BeforeMethod
        public void setUp(/*@Optional("false") boolean useCloudEnv, @Optional("false") String cloudEnvName,*/
                @Optional("windows") String os, @Optional("10") String os_version, @Optional("firefox") String browserName, @Optional("34")
                String browserVersion, @Optional("https://www.google.com") String url) throws IOException {
            getLocalDriver(browserName, os);
            driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS); // 20
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS); //35
            driver.get(url);
            driver.manage().window().maximize();
        }



        public WebDriver getLocalDriver(String browserName, String os) {
            if (browserName.equalsIgnoreCase("chrome")) {
                if (os.equalsIgnoreCase("windows")) {
                    System.setProperty("webdriver.chrome.driver", "../generic/driver/chromedriver.exe");
                    driver = new ChromeDriver();
                } else if (os.equalsIgnoreCase("mac")) {
                    System.setProperty("webdriver.chrome.driver", "../generic/driver/chromedriver.exe");
                    driver = new ChromeDriver();
                }
            } else if (browserName.equalsIgnoreCase("firefox")) {
                if (os.equalsIgnoreCase("windows")) {
                    System.setProperty("webdriver.gecko.driver", "../generic/driver/geckodriver.exe");
                    driver = new ChromeDriver();
                } else if (os.equalsIgnoreCase("mac")) {
                    System.setProperty("webdriver.gecko.driver", "../generic/driver/geckodriver.exe");
                    driver = new ChromeDriver();
                }
            }
            return driver;
        }

        @AfterMethod
        public void closeOut() throws InterruptedException {
            driver.manage().deleteAllCookies();
            Thread.sleep(2000);
            driver.close();
//            driver.quit();
        }


            public static WebDriver  getDriver()
            {
                return driver;
            }
            /**
             * This method returns the url.
             *
             * @return Returns the string.
             */
            public static String getUrl()
            {
                return driver.getCurrentUrl();
    }


}

