package Tests;
 
import java.io.IOException;
import java.util.concurrent.TimeUnit;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
 
public class TestBase {
public static WebDriver driver = null;
@BeforeSuite
public void initialize() throws IOException{
System.setProperty("webdriver.chrome.driver","D://chromedriver.exe");
driver = new ChromeDriver();
//To maximize browser
                driver.manage().window().maximize();
        //Implicit wait
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//To open facebook
                driver.get("https://3mocc-sl3-qa.ocsd.3m.com/");
}
@AfterSuite
//Test cleanup
public void TeardownTest()
    {
        TestBase.driver.quit();
    }
 
}