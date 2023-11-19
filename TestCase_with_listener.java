package Automation_Conceptwise;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;


@Listeners(Listner_class.class)
public class TestCase_with_listener
{
	
		@Test
		public void A_case() throws IOException, InterruptedException
		{
	        
				
			Assertion a1=new Assertion();
			 a1.assertEquals("Amazon.in : book","Amazon.in : book");
			 
			 		
		}
		@Test
		public void B_case() throws IOException, InterruptedException
		{
			
		    Assertion a2=new Assertion();
			 a2.assertEquals("Amazon.in : book","Amazon");
			
			 			
		}
					
		}
	

