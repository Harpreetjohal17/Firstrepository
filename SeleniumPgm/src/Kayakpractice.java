import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Kayakpractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kayak.co.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Business']")).click();
		WebElement Element= driver.findElement(By.xpath("//div[@class='MvE2 MvE2-v2']"));
		Actions act = new Actions(driver);
		act.moveToElement(Element).perform();
		
		driver.findElement(By.xpath("//div[text()='Car Rental']")).click();
		

	}

}
