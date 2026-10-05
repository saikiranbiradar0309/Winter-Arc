package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frame_Demo1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		// Handling Frame 1
		
		
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		
		driver.switchTo().frame(frame1);
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("//input[@name='mytext1']"))).sendKeys("Saikiran");
		
		
		driver.switchTo().defaultContent();
		
		
		// Switch to Frame2
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frame2);
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("//input[@name='mytext2']"))).sendKeys("Biradar");
		
		
		driver.switchTo().defaultContent();
		
		
		Thread.sleep(3000);
		
		driver.close();
	}

}
