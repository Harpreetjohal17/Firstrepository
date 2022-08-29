import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\parde\\Desktop\\SeleniumJars\\geckodriver.exe");
//		
		WebDriver driver = new ChromeDriver(); //runtime polymorhism
		
	//	WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		Thread.sleep(8000);
		
		WebElement click =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		Actions action = new Actions(driver);
		action.doubleClick(click).perform();
		
	Alert alrt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		System.out.println(alrt.getText());
		
		alrt.accept(); //click on ok button
		//alrt.dismiss(); //cancel button
	}

}
