package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
	//constructor
	LoginPage(WebDriver driver){
		this.driver=driver;
	}
		
	//Locators
	By txt_username = By.xpath("//input[@name='username']");
	By txt_password = By.xpath("//input[@placeholder='Password']");	
	By login = By.xpath("//button[normalize-space()='Login']");


	public void setUsername(String uname) {
	     driver.findElement(txt_username).sendKeys(uname);
	}
	
	public void setpassword(String pass) {
		driver.findElement(txt_password).sendKeys(pass);
	}
	
	public void submit() {
		driver.findElement(login).click();
	}
	
	
	
}
