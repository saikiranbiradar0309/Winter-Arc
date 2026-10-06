package WindowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class creatingNewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(4000);
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Thread.sleep(4000);
		
		driver.get("https://www.amazon.in");
		Thread.sleep(4000);
		driver.close();

	}

}
