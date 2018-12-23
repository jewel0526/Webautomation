package com.pagewebsite;

import base.BrowserDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BrowserDriver {


    @FindBy(how = How.XPATH, using = "//a[@class='search']")
    private WebElement searchBox;


    public String searchBtn() {


        searchBox.sendKeys("Shirts");
        String actualTest = searchBox.findElement(By.xpath("//strong")).getText();
        return actualTest;


    }
}
