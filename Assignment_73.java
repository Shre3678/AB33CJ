package Assignments;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_73 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.navigate().to(" https:\\www.amazon.in");
		System.out.println(driver.getCurrentUrl());
		WebDriverWait time = new WebDriverWait(driver, Duration.ofSeconds(10));
		time.until(ExpectedConditions.titleIs("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		driver.navigate().refresh();
		driver.navigate().back();  
		driver.navigate().to("https://www.flipkart.com");
		driver.navigate().forward();
		driver.manage().window().minimize();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.close();

	}

}
