package com.vasya;
import main.java.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

import static ApplicationPagebasee.ApplicationPageBase.*;


public class AboutPage extends BrowserDriver {

    @FindBy(xpath ="//li[@class='dropdown hidden-xs']//a[contains(text(),'About')]")
    private WebElement hoverAbout;

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'How It Works')]")
    private WebElement HowItWorks;
    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Press')]")
    private WebElement press;

    @FindBy(xpath = "//ul[@class='dropdown-menu']//a[contains(text(),'Reviews')]")
    private WebElement review;

    @FindBy(xpath = "//h1[contains(text(),'WHAT PEOPLE ARE SAYING ABOUT US')]")
    private WebElement PeopleCmnts;

    @FindBy(xpath ="//img[@src='//stockx-assets.imgix.net/reviews/em.png?auto=compress,format']" )
    private WebElement imgPng;




    public void about(){

       hoverOver(hoverAbout, "hoverAbout");
       click(HowItWorks, "HowItWorks");
       click(press, "press");
       click(review, "review");
    }

    public String verifyReviws() {
        String reviewText= getText(PeopleCmnts, "PeopleCmnts");
        return reviewText;

    }
    /*public static boolean isDisplayed(WebElement web,String webName){
        boolean isDis = web.isDisplayed();
        TestLogger.log("Checking element " + webName);
        System.out.println("Logo is verified");
        return isDis;
    }
*/
    public boolean pngVerification(){
        boolean display= isDisplayed(imgPng, "imgPng");
        System.out.println("picture is verified");
                return display;

    }

}

