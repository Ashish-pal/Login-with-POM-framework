package LoginPOM.LoginPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginRediff {

	WebDriver driver;

	By email = By.id("login1");
	By password = By.id("password");
	By submit = By.name("proceed");

	public LoginRediff(WebDriver drive) {
		//this.driver=driver;
		driver = drive;
	}

	public void giveEmail(String mail) {
		driver.findElement(email).sendKeys(mail);
	}

	public void givePassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}

	public void giveClick() {
		driver.findElement(submit).click();
	}

}
