 package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_40 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://google.com/");
	  driver.manage().window().maximize();
		WebElement searchTextField=driver.findElement(By.linkText("Images"));
		searchTextField.click();
		
		driver.findElement(By.name("q")).sendKeys("india");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(4000);
        driver.quit();

	}

}