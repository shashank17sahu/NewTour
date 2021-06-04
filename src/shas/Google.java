package shas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Google
{
//	@FindBy(className = "gLFyf gsfi");
	WebElement a;
//	@FindBy(xpath = "");
	WebElement b;
	WebDriver driver;
	public Google(WebDriver driver)
	{
		this.driver=driver;
	}
	public void username()
	{
		a.click();
	}
	public void password(String un)
	{
		b.sendKeys(un);
	}
	
}
