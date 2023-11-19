package Automation_Conceptwise;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absoluteee {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver a= new ChromeDriver();
		  a.manage().window().maximize();
		 a.get("https://www.facebook.com");
		 a.manage().window().setSize(new Dimension (1000,1000));
		  a.findElement(By.xpath("//html//body//div//div//div//div//div//div//div[2]//div//div//form//div//div//input")).sendKeys("dd");
		  //a.get("https://www.google.com");
		  //a.findElement(By.xpath("/html/body/div/div[3]/form/div/div/div/div/div[2]/textarea")).sendKeys("indiaa");
		  Thread.sleep(2000);
		  a.close();
	}

}
