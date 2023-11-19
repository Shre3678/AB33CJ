package Automation_Conceptwise;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();//empty browser
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com");
		  driver.navigate().to("https://www.facebook.com");
		  Thread.sleep(3000);
		  driver.navigate().refresh();
		  driver.navigate().back();//empty browser page it will navigate
		  Thread.sleep(2000);
		  driver.navigate().forward();
		  driver.manage().window().minimize();
		  Thread.sleep(2000);
		  driver.close();
	}

}
