package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	/*
	 * @FindBy(id="user-name") private WebElement usernameTextFeild;
	 * 
	 * @FindBy(id="password") private WebElement passwordTextFeild;
	 * 
	 * @FindBy(id="login-button") private WebElement loginButton;
	 * 
	 * @FindBy(xpath="//div[@class='app_logo']") private WebElement logo;
	 * 
	 * public loginPage(WebDriver driver) { PageFactory.initElements(driver,this); }
	 * 
	 * public WebElement getUsernameTextFeild() { return usernameTextFeild; }
	 * 
	 * 
	 * public WebElement getPasswordTextFeild() { return passwordTextFeild; }
	 * 
	 * 
	 * public WebElement getLoginButton() { return loginButton; }
	 * 
	 * 
	 * public WebElement getLogo() { return logo; }
	 * 
	 * 
	 * public void loginTosauceDemo(String username,String password) {
	 * usernameTextFeild.sendKeys(username); passwordTextFeild.sendKeys(password);
	 * loginButton.click(); }
	 */
	WebDriver driver;
	
	By txt_username=By.id("user-name");
	By txt_password=By.id("password");
	By btn_login=By.id("login-button");
	By lbl_logo=By.xpath("//div[@class='app_logo']");
	
	public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void clickLogin() {
		driver.findElement(btn_login).click();
	}
	
	public void isLogoDisplayed() {
		driver.findElement(lbl_logo).isDisplayed();
	}
	
	public void userLogin(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		
	}


}
