package Youtube;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDataIntoExcel {
	
	public static void main(String[] args) throws IOException {
		
		
		// Create a FileOutputStream to specify the location
        // where the Excel file will be created
		FileOutputStream fos = new FileOutputStream("/Users/saikiranbiradar/Reminders/TestNG_Excel/testdata/Items_Purchased.xlsx");
	
		
		// Create a new Excel workbook
		XSSFWorkbook workbook = new XSSFWorkbook();
	
		
        // Create a new worksheet named "Data"
		XSSFSheet sheet = workbook.createSheet("Data");
		
		// Create the first row at index 0
        // This row will contain the column headers
		XSSFRow row1 = sheet.createRow(0);
		row1.createCell(0).setCellValue("ItemName");
		row1.createCell(1).setCellValue("PuchaseDate");
		row1.createCell(2).setCellValue("Price");
		row1.createCell(3).setCellValue("Location");
		
		
		XSSFRow row2 = sheet.createRow(1);
		row2.createCell(0).setCellValue("Macbook Air M5");
		row2.createCell(1).setCellValue("13/09/2026");
		row2.createCell(2).setCellValue("129999");
		row2.createCell(3).setCellValue("Jambagi");
		
		
		XSSFRow row3 = sheet.createRow(2);
		row3.createCell(0).setCellValue("Samsung S25 Ultra");
		row3.createCell(1).setCellValue("28/09/2026");
		row3.createCell(2).setCellValue("92999");
		row3.createCell(3).setCellValue("Bengaluru");
		
		
		XSSFRow row4 = sheet.createRow(3);
		row4.createCell(0).setCellValue("Iphone 17 Pro Max");
		row4.createCell(1).setCellValue("02/10/2026");
		row4.createCell(2).setCellValue("139999");
		row4.createCell(3).setCellValue("Bengaluru");
		
		
		XSSFRow row5 = sheet.createRow(4);
		row5.createCell(0).setCellValue("Iphone 15");
		row5.createCell(1).setCellValue("31/07/2025");
		row5.createCell(2).setCellValue("90999");
		row5.createCell(3).setCellValue("Bengaluru");
		
		
		
        // Write the workbook data into the Excel file
		workbook.write(fos);
		
		workbook.close();
		fos.close();
		
		
		System.out.println("File is Created");
	
	}
}
