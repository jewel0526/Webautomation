package testCases;

import com.vasya.HomePage;
import main.java.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BrowserDriver {

    HomePage objOfHomePage = null;


    @BeforeMethod
    public void initializationOfElements() {

        objOfHomePage = PageFactory.initElements(driver, HomePage.class);

    }

    @Test(priority = 0)
    public void CheckDarkMsg(){
objOfHomePage.VerifyDarkMsg();
        Assert.assertEquals(objOfHomePage.VerifyDarkMsg(), "BUY AND SELL AUTHENTIC SNEAKERS");
      //  WebElement myDynamicElement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("usrUTils")));
    }

    @Test
    public void searchTest (){

        objOfHomePage.search();
Assert.assertEquals(objOfHomePage.getVerifiedbtn(),"Balenciaga");

Assert.assertEquals(objOfHomePage.verifiyDiscnt(),"SIGN UP NOW AND GET \n" +
        "$50 OFF \n" +
        "YOUR FIRST \n" +
        "HANDBAG PURCHASE");

    }




}