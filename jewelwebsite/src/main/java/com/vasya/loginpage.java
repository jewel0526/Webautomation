package com.vasya;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpage extends HomePage{

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


    public void loginIngredient(){




        loginClick.click();
        username.sendKeys(loginEmail);
        password.sendKeys(loginPassword);
        loginbutton.click();
    }





    }



