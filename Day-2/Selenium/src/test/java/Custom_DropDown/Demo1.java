package Custom_DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.playwrightautomation.com/practice.html#section-dropdowns");
		
		
		// 1. Locate the DropDown
		WebElement jobTitle = wait.until(ExpectedConditions.
				elementToBeClickable
					(By.xpath("//div[@class='bd-select-trigger']")));
		
		
		// 2. click the dropdown
		jobTitle.click();
		
		
		// 3. Locate the Required Option
		WebElement jobRole = wait.until(ExpectedConditions.
				visibilityOfElementLocated
					(By.xpath("//ul[@id='bd-job-title-menu']//li[contains(text(),'DevOps Engineer')]")));
		
		jobRole.click();
		
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
