package Automation_Conceptwise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SearchMobiles {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driv= new ChromeDriver();
		driv.get("https://amazon.in/");
    WebElement drop1 =	driv.findElement(By.id("twotabsearchtextbox"));
	drop1.sendKeys("Mobiles");
	drop1.sendKeys(Keys.ENTER);
	
	Thread.sleep(4000);
	}

}
