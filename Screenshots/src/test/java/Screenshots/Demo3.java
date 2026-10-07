package Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.google.common.io.Files;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com");
		
		File screenshot = ((HasFullPageScreenshot) driver).getFullPageScreenshotAs(OutputType.FILE);
		
		File destination = new File("screenshots/naukri_full_page.png");
		
		Files.copy(screenshot, destination);
		
		
		driver.close();

	}

}
