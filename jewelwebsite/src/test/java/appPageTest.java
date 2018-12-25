import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class appPageTest  extends browserDriver{
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
