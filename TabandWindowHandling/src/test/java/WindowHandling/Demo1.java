package WindowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		
		driver.close();

	}

}
