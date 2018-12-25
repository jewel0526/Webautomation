package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

    public class SearchItem extends BrowserDriver {

        @FindBy(how = How.NAME, using = "keywords")
        private WebElement searchItemBox;

        public String SearchItem ()
        {
            searchItemBox.sendKeys("Toner", Keys.ENTER);
            String actualText = driver.findElement(By.partialLinkText("Brother TN431bk Toner")).getText();
            return actualText;
        }


    }




