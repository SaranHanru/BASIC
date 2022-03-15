package dataDrivenTestScripts;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SDETAutoExcelDDTUsingForLoop {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String excelPath=".\\DataFiles\\sports.xlsx";
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		
		Sheet sheet = wb.getSheetAt(0);
		int rows = sheet.getLastRowNum();
		int cols = sheet.getRow(1).getLastCellNum();
		
		for(int i=0;i<=rows;i++) 
		{
			Row row = sheet.getRow(i);
			for(int j=0;j<cols;j++)
			{
			  Cell cell = row.getCell(j);
			  
			  switch(cell.getCellType())
			  {
			  case STRING: System.out.print(cell.getStringCellValue());break;
			  case NUMERIC: System.out.print(cell.getNumericCellValue());break;
			  case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
			  default:
				break;
			  }
			  System.out.print(" | ");
			}
			System.out.println();
		}
	}

}
