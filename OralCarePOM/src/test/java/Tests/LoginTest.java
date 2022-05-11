package Tests;
 
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
 
import Pages.HomePage;
import Pages.LoginPage;
 

//samples

public class LoginTest extends TestBase{
@Test
public void init() throws Exception{
 
//driver.get("https://www.facebook.com");
LoginPage loginpage = PageFactory.initElements(driver, LoginPage.class);
loginpage.EnterValidLoginCredentials();
loginpage.ClickSubmitButton();
}
}
