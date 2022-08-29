import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\parde\\Desktop\\SeleniumJars\\geckodriver.exe");
//		
		WebDriver driver = new ChromeDriver(); //runtime polymorhism
		
	//	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yatra.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
	WebElement support =	driver.findElement(By.xpath("//a[text()='Support ']"));
	
	Actions act  = new Actions(driver);
	
	act.moveToElement(support).perform();
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[text()='Talk To Us']")).click();
	
	//Thread.sleep(3000);
	
	driver.switchTo().frame("iframeChatBot"); //inside in to the frame
	Thread.sleep(3000);
	
	
	driver.findElement(By.xpath("//button[text()='Cancellation']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Start a new chat']")).click();
	driver.findElement(By.xpath("//button[text()='e-Tickets']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='Start a new chat']")).click();
	driver.findElement(By.xpath("//button[text()='Invoices']")).click();
	//driver.switchTo().defaultContent(); //come out from frame
	
	//driver.findElement(By.id("chatbot_close_button")).click();

	}

}
