package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage_PageFactory {
	
	WebDriver driver;
	
	LoginPage_PageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Locators
	@FindBy(xpath="//input[@name='username']")
	WebElement txt_username;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	WebElement btn_submit;
	
	public void setUsername1(String uname) {
		txt_username.sendKeys(uname);
	}

	public void setPassword1(String pass) {
		txt_password.sendKeys(pass);
	}
	
	public void BtnSubmit() {
		btn_submit.click();;
	}
	
}
