package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {
	WebDriver driver;
	

public RediffHomePage(WebDriver driver)
{
	this.driver=driver;
}
	By submit=By.name("OAS_subsection");
	By search =By.xpath("//input[@placeholder='Search for a product, category or brand']");
	
	

public WebElement Submit()
{
	return driver.findElement(submit);
}

public WebElement Search()
{
	return driver.findElement(search);
}
}
