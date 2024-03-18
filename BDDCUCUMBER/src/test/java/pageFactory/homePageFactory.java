package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePageFactory {
	@FindBy(xpath="//div[@class='app_logo']")
	WebElement lbl_logo;
	
	public void isLogoDisplayed() {
		lbl_logo.isDisplayed();
	}
	
	public homePageFactory(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

}
