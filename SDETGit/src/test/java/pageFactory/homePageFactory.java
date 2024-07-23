package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageFactory {
	WebDriver driver;
	
	@FindBy(xpath = "//div[@class='app_logo']")
	WebElement lbl_logo;
	
	public void islogoDisplayed() {
		lbl_logo.isDisplayed();
	}
	
	public homePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

}
