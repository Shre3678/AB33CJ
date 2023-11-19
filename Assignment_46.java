package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_46 {
public static void main(String[] args) {

	
	ChromeDriver Open = new ChromeDriver();
	Open.get("http://www.flipkart.com/");
	Open.manage().window().maximize();
	Open.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	Open.findElement(By.name("q")).sendKeys("Shoe");
	List <WebElement> autosuggestion=Open.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']"));
	}

}
