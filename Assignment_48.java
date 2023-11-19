package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_48 
{
public static void main(String[] args) throws InterruptedException 
{
			ChromeDriver Open = new ChromeDriver();
			Open.get("http://www.flipkart.com/");
			Open.manage().window().maximize();
			Open.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			Open.findElement(By.name("q")).sendKeys("Shoe");
			Thread.sleep(10000);
	List <WebElement> autosuggestion=Open.findElements(By.xpath("//div[@class=\"_1cmsER\"]/form/ul/li"));
			
			int c= autosuggestion.size();// the size of autosuggestion
			System.out.println(c);//print c means the size of autosuggestion
			Thread.sleep(10000);
			autosuggestion.get(5).click();// click on the 6 option
			Thread.sleep(2000);
			Open.findElement(By.xpath("//div[@class=\"_13oc-S\"]/div")).click();
		

	}

}
