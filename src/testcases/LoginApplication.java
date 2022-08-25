package testcases;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.RediffHomePage;
import objectRepository.RediffLoginPage;

public class LoginApplication {
	
@Test
	public void Login() throws InterruptedException
	{
    System.setProperty("webdriver.chrome.driver","C:\\vanu\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	//driver.manage().timeouts().implicitlyWait);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

	RediffLoginPage rl= new RediffLoginPage(driver);
	rl.EmailId().sendKeys("Hello");
	rl.Password().sendKeys("Hello");
	//rl.SignIn().click();
	rl.Home().click();
	RediffHomePage rh = new RediffHomePage(driver);
	Thread.sleep(5000);
	rh.Submit().sendKeys("mobile");
	rh.Search().click();
	
	
	}
	
}

