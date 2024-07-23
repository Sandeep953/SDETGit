package Steps;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.homePageFactory;
import pageFactory.loginPageFactory;

public class PageFactoryLoginStepsDefinition {
	WebDriver driver;
	loginPageFactory login;
	homePageFactory home;
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.saucedemo.com/v1/");
	    driver.manage().window().maximize();
	    
	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
		
		login = new loginPageFactory(driver);
		login.enterusername(username);
		login.enterpassword(password);
//	    driver.findElement(By.id("user-name")).sendKeys(username);
//	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("Clicks on Login Button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		login.clickLogin();
//	    driver.findElement(By.id("login-button")).click();
	}

	@Then("User is navigated to Home Page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		home = new homePageFactory(driver);
		home.islogoDisplayed();
//		boolean logostatus = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed();
//		System.out.println(logostatus);
	    
	}

	@And("Close the browser")
	public void close_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.quit();;
	}

}
