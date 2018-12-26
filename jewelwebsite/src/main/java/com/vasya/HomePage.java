package com.vasya;

import main.java.BrowserDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BrowserDriver {

        // private WebDriver driver;

        @FindBy(how = How.ID, using = "home-search")
        private WebElement searchBox;

        @FindBy(how = How.XPATH, xpath= "//input[@id='page-search-bar']")
        private WebElement contactUs;

        public void clickContactUs(){

            contactUs.click();

        }
        public void search (){

            searchBox.sendKeys("Shoes", Keys.ENTER);

        }


    }


