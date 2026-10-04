package Youtube;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		
		FileInputStream fis = new FileInputStream("/Users/saikiranbiradar/Reminders/TestNG_Excel/testdata/Book 5.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = workbook.getSheet("Book_Indent");  	// Preferred
		//XSSFSheet sheet = workbook.getSheetAt(0);  // Index value 
		
		
		// FInd out No.of Rows 
		int totalRows = sheet.getLastRowNum();
		
		System.out.println("Number of Rows: " + totalRows);
		
		
		
		// FInd out No.of Cells 
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of Cells: " +totalCells);
		
		
		for(int rows=0; rows<=totalRows; rows++)
		{
			XSSFRow currentRow = sheet.getRow(rows);
			
			for(int cells=0; cells<totalCells; cells++)
			{
				XSSFCell cell = currentRow.getCell(cells);
				System.out.print(cell.toString() +"\t");
			}
			
			System.out.println();
		}
		
		
		workbook.close();
		
		fis.close();
		

	}

}
