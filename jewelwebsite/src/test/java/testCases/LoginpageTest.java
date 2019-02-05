package testCases;

import com.util.xlsx.reader.MyDataReader;
import com.vasya.Loginpage;
import main.java.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class LoginpageTest extends Loginpage {
    Loginpage objofloginpage = null;

    @BeforeMethod
    public void initializationOfElements() {



        objofloginpage = PageFactory.initElements(BrowserDriver.driver, Loginpage.class);

    }@DataProvider(name="DP")
    public Object[][] getTestData()throws Exception{

        File filepath= new File(System.getProperty("user.dir")+  "/TestData/TestData.xlsx");
        MyDataReader dr = new MyDataReader();
        dr.setExcelFile(filepath.getAbsolutePath());
        String[][] data = dr.getExcelSheetData("Sheet3");
        return data;
    }





    @Test(dataProvider = "DP")
    public void loginIngredientTest(String email, String password){

        objofloginpage.loginIngredient(email, password);
    }

    @Test
    public void verifyEmailText(){

        objofloginpage.getErroMessage();
        Assert.assertEquals(objofloginpage.getErroMessage(), "Or with Email");
    }

    @Test
    public void verifiedMsg(){

        objofloginpage.verifyWlcmMsg();
        Assert.assertEquals(objofloginpage.verifyWlcmMsg(), "Welcome back");
    }


}
