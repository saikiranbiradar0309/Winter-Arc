package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		File destination = new File("screenshots/google.png");
		
		
		Files.copy(source, destination);
		
		
		driver.close();

	}

}
