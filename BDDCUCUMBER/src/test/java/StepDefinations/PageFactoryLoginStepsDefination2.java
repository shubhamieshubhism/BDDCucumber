package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageFactory.homePageFactory;
import pageFactory.loginPageFactory;

public class PageFactoryLoginStepsDefination2 {
	static WebDriver driver;
	loginPageFactory login;
	homePageFactory home;

	@Given("User is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/");

	}

	@When("User enters valid {string} and {string}")
	public void user_enters_valid_and(String username, String password) {
		login = new loginPageFactory(driver);
		login.enterUsername(username);
		login.enterPasswword(password);
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() {
		login.clickLogin();

	}

	@Then("User is navigated to home page")
	public void user_is_navigated_to_home_page() {
		home = new homePageFactory(driver);
		home.isLogoDisplayed();
//		Assert.assertTrue(driver.findElements(By.xpath("//div[@class='app_logo']")).size() > 0,
//				"User is navigated to home page");
	}

	@And("Close the browser")
	public void close_the_browser() {
		driver.close();
	}

}
