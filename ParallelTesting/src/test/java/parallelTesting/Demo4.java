package parallelTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo4 {
	
	private static ThreadLocal<WebDriver> threadLocal =
			new ThreadLocal<WebDriver>();


	public static WebDriver getInstance()
	{
		WebDriver driver = new ChromeDriver();
		threadLocal.set(driver);
		
		return threadLocal.get();
	}
	
	
	@Test
	public void testCases1() throws InterruptedException
	{
		WebDriver driver = Demo4.getInstance();
		driver.get("https://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(4000);
		
		driver.quit();
	}
	
	
	@Test
	public void testCases2() throws InterruptedException 
	{
		WebDriver driver = Demo4.getInstance();
		driver.get("https://www.facebook.com");
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(4000);
		
		driver.quit();
	}
}
