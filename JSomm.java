package Automation_Conceptwise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JSomm {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new EdgeDriver();
	    //driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/GroTechMind/learningHTML1.html");
		driver.switchTo().alert().accept();
		driver.manage().window().maximize();
		driver.findElement(By.id("1")).sendKeys("India");
	}

}
