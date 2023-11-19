package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_41 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d11= new ChromeDriver();
		d11.get("https://amazon.in/");
		d11.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
        d11.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
        d11.findElement(By.partialLinkText("The Power of Your Subconscious Mind")).click();
        Thread.sleep(4000);
	    d11.close();
		
	}

}
