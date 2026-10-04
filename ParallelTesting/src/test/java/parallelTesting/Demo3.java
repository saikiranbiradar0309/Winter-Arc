package parallelTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo3 {
	
	private static ThreadLocal<WebDriver> threadLocal = 
			new ThreadLocal<WebDriver>();


	public static WebDriver getInstance()
	{
		WebDriver driver = new ChromeDriver();
		threadLocal.set(driver);
		
		return threadLocal.get();
	}
	
	@Test
	public void testCases2() throws InterruptedException
	{
		WebDriver driver = Demo3.getInstance();
		driver.get("https://www.instagram.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		driver.quit();
	}
}
