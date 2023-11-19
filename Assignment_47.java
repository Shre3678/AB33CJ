package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_47 {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.google.com");
		WebElement SerachButton = driver1.findElement(By.id("APjFqb"));
		SerachButton.sendKeys("India");
		Thread.sleep(3000);
		List <WebElement> Autosuggestion1 =driver1.findElements(By.xpath("//div[@class=\"mkHrUc\"]/div/div/ul/li"));
		int a= Autosuggestion1.size();
		System.out.println(a);
		Autosuggestion1.get(a-1).click();
		Thread.sleep(30000);
	driver1.close();
	}
	

}
