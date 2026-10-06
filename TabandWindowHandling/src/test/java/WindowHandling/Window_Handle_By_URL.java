package WindowHandling;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window_Handle_By_URL {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.wikipedia.org/");
		
		

		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.xpath("//span[contains(text(),'You can support our work with a donation.')]"))).click();
		
		Set<String> childWindow = driver.getWindowHandles();
		
		Thread.sleep(3000);
		
		
		for (String window : driver.getWindowHandles())
		{
			driver.switchTo().window(window);
			
			if(driver.getCurrentUrl().contains("donate.wikimedia.org"))
			{
				System.out.println("Current URL is: " + driver.getCurrentUrl());
				break;
			}
			
		}
		
		driver.close();

	}

}
