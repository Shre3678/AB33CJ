package Automation_Conceptwise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample {

    public static void main(String[] args) throws InterruptedException {
        // Set the path to your ChromeDriver executable
        
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Open the web page where you want to perform drag and drop
        driver.get("https://grotechminds.com/registration/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

        // Locate the source element to be dragged
        WebElement sourceElement = driver.findElement(By.name("/html/body/div/div/div[2]/div/div[30]"));

        // Locate the target element where you want to drop the source element
        WebElement targetElement = driver.findElement(By.id("/html/body/div/div/div[2]/div/div[60]/div"));

        // Create an Actions object
        Actions actions = new Actions(driver);

        // Perform the drag and drop operation
        actions.dragAndDrop(sourceElement, targetElement).build().perform();
Thread.sleep(5000);
        // Close the browser
        driver.quit();
    }
}
