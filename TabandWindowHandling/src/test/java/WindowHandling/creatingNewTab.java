package WindowHandling;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class creatingNewTab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		driver.switchTo().newWindow(WindowType.TAB);
		
		driver.get("https://www.facebook.com");
		
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
