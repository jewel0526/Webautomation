package vasya;

import com.vasya.loginpage;
import main.java.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class loginpageTest extends loginpage {
    loginpage objofloginpage = null;

    @BeforeMethod
    public void initializationOfElements() {



        objofloginpage = PageFactory.initElements(BrowserDriver.driver, loginpage.class);

    }

    @Test
    public void loginIngredientTest(){

        objofloginpage.loginIngredient();
    }


}
