package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	WebDriver driver;
	

public RediffLoginPage(WebDriver driver)
{
	this.driver=driver;
}
	By username=By.name("login");
	By password=By.id("password");
	By signin=By.name("proceed");
	By home=By.xpath("//a[@class='f12']");
	
	public WebElement EmailId()
	{
		return driver.findElement(username);
	}
	public WebElement Password()
	{
		return driver.findElement(password);
	}
	public WebElement SignIn()
	{
		return driver.findElement(signin);
	}
	public WebElement Home()
	{
		return driver.findElement(home);
	}

}
