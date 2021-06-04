package simple;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "F:\\JAVA-SELENIUM\\SELENIUM\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
	driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("shashank17sahu");
	Thread.sleep(3000);
	driver.findElement(By.className("VfPpkd-vQzf8d")).click();
//	driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
//	driver.getCurrentUrl();
//	driver.getTitle();
//
//	Thread.sleep(5000);
//	driver.findElement(By.id(("EmailText"))).sendKeys("shashank17sahu");
//	Thread.sleep(3000);
//	driver.findElement(By.xpath(("NextButton"))).click();
//	driver.findElement(By.xpath(("PwText"))).sendKeys("shivshanka");
//	driver.findElement(By.xpath(("pwNext"))).click();
//	driver.findElement(By.xpath(("Acc"))).click();
//	driver.findElement(By.xpath(("Logout"))).click();


}
}