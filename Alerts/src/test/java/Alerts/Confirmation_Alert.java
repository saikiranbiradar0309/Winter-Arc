package Alerts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Confirmation_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		
		Thread.sleep(3000);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='confirm']"))).click();
		
		
		Thread.sleep(3000);
		
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		driver.close();
	}

}
