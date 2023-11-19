package Automation_Conceptwise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample_ODS {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
	

	{
		FileInputStream ExcelSheet1 = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Automation_Mine\\ExcelSheets\\ODS_1.ods");
		Workbook book=WorkbookFactory.create(ExcelSheet1);
		Sheet sheet=book.getSheet("Facebook");
		Row row=sheet.getRow(1);
		Cell cellvalue=row.getCell(0);
		String UserName=cellvalue.getStringCellValue();
		String Password =sheet.getRow(1).getCell(1).getStringCellValue();// this is for combination of varchar
	//String Password= NumberToTextConverter.toText(sheet.getRow(1).getCell(1).getNumericCellValue());//only the Numbers
		  WebDriver driver =new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  driver.manage().window().maximize();
		  driver.findElement(By.name("email")).sendKeys(UserName);
		  driver.findElement(By.name("pass")).sendKeys(Password);
		  driver.findElement(By.name("login")).click();
		  Thread.sleep(5000);
		  driver.close();
		
		
		}
	
	
}
}