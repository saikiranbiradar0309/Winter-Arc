package Select_DropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectOneOption {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://practice.expandtesting.com/dropdown");
		
		
		// 1. Find the Dropdown
		WebElement simple_Dropdown = driver.findElement(By.xpath("//select[@id='dropdown']"));
		
		
		WebElement country_DropDown = driver.findElement(By.xpath("//select[@id='country']"));
		// 2. Create a Select Object
		Select sel = new Select(simple_Dropdown);
		
		Select sel2 = new Select(country_DropDown);
		
		
		// Select By Index
		//sel.selectByIndex(1);
		//sel2.selectByIndex(10);
		
		
		// Select By Value
		//sel.selectByValue("1");
		//sel2.selectByValue("IN");
		
		
		//Select By Visible Text
		sel.selectByVisibleText("Option 2");
		sel2.selectByVisibleText("India");
		
		
		Thread.sleep(3000);
		
		driver.close();

	}

}
