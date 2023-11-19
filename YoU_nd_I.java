package youtube_songs;
        import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class YoU_nd_I {

			public static void main(String[] args) throws InterruptedException {
				ChromeDriver b1= new ChromeDriver();
				b1.get("https://youtube.com/");
				b1.manage().window().maximize();
				b1.findElement(By.name("search_query")).sendKeys("You and I");
				Thread.sleep(6000);
			  WebElement abc= b1.findElement(By.name("search_query"));
			  abc.sendKeys(Keys.ENTER);
			   Thread.sleep(6000);
			WebElement def =  b1.findElement(By.partialLinkText("Katy"));
			def.click();
		         Thread.sleep(400000);
			}

			}
