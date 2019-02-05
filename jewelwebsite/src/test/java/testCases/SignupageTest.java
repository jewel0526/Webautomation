package testCases;

import com.vasya.SignupPage;
import main.java.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignupageTest  extends SignupPage {

    SignupPage objSignup = null;

    @BeforeMethod
    public void initializationOfElements() {


        objSignup = PageFactory.initElements(BrowserDriver.driver, SignupPage.class);

    }

    @Test(priority = 0)
    public void signupTypesTest() throws InterruptedException {
        objSignup.signupTypes();
        String actualErrorMsg = objSignup.getErroMessage();
        Assert.assertEquals(actualErrorMsg, "Or with Email");



    }

   @Test(priority = 1)
    public void verifiedBackText() {
        objSignup.verifyBack();
        Assert.assertEquals(objSignup.verifyBack(), "Back");

    }


}
