import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectcountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\parde\\Desktop\\SeleniumJars\\chromedriver.exe");
//		System.setProperty("webdriver.gecko.driver", 
//				"C:\\Users\\parde\\Desktop\\SeleniumJars\\geckodriver.exe");
//		
		WebDriver driver = new ChromeDriver(); //runtime polymorhism
		
	//	WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
	WebElement Seldrop = driver.findElement(By.name("country"));
	Select sel = new Select(Seldrop);
	List<WebElement> li = sel.getOptions();
	System.out.println(li.size());

	
	for(int i=0; i<li.size(); i++)
	{
	System.out.println(li.get(i).getText());
	   if (li.get(i).getText().equalsIgnoreCase("INDIA"))// if country is india the loop should terminate
			{
		   
		   li.get(i).click();
					break;
			}
		
	    
			
			
		}
		
		
	}
	

}
