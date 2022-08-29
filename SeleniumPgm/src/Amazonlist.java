import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazonlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\parde\\Desktop\\SeleniumJars\\geckodriver.exe");
//		
		WebDriver driver = new ChromeDriver(); // runtime polymorhism

		// WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();

		WebElement accountlist = driver.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
		Actions act = new Actions(driver);

		act.moveToElement(accountlist).perform();
		//List<WebElement> li = driver.findElements(By.xpath("//a[@class='nav-link nav-item']"));
		List<WebElement> li = driver.findElements(By.xpath("//div[@class='nav-title']|//a[@class='nav-link nav-item'] "));
		System.out.println(li.size());
		
		for(int i = 0 ; i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
		}
		
		//System.out.println(li.size());

	}

}
