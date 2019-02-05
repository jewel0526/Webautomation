package testCases;

import com.vasya.NewsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewsPageTest extends NewsPage {
    NewsPage objNewPage=null;
    @BeforeMethod
    public void initializationOffElements(){


        objNewPage=PageFactory.initElements(driver, NewsPage.class);
    }

    @Test(priority = 0)
    public void setNewstest() throws InterruptedException {
        objNewPage.newsClicksAre();


            String actualErrorMsg =NewsPage.getErroMessage();

            Assert.assertEquals(actualErrorMsg, "Sign up to receive StockX news & information");

    }

    @Test(priority = 1)
    public void back(){
        objNewPage.returnToNewsPage();



    }

}
