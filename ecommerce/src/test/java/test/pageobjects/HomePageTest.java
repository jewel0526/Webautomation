package test.pageobjects;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class HomePageTest extends BrowserDriver {

   HomePage objOfHomePage = null;

    @BeforeMethod
    public void initializationOfElements() {

    objOfHomePage = PageFactory.initElements(driver, HomePage.class);
    }

    @Test
    public void searchTest (){

    String actualText = objOfHomePage.search();
    Assert.assertEquals(actualText, "Kensington SP17 17\" Classic Laptop Sleeve");
    System.out.println("HomePage Search - Test Passed");

    }
}
