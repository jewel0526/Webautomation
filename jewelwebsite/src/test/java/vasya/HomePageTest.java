package vasya;
import com.vasya.HomePage;
import main.java.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends BrowserDriver {

    HomePage objOfHomePage = null;


    @BeforeMethod
    public void initializationOfElements() {

        objOfHomePage = PageFactory.initElements(driver, HomePage.class);

    }

    @Test
    public void searchTest (){

        objOfHomePage.search();




    }


}