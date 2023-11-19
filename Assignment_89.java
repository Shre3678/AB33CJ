package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_89 
{
@Test
public void amazonhomepage_ss() throws IOException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https:\\www.amazon.in");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
    
    TakesScreenshot takess=driver;
    File source=takess.getScreenshotAs(OutputType.FILE);
    File Destination = new File("C:\\\\Users\\\\Lenovo\\\\eclipse-workspace\\\\Automation_MKT\\\\For_Screenshots\\\\AmazonHomepage.jpg");
    FileUtils.copyFile(source, Destination);
    driver.close();
}
}
