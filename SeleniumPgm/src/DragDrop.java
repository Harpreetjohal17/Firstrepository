import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\parde\\Desktop\\SeleniumJars\\geckodriver.exe");
//		
		WebDriver driver = new ChromeDriver(); //runtime polymorhism
		
	//	WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		
		Thread.sleep(8000);
		//Bank element to be dragged
		WebElement src  =driver.findElement(By.xpath("//a[text()=' BANK ']"));
		//Debit side  dropping side (bank)
		WebElement Target = driver.findElement(By.id("bank"));
		
        //5000 element to be dragged
		WebElement src0 = driver.findElement(By.xpath("//a[text()= ' 5000 ']"));
		//Debit dropping side(5000)
		WebElement Target0 = driver.findElement(By.id("amt7"));
		
		//Sales element to be dropped
		WebElement src1  =driver.findElement(By.xpath("//a[contains(text(),'SALES')]"));
		//Credit dropping side(sales)
		WebElement Target1 = driver.findElement(By.id("loan"));
		//5000 element to be dragged
		WebElement src2 = driver.findElement(By.xpath("//a[text()= ' 5000 ']"));
		//Credit dropping side(5000)
		WebElement Target2 = driver.findElement(By.id("amt8"));
		Actions act = new Actions(driver);
		
		act.dragAndDrop(src, Target).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(src0, Target0).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(src1, Target1).build().perform();
		Thread.sleep(2000);
		act.dragAndDrop(src2, Target2).build().perform();

	
	
	}

}
