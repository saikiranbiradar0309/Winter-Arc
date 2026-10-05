package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		Thread.sleep(3000);
		
		
		// Simple Alert
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='alert']"))).click();
		
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
		
		Thread.sleep(3000);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='empty-alert']"))).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.close();

	}

}
