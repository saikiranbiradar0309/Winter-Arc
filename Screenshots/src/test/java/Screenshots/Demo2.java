package Screenshots;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

		driver.get("https://www.naukri.com");


		WebElement landingLoginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='login_Layer']")));


		File screenshot = landingLoginButton.getScreenshotAs(OutputType.FILE);

		File destination = new File("screenshots/naukri_login.png");

		Files.copy(screenshot.toPath(), destination.toPath());
		
		
		driver.close();
	}

}
