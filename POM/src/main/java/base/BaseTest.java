package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	
	public static WebDriver driver;
	
	public static void initialization()
	{
		driver = new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://ui.freecrm.com/login?lang=en");
		
		driver.manage().window().maximize();
		
		
	}
}
