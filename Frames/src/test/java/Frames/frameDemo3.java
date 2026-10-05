package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frameDemo3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_1.html']")));
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("//input[@name='mytext1']"))).sendKeys("Saikiran");
		
		Thread.sleep(3000);
		
		driver.switchTo().defaultContent();
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_2.html']")));
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("//input[@name='mytext2']"))).sendKeys("Biradar");
		
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//frame[@src='frame_1.html']")));
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("//input[@name='mytext1']"))).clear();
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("//input[@name='mytext1']"))).sendKeys("Sneha");
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
