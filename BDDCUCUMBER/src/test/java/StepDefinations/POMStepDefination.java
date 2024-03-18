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
import pageObject.loginPage;

/*
 * public class POMStepDefination { WebDriver driver; loginPage login;
 * 
 * @Given("User is on login page") public void user_is_on_login_page() {
 * WebDriverManager.chromedriver().setup(); ChromeOptions opt = new
 * ChromeOptions(); opt.addArguments("--remote-allow-origins=*"); driver = new
 * ChromeDriver(opt); driver.manage().window().maximize();
 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
 * driver.get("https://www.saucedemo.com/v1/");
 * 
 * }
 * 
 * //@When("User enters valid username and password") //public void
 * user_enters_valid_username_and_password()
 * 
 * @When("User enters valid {string} and {string}") public void
 * user_enters_valid_and(String username, String password) { login=new
 * loginPage(driver); login.enterUsername(username);
 * login.enterPassword(password);
 * 
 * 
 * }
 * 
 * @And("Clicks on login button") public void clicks_on_login_button() {
 * login.clickLogin();
 * 
 * 
 * }
 * 
 * @Then("User is navigated to home page") public void
 * user_is_navigated_to_home_page() { login.isLogoDisplayed(); }
 * 
 * @And("Close the browser") public void close_the_browser() { driver.close(); }
 * 
 * }
 */