package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.By;

public class SignUp extends BrowserDriver {

    public void SignUp(){

        driver.findElement(By.partialLinkText("Create Account")).click();

        driver.findElement(By.id("FirstNameBilling")).sendKeys("Md");
        driver.findElement(By.id("LastNameBilling")).sendKeys("Hasan");

        driver.findElement(By.id("Username2")).sendKeys("vala_nai@yahoo.com");
        driver.findElement(By.id("Password1")).sendKeys("Test@1234");
        driver.findElement(By.id("Password2")).sendKeys("Test@1234");

        driver.findElement(By.className("ccBtnSubmit")).click();

    }

}
