package main;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LibNG {
	 WebDriver driver;
	 FileInputStream fis;
	 Properties pr;
	 String exp,act;
	
  @Test
  public void Register() 
  {
	  driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a")).click();
		driver.findElement(By.name("email")).sendKeys("qwerties");
		driver.findElement(By.name("password")).sendKeys("12345");
		driver.findElement(By.name("confirmPassword")).sendKeys("12345");
		driver.findElement(By.name("submit")).click();
		
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
  }
  @BeforeTest
  public void OpenURL() throws IOException, InterruptedException 
  {
	  fis=new FileInputStream("C:\\Users\\SHASHANK\\Desktop\\shashank\\shashank\\src\\properties\\NewTours.properties");
		pr=new Properties();
		pr.load(fis);
		
		driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		Thread.sleep(2000);	
  }

  @AfterTest
  public void CloseBrowers() 
  {
	  driver.close();
  }

}
