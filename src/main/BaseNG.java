package main;

import java.io.IOException;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseNG {
	Library lb=new Library();
	@BeforeTest
	public void beforeTest() throws IOException, InterruptedException
	{
		lb.OpenURL("http://demo.guru99.com/test/newtours/");
	}
	
	@AfterTest
	public void afterTest()
	{
		lb.CloseBrowers();
	}

}
