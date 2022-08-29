import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calanderhandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		
		Thread.sleep(3000);
		//WebdriverWait wt = new WebDriverwait(driver,20);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//td[contains(@title,'27')])[1]")).click();
	}

}
