//
//package Steps;
//
//import java.time.Duration;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObjects.loginPage;
//
//public class POMLoginStepsDefinition2 {
//	WebDriver driver;
//	loginPage login;
//
//	@Given("User is on login page")
//	public void user_is_on_login_page() {
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		driver.get("https://www.saucedemo.com/v1/");
//		driver.manage().window().maximize();
//
//	}
//
//	@When("User enters valid {string} and {string}")
//	public void user_enters_valid_username_and_password(String username, String password) {
//
//		login = new loginPage(driver);
//		login.enterusername(username);
//		login.enterpassword(password);
//		driver.findElement(By.id("user-name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//	}
//
//	@And("Clicks on Login Button")
//	public void clicks_on_login_button() {
//
//		login.clicklogin();
//		driver.findElement(By.id("login-button")).click();
//	}
//
//	@Then("User is navigated to Home Page")
//	public void user_is_navigated_to_home_page() {
//		login.islogoDisplayed();
//		boolean logostatus = driver.findElement(By.xpath("//div[@class='app_logo']")).isDisplayed(); //
//		System.out.println(logostatus);
//
//	}
//
//	@And("Close the browser")
//	public void close_the_browser() {
//		driver.close();
//	}
//
//}
