package vasya;

import com.vasya.appPage;
import main.java.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class appPageTest  extends BrowserDriver {
    appPage appPageTest = null;

    @BeforeMethod
    public void intializaionElements(){
        appPageTest= PageFactory.initElements(driver, appPage.class);



    }

    @Test
    public void appTest (){

        appPageTest.searchMobile();
    }

}
