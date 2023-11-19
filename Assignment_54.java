package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_54 {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Lenovo/Desktop/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement name =driver.findElement(By.name("lname"));
		boolean a;
		boolean b;
		if(a = name.isDisplayed())
		{
			if(b = name.isEnabled())
			{
				name.sendKeys("Honey");
			}
			else
				System.out.println("It's not Enable");
		}
		Thread.sleep(5000);
		driver.close();
	}

}
