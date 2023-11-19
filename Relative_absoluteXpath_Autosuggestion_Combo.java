package Automation_Conceptwise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Relative_absoluteXpath_Autosuggestion_Combo {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
driver.get("https://www.amazon.in");
driver.manage().window().maximize();
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone");
Thread.sleep(5000);
List<WebElement> AutoSugg=driver.findElements(By.xpath("//div[@class=\"two-pane-results-container\"]/div/div"));

int size=AutoSugg.size();
System.out.println(size);
AutoSugg.get(size-4).click();

Thread.sleep(5000);
driver.close();

	}

}
