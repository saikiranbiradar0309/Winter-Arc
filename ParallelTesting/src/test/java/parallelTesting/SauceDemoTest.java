package parallelTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SauceDemoTest {
	
	@Parameters({"browser"})
	@BeforeTest
	public void setUp(String browser)
	{
		Demo5.setDriver(browser);
	}
	
	@Test
	public void testCase1() throws InterruptedException
	{
		
		WebDriver driver = Demo5.getDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.id("user-name")))
					.sendKeys("standard_user");
		
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.id("password")))
					.sendKeys("secret_sauce");
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button"))).click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.
				elementToBeClickable(By.id("add-to-cart-sauce-labs-bike-light"))).click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.
				elementToBeClickable(By.className("shopping_cart_link"))).click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("checkout"))).click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("first-name")))
					.sendKeys("Saikiran");
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("last-name")))
					.sendKeys("Biradar");
		
		
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.id("postal-code")))
					.sendKeys("560068");
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.id("continue"))).click();
		
		Thread.sleep(2000);
		
		wait.until(ExpectedConditions
				.elementToBeClickable(By.id("finish"))).click();
		
		
		Thread.sleep(4000);
		
		driver.close();
	}
}
