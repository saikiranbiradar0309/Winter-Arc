package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Demo5 {
	
	private static ThreadLocal<WebDriver> threadLocal =
			new ThreadLocal<WebDriver>();
	
	
	
	// Setting Driver
	public static void setDriver(String browser)
	{
		if(browser.equals("chrome"))
		{
			WebDriver driver = new ChromeDriver();
			threadLocal.set(driver);
		}
		
		else if(browser.equals("safari"))
		{
			WebDriver driver = new SafariDriver();
			threadLocal.set(driver);
		}
		else
		{
			System.out.println("Invalid Driver");
		}
	}
	
	
	
	// Getting Driver
	public static WebDriver getDriver()
	{
		return threadLocal.get();
	}
}
