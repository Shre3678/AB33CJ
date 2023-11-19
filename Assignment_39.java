package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_39 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d11= new ChromeDriver();
		d11.get("https://amazon.in/");
		d11.manage().window().maximize();
d11.findElement(By.linkText("Mobiles")).click();
	Thread.sleep(4000);
	d11.close();
	}

}
