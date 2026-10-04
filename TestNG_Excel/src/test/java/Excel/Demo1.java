package Excel;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demo1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		// Connect Java to the Excel file.
		FileInputStream fis = new FileInputStream("/Users/saikiranbiradar/Downloads/TestNG-1(Parabank_test_data).xlsx");
		
		
		// Load the Excel workbook using the file connection.
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		
		// Choose the Excel sheet you want to read.
		XSSFSheet sheet = workbook.getSheet("TestNG-1(Parabank_test_data)");
		
		
		// Read the value from a particular row and column.
		String firstName = sheet.getRow(0).getCell(0).getStringCellValue();
		String lastName = sheet.getRow(0).getCell(1).getStringCellValue();
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated
				(By.xpath("//input[@id='customer.firstName']"))).sendKeys(firstName);
		
		wait.until(ExpectedConditions.
				visibilityOfElementLocated(By.xpath("//input[@id='customer.lastName']"))).sendKeys(lastName);
		
		
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
	}
}
