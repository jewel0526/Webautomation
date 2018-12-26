import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class signupPage  extends HomePage{
    public static String fname= "jewel";
    public static String Lname= "ahamed";
    public static String Uname= "jeweldaaboss";
    public static String Email="jewel@yahoo.com";
    public static String Pword ="abcd";


    @FindBy(xpath = "//a[@id='nav-signup']")
    WebElement signuptitle;

    @FindBy(name = "firstname")
    WebElement firstName;

    @FindBy(name = "lastname")
    WebElement Lastname;

    @FindBy(name = "username")
    WebElement SignupUserName;
    @FindBy(name="email")
    WebElement SignupEmail;

    @FindBy(name = "password")
    WebElement SignupPassword;
    //@FindBy(xpath = "//button[@class='vice button button-white']")
   // WebElement ChooseVice;
  //  @FindBy(className = "control__indicator")
  //  WebElement radioButton;

    public void signupTypes(){
        signuptitle.click();
        firstName.sendKeys(fname);
        Lastname.sendKeys(Lname);
        SignupEmail.sendKeys(Uname);
        SignupUserName.sendKeys(Email);
        SignupPassword.sendKeys(Pword);
       // ChooseVice.click();
       // radioButton.click();
    }





}
