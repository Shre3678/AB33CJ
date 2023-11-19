package Automation_Conceptwise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

@Test //(invocationCount =2)
public class Grotechminds_Reg 

{
public void Grotechminds_App() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://grotechminds.com/registration/");
	driver.manage().window().maximize();
	driver.navigate().refresh();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement usernmae=driver.findElement(By.name("your-name"));
	usernmae.click();
	usernmae.sendKeys("Srinivas");
	WebElement password = driver.findElement(By.id("3"));
	password.click();
	password.sendKeys("Shre$123678");
	//password.clear();
	WebElement Lastname= driver.findElement(By.id("5"));
	Lastname.click();
	Lastname.sendKeys("Srinivas");
	System.out.println(Lastname.getText());
    WebElement drop=driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div[1]/div[1]/div/div/div/div/form/div[5]/div/p[2]/span/select"));
	Select dropdown = new Select(drop);
	dropdown.selectByVisibleText("Hindu");
	driver.findElement(By.name("checkbox-833[]")).click();
	WebElement hint= driver.findElement(By.id("2"));
	hint.click();
	hint.sendKeys("Shree");
	WebElement firstnmae= driver.findElement(By.id("4"));
	firstnmae.click();
	firstnmae.sendKeys("Bandari");
	driver.findElement(By.name("radio-45")).click();
	driver.findElement(By.name("file-935")).sendKeys("C:\\Users\\Lenovo\\Desktop\\Srinivas_Bandari_Test_Engineer.pdf");
    driver.findElement(By.xpath("/html/body/div[4]/div[2]/div[3]/div[1]/div[1]/div/div/div/div/form/div[8]/div/p/input")).click();	
	driver.close();
}
}
