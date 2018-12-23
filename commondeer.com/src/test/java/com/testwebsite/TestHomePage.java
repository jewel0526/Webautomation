package com.testwebsite;

import base.BrowserDriver;
import com.pagewebsite.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    HomePage objHomePage = null;

    @BeforeMethod

    public void initializationOfElements(){
        objHomePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test

    public void searchTest(){
        String ActualText = objHomePage.searchBtn();
        Assert.assertEquals(ActualText,"Unfortunately, we are no longer accepting shipped online orders for delivery by Christmas. Cut off was 12.19 at 3 pm EST.  ");
        System.out.println("Test Passed");
    }
}
