
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class appPage extends browserDriver {




    //@FindBy(xpath = "//a[@query='object Object']")
    @FindBy(xpath ="//a[@query='[object Object]']" )
    private WebElement app;

    @FindBy(xpath = "//input[@type='text']")
    private WebElement searchPhoneNumb;
    @FindBy(xpath = "//button[@class='btn btn-success']")
   private WebElement send;


    public void appclick(){
        app.click();

    }
    public void sendType(){

        send.click();

    }

    public void searchMobile (){

        searchPhoneNumb.sendKeys("123456789", Keys.ENTER );

    }





}
