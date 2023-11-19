package Assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


@Test //(invocationCount =2)
public class Assignment_74 {

	public void amazonShopping() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\www.google.com");
		driver.navigate().to("https:\\www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		WebElement searchbox=driver.findElement(By.id("searchDropdownBox"));
		Select dropdown= new Select(searchbox);
		dropdown.selectByVisibleText("Books");
		
		WebElement Searching =driver.findElement(By.id("twotabsearchtextbox"));
		Searching.sendKeys("Baby I'm Your");
		Searching.sendKeys(Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Set<String> for_controlofChildwindow =driver.getWindowHandles();
		Iterator<String> windows=for_controlofChildwindow.iterator();
		String parent =windows.next();
		String AccessChild=windows.next();
		driver.switchTo().window(AccessChild);
		
		driver.findElement(By.id("checkout-button")).click();
		driver.findElement(By.name("email")).sendKeys("9912123678");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Shre$56789");
		driver.findElement(By.id("signInSubmit")).click();
		Thread.sleep(10000);
		//driver.findElement(By.xpath("//span[.='Submit code']")).click();
		driver.findElement(By.id("card-radiobutton-0")).click();
		Thread.sleep(10000);
		//driver.quit();

		
		
		
		
		
		
		
		
		
		
		
		
	}
}
