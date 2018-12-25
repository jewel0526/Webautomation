package com.selenium.project.test;

import com.selenium.project.pages.HomePageLogin;
import main.java.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageLoginTest  extends BrowserDriver {


    /**
     *
     */
    HomePageLogin objLogin = null;

    @BeforeMethod
    public void initializationOfElements() {

        objLogin = PageFactory.initElements(driver, com.selenium.project.pages.HomePageLogin.class);
    }

        @Test(priority = 7)
    public void loginTest() {
        objLogin.loginfunc();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}

