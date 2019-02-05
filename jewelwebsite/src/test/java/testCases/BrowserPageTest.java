package testCases;

import com.vasya.BrowsePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserPageTest extends BrowsePage {

    BrowsePage browsePage=null;


    @BeforeMethod
    public void initializationOfElements() {

       browsePage= PageFactory.initElements(driver, BrowsePage.class);

    }

    @Test
    public void BrosTestR() throws InterruptedException {
        browsePage.setClickOnBroswer();

        browsePage.productVerification();
        Assert.assertEquals(browsePage.productVerification(), "Authentication Fee");
        //driver.navigate().back();


    }



}
