package main;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegDPNG extends BaseNG
{
	Library lb=new Library();
	
	@Test(dataProvider = "Data")
    public void test(String un, String pw, String cpw) throws InterruptedException
    {
		lb.Register(un, pw, cpw);	
    }

	@DataProvider
	public Object[][] Data()
	{
		Object[][] obj=new Object[3][3];
		obj[0][0]="asdfgh";
		obj[0][1]="fgrth";
		obj[0][2]="fgrth";
		
		obj[1][0]="awbgtfrhyjukijuhybgtfvdc";
		obj[1][1]="dsvgtfrhyj7ui524786";
		obj[1][2]="dsvgtfrhyj7ui524786";
		
		obj[2][0]="wadgrt785654";
		obj[2][1]="agtrh45876";
		obj[2][2]="agtrh45876";
		
		return obj;	
	}
}
