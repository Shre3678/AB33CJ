package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment_52 {
public static void main(String[] args) throws InterruptedException {
			ChromeDriver driver = new ChromeDriver();
			driver.get("file:///C:/Users/Lenovo/Desktop/learningHTML1.html");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
			WebElement Check = driver.findElement(By.name("username"));
			Boolean a= Check.isDisplayed();
			System.out.println(a);
			Boolean b= Check.isEnabled();
			System.out.println(b);
			if(a==true && b==true)
			{
				Check.sendKeys("abc");
			}
			else
			{
				System.out.println("Its not Working as per our requirement");
			}
			Thread.sleep(5000);
			driver.manage().window().minimize();
			Thread.sleep(2000);
			driver.close();
	}

}
