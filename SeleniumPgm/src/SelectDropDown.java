import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
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
		
	WebElement seldrop = 	driver.findElement(By.id("searchDropdownBox"));
	
	Select sel = new Select(seldrop);
	
	sel.selectByIndex(4);
	
	sel.selectByValue("search-alias=baby-products");
	
	sel.selectByVisibleText("CDs & Vinyl");

	}

}
