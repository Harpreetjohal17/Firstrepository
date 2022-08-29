import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Kayak {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		
		Thread.sleep(3000);
		//WebdriverWait wt = new WebDriverwait(driver,20);
		driver.manage().window().maximize();
		
		//Source Selection
		driver.findElement(By.xpath("(//div[@aria-label='Remove'])[1]")).click();
		driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys("San Fran");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='From?']")).sendKeys(Keys.ENTER);
		
		//Destination Selection
		driver.findElement(By.xpath("//input[@placeholder='To?']")).sendKeys("Del");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='To?']")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.xpath("//input[@placeholder='To?']")).sendKeys(Keys.ENTER);
		
		//Source Date
		driver.findElement(By.xpath("//span[@aria-label='Start date calendar input']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='15' and contains(@class,'isPriceMedium')]")).click();
		
		//Return Date
		driver.findElement(By.xpath("(//div[text()='27' and contains(@class,'isPriceMedium')])")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
}
}
