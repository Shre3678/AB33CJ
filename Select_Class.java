package Automation_Conceptwise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Class{

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driv= new ChromeDriver();
		driv.get("https://amazon.in/");
		driv.manage().window().maximize();
    	WebElement Drop=driv.findElement(By.name("url"));
		Drop.click();
		Select f = new Select(Drop);
		
		Thread.sleep(4000);
		f.selectByVisibleText("Alexa Skills");
		Drop.sendKeys("alexa");

		}

	}
