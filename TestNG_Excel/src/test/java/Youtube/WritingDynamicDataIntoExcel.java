package Youtube;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingDynamicDataIntoExcel {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos = new FileOutputStream("/Users/saikiranbiradar/Reminders/TestNG_Excel/testdata/Dynamic_Indent.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet = workbook.createSheet("Dynamic_Data");
		
			
		
		// Dynamic Data
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter Number of Rows you want to have");
		int numberOfRows = sc.nextInt();
		
		
		
		System.out.println("Enter Number of Cells you want to have");
		int numberOfCells = sc.nextInt();

		
		
		for(int rows=0; rows<=numberOfRows; rows++ )
		{
			
			XSSFRow currentRow = sheet.createRow(rows);
			
			for(int cells=0; cells<numberOfCells; cells++)
			{
				XSSFCell currentCell = currentRow.createCell(cells);
				
				currentCell.setCellValue(sc.next());
			}
		}
		
		
		workbook.write(fos);
		
		workbook.close();
		
		fos.close();
		
		
		System.out.println("File is Created");
		
	}

}
