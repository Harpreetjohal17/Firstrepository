import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\parde\\Desktop\\SeleniumJars\\geckodriver.exe");
//		
		WebDriver driver = new ChromeDriver(); //runtime polymorhism
		
	//	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
	WebElement accountlist =	driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	
	Actions act  = new Actions(driver);
	
	act.moveToElement(accountlist).perform();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()='Account']")).click();
	

	}

}
