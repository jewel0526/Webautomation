package test.pageobjects;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.SearchItem;

public class SearchItemTest extends BrowserDriver {

        SearchItem objOfSearchItem = null;

        @BeforeMethod
        public void initializationOfElements() {

        objOfSearchItem = PageFactory.initElements(driver, SearchItem.class); }

        @Test
        public void searchTest() {

            String actualText = objOfSearchItem.search();
            Assert.assertEquals(actualText, "Brother TN431bk Toner");
            System.out.println("SearchItem - Test Passed");

        }
    }

