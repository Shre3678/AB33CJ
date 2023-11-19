package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_37 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver b11= new ChromeDriver();
		b11.get("https://google.com/");
		b11.findElement(By.id("APjFqb")).sendKeys("India");
		Thread.sleep(4000);
        b11.close();
	}

}
