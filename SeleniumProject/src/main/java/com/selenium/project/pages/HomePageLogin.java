package com.selenium.project.pages;

import main.java.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePageLogin extends BrowserDriver {

    public static String loginEmail = "shokat_hasan@yahoo.com";
    public static String loginPassword = "test@1234";

    //page factory - OR

    @FindBy(xpath = "//h1[text()='Log In']")
    private WebElement logInTitle;

    @FindBy(xpath = "//a[@id='nav_login'][1]")
    public WebElement Login;

    @FindBy(name = "username")
    WebElement username;

    @FindBy(name = "password")
    WebElement password;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement loginBtn;

    @FindBy(xpath = "//a[text()='Create Account']")
    WebElement createAccountBtn;

    @FindBy(xpath = "//a[text()='BuyOnlineNow | Office Supply Superstore']")
    WebElement header_logo;


    //Initializing the page objects

    public HomePageLogin(WebElement logInTitle) {
        this.logInTitle = logInTitle;
        PageFactory.initElements(driver, this);
    }


    public void loginfunc() {
        Login.click();
        String Ltitle = logInTitle.getText();
        Assert.assertEquals("LOGIN", Ltitle);
        System.out.println("Title Matched");
        username.sendKeys(loginEmail);
        password.sendKeys(loginPassword);
        loginBtn.click();

    }
}





