
package com.vasya;

import main.java.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static ApplicationPagebasee.ApplicationPageBase.*;

public class BrowsePage extends BrowserDriver {

    @FindBy(xpath = "//li[@class='dropdown browse-dropdown']//a[contains(text(),'Browse')]")
    WebElement brow;
    @FindBy(xpath = "//a[contains(text(),'Sneakers')]")
    private WebElement clicksneakers;
    @FindBy(xpath = "//div[contains(text(),'Streetwear')]")
    WebElement streetwear;
    @FindBy(xpath = "//button[@title='Featured']")
    WebElement dropdown;
    @FindBy(xpath = "//span[contains(text(),'Most Popular')]")
    WebElement mostpopular;
    @FindBy(xpath = "//img[@alt='Supreme Steiff Bear Heather Grey']")
    WebElement bear;


    @FindBy(xpath = "//div[@class='market-summary']//h2[contains(text(),'Buy')]")
    WebElement buyBear;

    @FindBy(xpath = "//button[@class='button right-button button-green']")
    WebElement understand;

   @FindBy(name = "ask-amount")
   WebElement placebid;

   @FindBy(xpath = "//div[contains(text(),'Authentication Fee')]")
   WebElement fee;

   @FindBy(xpath = "//button[@class='button right-button button button-green']")
   WebElement next;

@FindBy(xpath = "//h1[@class='proxima-heading']")
WebElement beartext;




    public void setClickOnBroswer() throws InterruptedException {
        Actions mouse = new Actions(driver);
        mouse.moveToElement(brow).build().perform();
       /* clicksneakers.click();
        streetwear.click();
        dropdown.click();
        mostpopular.click();
        bear.click();
        buyBear.click();*/
        click(clicksneakers, "clicksneakers");
        click(streetwear,"streetwear");
        click(dropdown, "dropdown");
        click(mostpopular, "mostpopular");
        click(bear, "bear");
        click(buyBear, "buyBear");
        click(understand, "understand");
        sendKeys(placebid, "placebid", "250");



        Thread.sleep(2000);

    }
    public String productVerification() {
        String actualText=  getText(fee,"fee");


        return actualText;
    }

    /*public String bearVerification(){
        click(next, "next");
        String verification = getText(beartext, "beartext");
                return verification;
    }
*/



}

