package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	
	WebDriver driver;
	
	
	@BeforeTest
	void login()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	
	@Test(priority = 1)
	void verifyLogo()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Assert.assertTrue(wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("//img[@alt='company-branding']"))).isDisplayed());
	
	}
	
	
	@Test(priority = 2)
	void enterCredentials() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated
					(By.xpath("//input[@name='username']"))).sendKeys("Admin");
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated
					(By.xpath("//input[@name='password']"))).sendKeys("admin123");
		
		
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.
				elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		
		
		
	}
	
	@Test(dependsOnMethods = {"enterCredentials"}, retryAnalyzer = RetryAnalyzer.class)
	void verifyLogin()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		Assert.assertTrue(wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath("//img[contains(@alt,'')]"))).isDisplayed());
		// client brand banner
		// Add the above in xpath alt content 
		// Removed only to check RetryAnalyzer
	}
	
	
	
	@AfterTest
	void tearDown()
	{
		driver.quit();
	}
	
}
