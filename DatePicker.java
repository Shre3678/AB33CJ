package Automation_Conceptwise;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker 
{
public static void main(String[] args) throws InterruptedException 
{
ChromeDriver driver = new ChromeDriver();
driver.get("https://www.cleartrip.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/div[1]/div[2]")).click();
driver.findElements(By.xpath("//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div/div[1]/input"));

Thread.sleep(5000);
driver.close();
}
}
