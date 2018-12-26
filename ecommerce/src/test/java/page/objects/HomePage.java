package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BrowserDriver {

    @FindBy(how = How.ID, using = "search_text")
    private WebElement searchBox1;

    @FindBy(how = How.PARTIAL_LINK_TEXT, partialLinkText = "Contact Us")
    private WebElement contactUs;
    public void clickContactUs(){
    contactUs.click();
    }

    public String search ()
    {
    searchBox1.sendKeys("Laptop Sleeve", Keys.ENTER);
    String actualText = driver.findElement(By.partialLinkText("Kensington SP17 17\" Classic Laptop Sleeve")).getText();
    return actualText;

    }

}





















/*public HomePage() {
      // BrowserDriver.getUrl());
       // this.driver=BrowserDriver.getDriver();
        PageFactory.initElements(driver, this);
    }
*/