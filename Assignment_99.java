package Assignments;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_99 
{
@Test
public void URLClass_() throws MalformedURLException
{
	
	URL a = new URL("https://www.youtube.com/watch?v=LmyEaQXGjQ8");
	
	System.out.println(a.getHost());
	System.out.println(a.getPort());
	System.out.println(a.getPath());
	System.out.println(a.getProtocol());
	System.out.println(a.getQuery());
}
}
