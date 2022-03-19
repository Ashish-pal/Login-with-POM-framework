package LoginPOM.LoginPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMRediff {

	WebDriver driver;
	
	@FindBy(how=How.ID, using="login1")	WebElement givEmail;
	
	@FindBy(how=How.ID, using="password")
	WebElement givPass;
	
	@FindBy(name="proceed")	
	WebElement SubmitLink;
	
	public LoginPOMRediff(WebDriver drive) {
		//this.driver=driver;	
		driver = drive;
		PageFactory.initElements(drive, this);
	}
	
	public void giveEmail(String mail) {
		givEmail.sendKeys(mail);
	}

	public void givePassword(String pass) {
		givPass.sendKeys(pass);
	}

	public void giveClick() {
		SubmitLink.click();
	}
}
