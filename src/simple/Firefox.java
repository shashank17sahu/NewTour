package simple;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) throws InterruptedException, IOException
	{
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		driver.getCurrentUrl();
		driver.getTitle();
		Thread.sleep(1000);
		
		FileInputStream fis=new FileInputStream("C:\\Users\\SHASHANK\\Desktop\\shashank\\shashank\\src\\simple\\ref.properties");
		Properties pr=new Properties();
		pr.load(fis);
		
	//	driver.findElement(By.xpath(pr.getProperty("gmail"))).click();
//		driver.findElement(By.xpath(pr.getProperty("image"))).click();
//		driver.findElement(By.xpath(pr.getProperty("sign-in"))).click();
//		driver.findElement(By.xpath(pr.getProperty("textsearch"))).click();
//		driver.findElement(By.xpath(pr.getProperty("goosearch"))).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath(pr.getProperty("SignIn"))).click();
		Thread.sleep(5000);
		driver.findElement(By.id(pr.getProperty("EmailText"))).sendKeys("shashank17sahu");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pr.getProperty("NextButton"))).click();
		driver.findElement(By.xpath(pr.getProperty("PwText"))).sendKeys("shivshanka");
		driver.findElement(By.xpath(pr.getProperty("pwNext"))).click();
		driver.findElement(By.xpath(pr.getProperty("Acc"))).click();
		driver.findElement(By.xpath(pr.getProperty("Logout"))).click();
		
		
		

	}

}
