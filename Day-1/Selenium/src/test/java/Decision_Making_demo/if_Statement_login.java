package Decision_Making_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class if_Statement_login {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		
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
		
		
		if (driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).isDisplayed())
		{
			System.out.println("User is logged in");
		}
		Thread.sleep(3000);

		
		driver.quit();

	}

}
