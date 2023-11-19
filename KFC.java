package Automation_Conceptwise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KFC {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver a= new ChromeDriver();
		  a.manage().window().maximize();
		 a.get("https://www.kfc.com.gh/");
		a.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 

        a.findElement(By.xpath("/html/body/div/header/header/div/div[3]/p")).click();
		
          a.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[2]/form/div[1]/div/div/div/input")).sendKeys("9999999999");
        
          a.close();
	}

}
