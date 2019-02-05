package com.vasya;

import main.java.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static ApplicationPagebasee.ApplicationPageBase.click;
import static ApplicationPagebasee.ApplicationPageBase.getText;
import static ApplicationPagebasee.ApplicationPageBase.sendKeys;

public class HomePage extends BrowserDriver {

        // private WebDriver driver;
        @FindBy(xpath = "//div[@class='categorySwitcher__Switcher-sc-1ewtudg-0 dhVmlK']/div[1]")
        private WebElement ClickSneakers;
         @FindBy(xpath = "//div[@class='big ']")
         private WebElement bigDarkText;

        @FindBy(how = How.ID, using = "home-search")
        private WebElement searchBox;

        @FindBy(xpath = "//div[@class='browse-all']")
        private WebElement browserAll;

        @FindBy(xpath = "//div[contains(text(),'Handbags')]")
        private WebElement handbags;
        @FindBy(xpath = "//a[@class='close-btn']")
        private WebElement closeBtn;

        @FindBy(xpath = "//button[@id='dropdown-button-']")
        private WebElement dropclick;

        @FindBy(xpath = "//span[@class='text'][contains(text(),'New Lowest Asks')]")
        private WebElement LowestAsk;

         @FindBy(xpath = "//div[@class='categoryOption']//div[contains(text(),'Gucci')]")
         private WebElement gucci;
         @FindBy(xpath = "//div[@class='categoryOption']//div[contains(text(),'Chanel')]")
         private WebElement chanel;
         @FindBy(xpath = "//div[@class='categoryOption']//div[contains(text(),'Hermes')]")
         private WebElement hermes;
         @FindBy(xpath = "//div[@class='categoryOption']//div[contains(text(),'Louis Vuitton')]")
         private WebElement LouisV;

        @FindBy(xpath = "//div[@class='categoryOption']//div[contains(text(),'Balenciaga')]")
        private WebElement Balenciaga;
        @FindBy(xpath ="//h1[@class='category-h1']" )
        private WebElement verifybtn;

        @FindBy(xpath = "//a[@class='header-image']//h2[1]")
        private WebElement verifyDiscountmsg;



        public String VerifyDarkMsg(){
click(ClickSneakers,"ClickSneakers");
            String TheText= getText(bigDarkText, "bigDarkText");
            return TheText;
        }



        public void search (){

           sendKeys( searchBox,"searchBox","sneakers");
           click(browserAll, "browserAll");
            click(handbags, "handbags");
            click(closeBtn,"closeBtn");
            click(dropclick, "dropclick");
            click(LowestAsk, "LowestAsk");
            click(gucci, "gucci");
            click(chanel,"chanel");
            click(hermes,"hermes");
            click(LouisV, "LouisV");
            click(Balenciaga, "Balenciaga");
           //click(totalSold, "totalSold");

        }



        public String getVerifiedbtn(){
            String actualText= getText(verifybtn, "verifybtn");
                    return actualText;

        }


        public String verifiyDiscnt(){

            String discountText= getText(verifyDiscountmsg, "verifyDiscountmsg");
            return discountText;
        }



    }


