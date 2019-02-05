package testCases;

import ApplicationPagebasee.ApplicationPageBase;
import com.vasya.Loginpage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import api.GoogleSheetReader;
import org.testng.annotations.Test;
import reporting.TestLogger;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class GooglesheetLoginPageTest extends ApplicationPageBase {
    Loginpage objLoginpage= null;



    @BeforeMethod
    public void initializationOfElement() {
        objLoginpage = PageFactory.initElements(driver, Loginpage.class);
    }

        @DataProvider(name = "googleSheet")
        public Object[][] getTestDataGoogle() throws IOException {

            Properties properties = loadProperties();
            String spreadsheetId= properties.getProperty("google.secret.id");
            String range = properties.getProperty("google.range");

            String[][] data= GoogleSheetReader.getSpreadSheetRecordsToSupplyDataProviderAlternativeWay(spreadsheetId,range);
            return data;

        }
        @Test(dataProvider = "googleSheet")
    public void invalidSignin(String email, String password){
        objLoginpage.loginIngredient(email, password);



        }

    @Test(enabled = false)
    public  void invalidSigninByGoogleSheetApi() throws IOException {

        Properties properties = loadProperties();
        String spreadsheetId = properties.getProperty("google.secret.id");
        String range = properties.getProperty("google.range");
        TestLogger.log("Using Sheet Number " + range.charAt(5) + " and fields range  " + range.substring(6));
        List<List<Object>> getRecords = GoogleSheetReader.getSpreadSheetRecords(spreadsheetId, range);



        for (List cell : getRecords) {

            objLoginpage.loginIngredient(cell.get(0).toString(), cell.get(1).toString());

            String expectedText = cell.get(2).toString();

            System.out.println(expectedText);

        }
    }


    }


