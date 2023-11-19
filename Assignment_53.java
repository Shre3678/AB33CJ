package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_53 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/div/div/div[3]/div[2]/div[2]/ul/li[8]/a")).click();
        WebElement check_box=driver.findElement(By.id("chkAgreeTerms"));
        boolean a=check_box.isSelected();
		if(a==check_box.isSelected())
		{
			//check_box.click(); for Selecting
			System.out.println("Selected");
		}
		else
		{
			
			System.out.println("UnSelected");
		}
		Thread.sleep(4000);
		driver.close();
		}
	}
