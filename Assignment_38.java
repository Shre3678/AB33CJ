package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_38 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver c11= new ChromeDriver();
		c11.get("https://facebook.com/");
		
		WebElement abc=c11.findElement(By.name("email"));
		abc.click();
		abc.sendKeys("Shrenivas");
	WebElement def=	c11.findElement(By.name("pass"));
		def.click();
		def.sendKeys("9912100000");
		c11.findElement(By.name("login")).click();
		Thread.sleep(4000);
        c11.close();

	}

}
