package com.vasya;

import main.java.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static ApplicationPagebasee.ApplicationPageBase.click;
import static ApplicationPagebasee.ApplicationPageBase.getText;
import static ApplicationPagebasee.ApplicationPageBase.sendKeys;

public class NewsPage extends BrowserDriver {
  //  public static String emailforSub= "jewel123@yahoo.com";


    @FindBy(xpath = "//a[@href='https://stockx.com/outsole']")
    WebElement clickOnNews;

    @FindBy(xpath = "//ul[@class='blog-nav__verticals']//li[1]")
    WebElement clickOnSneakers;

    @FindBy(xpath = "//ul[@class='blog-nav__verticals']//li[2]")
    private WebElement streetWearAds;
    @FindBy(xpath = "//ul[@class='blog-nav__verticals']//li[3]")
    private WebElement watchAds;
    @FindBy(xpath = "//ul[@class='blog-nav__verticals']//li[4]")
    private WebElement handbagsAds;


    @FindBy(xpath = "//a[@class='blog-nav__subscribe-link icon-fa js-subscribe']")
    WebElement clickSubscribeMe;
    @FindBy(xpath = "//input[@name='email']")
    WebElement typeTheEmail;
    @FindBy(xpath = "//div[@class='form pg-subscribe__form']//input[@value='Subscribe']")
    WebElement clickSub;

    @FindBy(xpath = "//div[@class='pg-subscribe__header-description']")
    static
    WebElement textError;

    @FindBy(xpath = "//a[@class='pg-header-bar__link icon-fa js-close-subscribe']")
    private static WebElement BackToNewsPage;


    public void newsClicksAre() throws InterruptedException {

      click(clickOnNews, "clickOnNews");

        click(clickOnSneakers, "clickOnSneakers");

        click(streetWearAds, "streetWearAds");
        click(watchAds,"watchAds");
        click(handbagsAds, "handbagsAds");
        click(clickSubscribeMe,"clickSubscribeMe");
        sendKeys(typeTheEmail, "typeTheEmail", "jewel@yahoo.com");
        click(clickSub, "clickSub");


        Thread.sleep(3000);

    }

    public static String getErroMessage(){

        String actualText = getText(textError,"textError");

        return actualText;
    }

    public void returnToNewsPage(){
        click(clickOnNews, "clickOnNews");
        click(clickSubscribeMe,"clickSubscribeMe");

        click(BackToNewsPage, "BackToNewsPage");
    }

}
