package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReg {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		Library lb=new Library();
		lb.OpenURL("http://demo.guru99.com/test/newtours/");
		
		FileInputStream fis=new FileInputStream("C:\\Users\\SHASHANK\\Desktop\\shashank\\shashank\\src\\testData\\Register.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheet("Sheet1");
		int rc=ws.getLastRowNum();
		System.out.println(rc);
		for (int i = 1; i <= rc; i++) 
		{
			XSSFRow wr=ws.getRow(i);
			XSSFCell wc=wr.getCell(0);
			XSSFCell wc1=wr.getCell(1);
			XSSFCell wc2=wr.getCell(2);
			XSSFCell wc3=wr.createCell(3);
			
			String un=wc.getStringCellValue();
			String pw=wc1.getStringCellValue();
			String cpw=wc2.getStringCellValue();
			
			String res=lb.Register(un, pw, cpw);
			wc3.setCellValue(res);
				
		}
		FileOutputStream fos=new FileOutputStream("C:\\Users\\SHASHANK\\Desktop\\shashank\\shashank\\src\\result\\RegResult.xlsx");
		wb.write(fos);
		wb.close();
		lb.CloseBrowers();
	}

}
