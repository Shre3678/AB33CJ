package Automation_Conceptwise;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_conc {

	public static void main(String[] args) {
		ChromeDriver Open = new ChromeDriver();
		Open.get("https://grotechminds.com/registration/");
		//Open.switchTo().alert().accept();
		Open.manage().window().maximize();
		Open.findElement(By.name("file-935")).sendKeys("C:\\Users\\Lenovo\\Desktop\\AB 33.pdf");
	}

}
