package dataDrivenTestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class SDETAutoExcelDDTUsingIterator {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		String excelPath=".\\DataFiles\\sports.xlsx";
		FileInputStream fis=new FileInputStream(excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheetAt(0);
		
		Iterator<Row> rowIterator = sheet.iterator();
		while(rowIterator.hasNext())
		{
		Row rowvalue = rowIterator.next();	
		
		Iterator<Cell> cellIterator = rowvalue.iterator();
		while(cellIterator.hasNext())
		  {
			Cell cellValue = cellIterator.next();
			switch(cellValue.getCellType())
			  {
			  case STRING: System.out.print(cellValue.getStringCellValue());break;
			  case NUMERIC: System.out.print(cellValue.getNumericCellValue());break;
			  case BOOLEAN: System.out.print(cellValue.getBooleanCellValue());break;
			  default:
				break;
		      }
			System.out.print("  |  ");
		  }
		System.out.println();
		}
}
}
