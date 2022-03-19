package PackageTestLog;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import LoginPOM.LoginPOM.LoginPOMRediff;
import LoginPOM.LoginPOM.LoginRediff;

public class TestLogin {
  @Test
  public void loginTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manis\\OneDrive\\Documents\\ec_workspace\\external_libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//LoginRediff redifflogin = new LoginRediff(driver); 
		LoginPOMRediff redifflogin = new LoginPOMRediff(driver);
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		redifflogin.giveEmail("yiroco@rediffmail.com");
		redifflogin.givePassword("Password@123");
		redifflogin.giveClick();
		
		if(driver.getTitle().contains("Rediffmail")) {
			System.out.println("login successfully");
		}
		else
		{
			System.out.println("login failed");
		}		
  }
}
