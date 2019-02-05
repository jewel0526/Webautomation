package com.vasya;

import ApplicationPagebasee.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends ApplicationPageBase {

public static String loginEmail = "jeweldaaBoss";
public static String loginPassword= "ahamedhs23";


    @FindBy(xpath = "//a[@id='nav-login']")
    WebElement loginClick;

    @FindBy(name = "email")
    private WebElement username;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(xpath = "//button[@class='button right-button button-green']")
    private WebElement loginbutton;

    @FindBy(xpath = "//div[@class='center-text']")
    WebElement errorMessage;

    @FindBy(xpath = "//h3[contains(text(),'Welcome back')]")
    private  WebElement WlcmMsg;



    public Loginpage loginIngredient(String email, String passwordd) {

        click(loginClick, "loginclick");
        sendKeys(username, "emailBox", email);

        sendKeys(password, "passwordbox", passwordd);
        click(loginbutton, "loginbutton");
        return new Loginpage();
    }


    public String getErroMessage(){
        click(loginClick, "loginclick");
        String actualText = getText(errorMessage,"errorMessage");
        return actualText;

    }



public  String verifyWlcmMsg(){
    click(loginClick, "loginclick");
    String msg= getText(WlcmMsg, "WlcmMsg");
    return msg;

}


}



