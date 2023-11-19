package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_42 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver d11= new ChromeDriver();
		d11.get("https://amazon.in/");
		WebElement abc =d11.findElement(By.id("searchDropdownBox"));
	    Select def = new Select(abc);
	    Thread.sleep(5000);
	    def.selectByValue("search-alias=stripbooks");
	    Thread.sleep(5000);
	    d11.findElement(By.id("twotabsearchtextbox")).sendKeys("The Power of Your Subconscious Mind");
	    d11.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	    d11.findElement(By.partialLinkText("The Power of Your Subconscious Mind")).click();
	    Thread.sleep(4000);
        d11.close();
	}

}

        