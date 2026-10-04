package parallelTesting;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
	
	
	private static ThreadLocal<WebDriver> threadLocal = 
				new ThreadLocal<WebDriver>();
	
	
	public static WebDriver getInstance()
	{
		WebDriver driver = new ChromeDriver();
		threadLocal.set(driver);
		
		return threadLocal.get();
	}
	
	
	@Test
	public void testCase1() throws InterruptedException 
	{
		WebDriver driver = Demo2.getInstance();
		
		driver.get("https://www.amazon.in");
		String title = driver.getTitle();
		System.out.println(title);
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
