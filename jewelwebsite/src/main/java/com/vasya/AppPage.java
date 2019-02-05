package com.vasya;

import main.java.BrowserDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static ApplicationPagebasee.ApplicationPageBase.*;

public class AppPage extends BrowserDriver {





    @FindBy(xpath ="//a[@query='[object Object]']" )
     WebElement app;

    @FindBy(xpath = "//input[@type='text']")
    WebElement searchPhoneNumb;

    @FindBy(xpath = "//button[@class='btn btn-success']")
    WebElement send;

    @FindBy(xpath = "//div[@class='text-center white text-app-copy']//h1[1]")
    static
    WebElement erroredmsg;

    @FindBy(xpath = "//img[@alt='phone']")
    WebElement PhoneImg;

    public void searchMobile (){
        click(app, "app");
        sendKeys(searchPhoneNumb, "searchPhoneNumb", "12345678");
        click(send, "send");


    }

    public static String ErroMessage(){

        String actualText = getText(erroredmsg,"erroredmsg");
        return actualText;
    }


    public boolean phoneImgeVerify(){
        boolean display= isDisplayed(PhoneImg, "PhoneImg");
        System.out.println("IPhone picture is verified");
        return display;

    }




}
