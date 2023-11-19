package youtube_songs;


	import java.time.Duration;

import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Play_aNgEl_bAby 
	{

		public static void main (String[] args) throws InterruptedException 
		{
			ChromeDriver driver= new ChromeDriver();
			driver.get("https://www.youtube.com/");
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
	WebElement Search=driver.findElement(By.name("search_query"));
	Search.sendKeys("Troye Sivan - Angel Baby (Lyrics) | Ruth.B , Ellie Goulding, Adele");
	Search.sendKeys(Keys.ENTER);
	Thread.sleep(6000);
	WebElement Play=driver.findElement(By.xpath("//yt-formatted-string[.='Troye Sivan - Angel Baby (Lyrics) | Ruth.B , Ellie Goulding, Adele']"));
	Play.click(); 

	}


}
