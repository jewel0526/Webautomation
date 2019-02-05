package testCases;

import com.vasya.AboutPage;
import main.java.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutPageTest extends BrowserDriver {

    AboutPage aboutPage=null;

    @BeforeMethod
    public void initializationOfElements(){

       aboutPage= PageFactory.initElements(driver, AboutPage.class);

    }

    @Test
    public void clicksTest() throws InterruptedException {

   aboutPage.about();
        Assert.assertEquals(aboutPage.verifyReviws(), "WHAT PEOPLE ARE SAYING ABOUT US");

        Assert.assertEquals(aboutPage.pngVerification(), true);
    }



}
