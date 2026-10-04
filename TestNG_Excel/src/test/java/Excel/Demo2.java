package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		
		//F-> X -> X -> Data read
		
		FileInputStream fis = new FileInputStream("/Users/saikiranbiradar/Downloads/TestNG-1.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Parabank_test_data");
		
		
		String firstName = sheet.getRow(0).getCell(0).getStringCellValue();
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/register.htm");
		
		driver.findElement(By.xpath("//input[@id='customer.firstName']")).sendKeys(firstName);
	}

}
