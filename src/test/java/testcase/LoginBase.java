
package testcase;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginBase {

      	WebDriver driver;

		@BeforeClass
		void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromeDriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");		
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/*
		Wait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(5))
				.ignoring(NoSuchElementException.class);
				*/
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
		}
		
		
		
	@Test
	void testlogin() throws InterruptedException {
		
		
		/*
		LoginPage lp=new LoginPage(driver);		
		Thread.sleep(4000);		
		lp.setUsername("Admin");
		lp.setpassword("admin123");
		lp.submit();	
		Thread.sleep(5000);
		*/
		
		
		LoginPage_PageFactory lp=new LoginPage_PageFactory(driver);
		lp.setUsername1("Admin");
		lp.setPassword1("admin123");
		lp.BtnSubmit();
		
	}
	
	@AfterClass
	void tearDown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}

}
