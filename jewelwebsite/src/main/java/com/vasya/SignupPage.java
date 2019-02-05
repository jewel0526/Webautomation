package com.vasya;

import ApplicationPagebasee.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import static ApplicationPagebasee.ApplicationPageBase.hoverOver;

public class SignupPage extends ApplicationPageBase {
    public static String fname= "jewel";
    public static String Lname= "ahamed";
    public static String Uname= "jeweldaaboss";
    public static String Email="jewel@yahoo.com";
    public static String Pword ="abcd";


    @FindBy(xpath = "//a[@id='nav-signup']")
    WebElement signuptitle;

    @FindBy(name = "firstname")
    WebElement firstName;

    @FindBy(name = "lastname")
    WebElement Lastname;

    @FindBy(name = "username")
    WebElement SignupUserName;
    @FindBy(name="email")
    WebElement SignupEmail;

    @FindBy(name = "password")
    WebElement SignupPassword;

    @FindBy(xpath = "//div[@class='control__indicator']")
    private WebElement checkBox;

    @FindBy(xpath = "//div[@class='vice-btns ']/button[1]")
    private WebElement choices;

    @FindBy(xpath = "//div[@class='button-bar-inner']/button[2]")
    private WebElement Clicksignup;

    @FindBy(xpath = "//button[@class='button left-button button-grey']")
    private WebElement BackText;

    @FindBy(xpath= "//div[@class='center-text']")
    private WebElement errorMessage;




    public void signupTypes() throws InterruptedException {
Actions actionss= new Actions(driver);
        click(signuptitle, "signuptitle");
        sendKeys(firstName, "firstName", "jewel");
        Lastname.sendKeys(Lname);
        SignupEmail.sendKeys(Uname);
        SignupUserName.sendKeys(Email);
        SignupPassword.sendKeys(Pword);
        actionss.moveToElement(checkBox).click().perform();

        actionss.moveToElement(choices).click().perform();

        Clicksignup.click();

       Thread.sleep(5000);

    }

    public String getErroMessage(){

        String actualText = getText(errorMessage,"errorMessage");

        return actualText;
    }


public  String verifyBack(){
    click(signuptitle, "signuptitle");
        String nameText= getText(BackText, "BackText");
                return nameText;
}

}
