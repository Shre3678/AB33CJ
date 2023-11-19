package Assignments;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_100 
{
@Test
public void Findoutthebrokenlinks() throws InterruptedException, IOException
{
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.flipkart.com");
	List <WebElement> links =driver.findElements(By.tagName("a"));
	
	System.out.println(links.size());
	for(int i=1;i<links.size();i++)
	{
		WebElement b =links.get(i);
		String a=b.getAttribute("href");
	System.out.println(a);
		CreateConnectiontoFindbrokenlinks(a); 
	}
	
}

static void CreateConnectiontoFindbrokenlinks(String a) throws IOException {
	 
	URL urls= new URL(a);
	HttpURLConnection a1= (HttpURLConnection)urls.openConnection();
             a1.connect();
             a1.getResponseCode();
             System.out.println(a1.getResponseCode());
if(a1.getResponseCode()==200)
{
	System.out.println(a+"Its valid");
}
else
{
	System.out.println(a+"Its not valid");
}
}
}
