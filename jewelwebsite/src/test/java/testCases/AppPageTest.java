package testCases;

import com.vasya.AppPage;
import main.java.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AppPageTest  extends BrowserDriver {
    AppPage objAppPage = null;

    @BeforeMethod
    public void intializaionElements(){
        objAppPage= PageFactory.initElements(driver, AppPage.class);



    }

    @Test
    public void appTest (){

        objAppPage.searchMobile();

        String actualErrorMsg = AppPage.ErroMessage();

        Assert.assertEquals(actualErrorMsg, "GET THE STOCKX APP FOR\n" +
                "IPHONE AND ANDROID");

        Assert.assertEquals(objAppPage.phoneImgeVerify(), true);
    }

}
