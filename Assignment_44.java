package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_44 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver b11= new ChromeDriver();
		b11.get("https://google.com/");
		Thread.sleep(4000);
		b11.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div/div/div[2]/textarea")).sendKeys("India");
		Thread.sleep(4000);
        b11.close();

	}

}
