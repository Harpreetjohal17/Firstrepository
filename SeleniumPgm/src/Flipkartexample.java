import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkartexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		/*driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Create')]")).click();*/
		
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		Thread.sleep(2000);
		WebElement fashion =driver.findElement(By.xpath("//div[text()='Fashion']"));
		
		
		
		Actions act = new Actions(driver);
		act.moveToElement(fashion).perform();
		
		Thread.sleep(4000);
		WebElement western =driver.findElement(By.xpath("//a[contains(text(),'Women Western')]"));
		act.moveToElement(western).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Women Dresses')]")).click();
		
		
	}

}
