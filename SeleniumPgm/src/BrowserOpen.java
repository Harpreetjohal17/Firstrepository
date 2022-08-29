import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserOpen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\parde\\Desktop\\SeleniumJars\\geckodriver.exe");
//		
		WebDriver driver = new ChromeDriver(); //runtime polymorhism
		
	//	WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Testing");
	
		
		//geckodriver

	}
}


