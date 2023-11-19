package Automation_Conceptwise;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Play_oneSong_youtube {
	@Test
	public void yt() throws InterruptedException
{
	//public static void main(String[] args) throws InterruptedException {
		ChromeDriver b1= new ChromeDriver();
		b1.get("https://youtube.com/");
		b1.manage().window().maximize();
		b1.findElement(By.name("search_query")).sendKeys("You and I");
		//Thread.sleep(6000);
		b1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement abc= b1.findElement(By.name("search_query"));
	  abc.sendKeys(Keys.ENTER);
	   //Thread.sleep(6000);
	WebElement def =  b1.findElement(By.partialLinkText("Katy"));
	def.click();
         
	}

	}

