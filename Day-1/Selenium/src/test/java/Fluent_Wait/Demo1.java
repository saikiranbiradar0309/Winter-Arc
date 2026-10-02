package Fluent_Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(4))
				.ignoring(NoSuchElementException.class);
		
		driver.get("https://www.saucedemo.com/");
		
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated
					(By.xpath("//input[@id='user-name']"))).sendKeys("standard_user");
		
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath("//input[@id='password']"))).sendKeys("secret_sauce");
		
		
		wait.until(ExpectedConditions.
				elementToBeClickable
					(By.xpath("//input[@id='login-button']"))).click();
		
		
		Thread.sleep(3000);

		
		driver.quit();
	}

}
