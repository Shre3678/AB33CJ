package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_43 {

	public static void main(String[] args) {
		ChromeDriver dri= new ChromeDriver();
		dri.get("file:///C:/Users/Lenovo/Desktop/learningHTML1.html");
		WebElement a= dri.findElement(By.name("username"));
		a.sendKeys("Shrenivas_Shetty");
		WebElement b= dri.findElement(By.id("2"));
		b.sendKeys("Shree");
		WebElement c= dri.findElement(By.name("password"));
		c.sendKeys("9912123678");
		WebElement d= dri.findElement(By.name("fname"));
		d.sendKeys("Shrenivas");
		//WebElement e= dri.findElement(By.xpath("/html/body/form[1]/input[3]")); // for sumbit button
		//e.click();
		WebElement f= dri.findElement(By.name("name1"));
		f.click();
		WebElement h= dri.findElement(By.name("name2"));
		h.click();
		WebElement i = dri.findElement(By.name("name3"));
		i.click();
		//WebElement aa = dri.findElement(By.xpath("/html/body/form[2]/input[4]"));// for sumbit button
		//aa.click();
		WebElement j = dri.findElement(By.xpath("/html/body/input[4]"));
		j.click();
		WebElement k = dri.findElement(By.xpath("/html/body/input[6]"));
		k.click();
	    WebElement l = dri.findElement(By.id("Relegion"));
		l.click();
		Select m = new Select(l);
		m.selectByIndex(0);
		WebElement n = dri.findElement(By.xpath("/html/body/input[7]"));
		n.click();
	    //dri.close();
		
	}

}
