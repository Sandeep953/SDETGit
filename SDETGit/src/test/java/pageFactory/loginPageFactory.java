package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPageFactory {
	WebDriver driver;
	
	@FindBy(id = "user-name")
	WebElement txt_username;

	@FindBy(id = "password")
	WebElement txt_password;

	@FindBy(id = "login-button")
	WebElement login_button;

	public void enterusername(String username) {
		txt_username.sendKeys(username);
	}

	public void enterpassword(String password) {
		txt_password.sendKeys(password);
	}

	public void clickLogin() {
		login_button.click();
	}
	
	public loginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

}
