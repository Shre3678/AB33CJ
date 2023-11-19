package Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Assignment_56a 
{
@Test (enabled=false)
void facebook() throws EncryptedDocumentException, IOException
{

    FileInputStream bookLocation = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Automation_MKT\\ExcelSheets\\Ecom.xlsx");
    Workbook wb=WorkbookFactory.create(bookLocation);
    Sheet sheet= wb.getSheet("userlogin");
    String username =sheet.getRow(2).getCell(0).getStringCellValue();
    String password =sheet.getRow(2).getCell(1).getStringCellValue();
    ChromeDriver driver= new ChromeDriver();
    driver.get("https://www.facebook.com");
    driver.findElement(By.id("email")).sendKeys(username);
    driver.findElement(By.id("pass")).sendKeys(password);
    driver.findElement(By.name("login")).click();
   String a= driver.getTitle();
    System.out.println(a);
    //driver.close();
}
    
 @Test  // (enabled=false)
 void amazon() throws EncryptedDocumentException, IOException, InterruptedException
 {
	 
	 FileInputStream bookLocation = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\Automation_MKT\\ExcelSheets\\Ecom.xlsx");
	    Workbook wb=WorkbookFactory.create(bookLocation);
	    Sheet sheet= wb.getSheet("userlogin");
	    String username =NumberToTextConverter.toText(sheet.getRow(1).getCell(0).getNumericCellValue());
	    String password =sheet.getRow(1).getCell(1).getStringCellValue();
	    ChromeDriver driver= new ChromeDriver();
	    driver.get("https://www.amazon.in");
	    driver.manage().window().maximize();
	    Thread.sleep(6000);
	    WebElement for_sigin=driver.findElement(By.xpath("//span[.='Hello, sign in']"));
	    Actions sign= new Actions(driver);
	    sign.moveToElement(for_sigin).perform();
	    driver.findElement(By.xpath("//span[.='Sign in']")).click();
	    driver.findElement(By.id("ap_email")).sendKeys(username);
	    driver.findElement(By.id("continue")).click();
	    driver.findElement(By.id("ap_password")).sendKeys(password);
	    driver.findElement(By.id("signInSubmit")).click();
	   String b= driver.getTitle();
	    System.out.println(b);
	 //  driver.close();

    

	}

}
