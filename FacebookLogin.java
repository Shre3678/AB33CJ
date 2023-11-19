package Automation_Conceptwise;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver a= new ChromeDriver();
	  a.manage().window().maximize();
	  a.get("https://www.facebook.com");
      a.findElement(By.id("email")).sendKeys("abc@gmail.com");
      a.findElement(By.id("pass")).sendKeys("1234");
      a.findElement(By.name("login")).click();
      Thread.sleep(10000);
      String abc=a.getTitle();
      Thread.sleep(5000);
      System.out.println(abc);
      a.close();
     
	}

}

