package Automation_Conceptwise;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_shopping 
{
@Test
public void AmAmazon()
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	driver.navigate().to("https://www.amazon.com");
	driver.manage().window().maximize();
	driver.navigate().to("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
	WebElement Email=driver.findElement(By.name("email"));
	Email.click();
	Email.sendKeys("srinivasshetty438@gmail.com");
	driver.findElement(By.id("continue")).click();
	WebElement Paassword= driver.findElement(By.name("password"));
	Paassword.click();
	Paassword.sendKeys("Shre$56789");
	driver.findElement(By.id("signInSubmit")).click();
	WebElement Searchbox=driver.findElement(By.id("twotabsearchtextbox"));
	Searchbox.click();
	Searchbox.sendKeys("Running Shoes for Men");
	Searchbox.sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]")).click();
	Set<String> child =driver.getWindowHandles();
            Iterator<String> a=child.iterator();
                  String parentw =a.next();
                  String childw =a.next();
   	        driver.switchTo().window(childw);    
	//driver.findElement(By.name("submit.buy-now")).click();
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.id("nav-cart-count")).click();
	driver.findElement(By.name("proceedToRetailCheckout")).click();
	WebElement Verfication_MN=driver.findElement(By.name("cvf_phone_num"));
	Verfication_MN.click();
	Verfication_MN.sendKeys("9912123678");
	driver.findElement(By.name("cvf_action")).click();
	
	
	//driver.close();
}
}
                                        