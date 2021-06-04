package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Library {
	public static WebDriver driver;
	public static FileInputStream fis;
	public static Properties pr;
	public static String exp,act;
	
	public void OpenURL(String url) throws IOException, InterruptedException 
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		fis=new FileInputStream("C:\\Users\\SHASHANK\\Desktop\\shashank\\shashank\\src\\properties\\NewTours.properties");
		pr=new Properties();
		pr.load(fis);
			
	}
	public String Register(String un, String pw, String cpw) throws InterruptedException 
	{
		//driver.findElement(By.xpath(pr.getProperty("Home"))).click();
		driver.findElement(By.xpath(pr.getProperty("Reg"))).click();
		Thread.sleep(2000);
		driver.findElement(By.name(pr.getProperty("UserName"))).sendKeys(un);
		driver.findElement(By.name(pr.getProperty("Password"))).sendKeys(pw);
		driver.findElement(By.name(pr.getProperty("ConfirmPassword"))).sendKeys(cpw);
		driver.findElement(By.name(pr.getProperty("Submit"))).click();
		exp="Register: Mercury Tours";
		act=driver.getTitle();
		
		if(act.equalsIgnoreCase(exp))
		{
			System.out.println("Registration Done");
		}
		else
		{
			System.out.println("Registration Not Done");
		}
		driver.findElement(By.xpath(pr.getProperty("Home"))).click();
		return "Pass";
	}
	public void Home()
	{
		driver.findElement(By.xpath(pr.getProperty("Home"))).click();
	}
	public void CloseBrowers()
	{
		driver.close();
		
	}
	

}
