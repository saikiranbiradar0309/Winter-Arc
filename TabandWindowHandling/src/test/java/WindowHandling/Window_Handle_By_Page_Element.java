package WindowHandling;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Window_Handle_By_Page_Element {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.wikipedia.org/");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'You can support our work with a donation.')]"))).click();
		
		
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		
		
		for (String window: driver.getWindowHandles())
		{
			driver.switchTo().window(window);
			
			if(driver.findElement(By.xpath("//h1[@id='firstHeading']")).size() > 0)
			{
				break;
			}
		}
	}

}
