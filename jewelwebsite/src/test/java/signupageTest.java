import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class signupageTest  extends signupPage{

    signupPage signuptest = null;

    @BeforeMethod
    public void initializationOfElements() {



        signuptest = PageFactory.initElements(driver, signupPage.class);

    }@Test
    public void signupTypesTest(){
        signuptest.signupTypes();


    }
}
