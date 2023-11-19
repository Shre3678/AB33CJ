package Assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_45 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d11= new ChromeDriver();
		d11.get("https://www.flipkart.com/");
		//d11.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		Thread.sleep(5000);
		d11.manage().window().maximize();
		d11.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		WebElement abc=d11.findElement(By.xpath("//div[.='Fashion']"));
	Actions cdef = new Actions(d11);
	cdef.moveToElement(abc).perform();
	d11.findElement(By.linkText("Men T-Shirts")).sendKeys(Keys.ENTER);

	d11.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div[1]/div/a/div[1]/div/div/div/img")).click();
	
	Set<String> buynowpage=d11.getWindowHandles();
	Iterator<String> Buy = buynowpage.iterator();
	Buy.next();// parent window
	String BN=Buy.next();//child window
	d11.switchTo().window(BN);
	d11.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[2]/div[3]/div/div[2]/div[1]/div/ul/li[1]")).click();
	Thread.sleep(5000);
	d11.findElement(By.xpath("/html/body/div[1]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[2]/form/button")).click();
    Thread.sleep(5000);
   WebElement EM= d11.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input"));
	EM.click();
   EM.sendKeys("9912123678");
   d11.findElement(By.xpath("//span[.='CONTINUE']")).click();
   d11.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input")).click();//otp
   Thread.sleep(10000);
   d11.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[4]/button")).click();//login button
   d11.quit();
	Thread.sleep(10000);
	//d11.close();	

	}

}
