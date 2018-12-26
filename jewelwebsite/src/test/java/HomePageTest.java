
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends browserDriver {

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