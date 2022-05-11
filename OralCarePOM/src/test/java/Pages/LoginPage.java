package Pages;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
 
public class LoginPage {
 
WebDriver driver;
 
        public LoginPage(WebDriver driver){
                 this.driver=driver;
        }
 
//Using FindBy for locating elements
@FindBy(how=How.XPATH, using="//input[@id='Username']") WebElement Username;
@FindBy(how=How.XPATH, using="//input[@id='Password']") WebElement password;
@FindBy(how=How.XPATH, using="//button[@id='button-submit']") WebElement submit;


public void EnterValidLoginCredentials()
{
    
	Username.sendKeys("bala40");
    password.sendKeys("Chennai@12345");
}

public void ClickSubmitButton()
{
    submit.click();
   // return new CaseListingPage(driver);

}
 
}