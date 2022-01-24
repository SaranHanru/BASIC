package dataDrivenTestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelNewDDTScript {
	
	static List<String> userNameList=new ArrayList<String>();
    static List<String> passWordList=new ArrayList<String>();
    
	public void readExcel() throws  IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\LATDDT.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		
		 /*
		 * Method and Alter Method for Entering into Respective Sheet
		 */
		 // Sheet sheet = wb.getSheet("Sheet1");
		Sheet sheet = wb.getSheetAt(0);
		  
		      Iterator<Row> rowIterator = sheet.iterator();
		      while(rowIterator.hasNext()) {
			  Row rowValue = rowIterator.next();
			  
			  Iterator<Cell> columnIterator = rowValue.iterator();
			  int i=2;
			  while(columnIterator.hasNext()) {
				  if(i%2==0) {
					  userNameList.add(columnIterator.next().getStringCellValue()); 
				  }else {
					  passWordList.add(columnIterator.next().getStringCellValue());
				  }
			       i++;
			  }
		  }	  
	  }
	
	public void executeTest() {
		for(int i=0; i < userNameList.size();i++) {
			login(userNameList.get(i),passWordList.get(i));
		}	
	}

	public void login(String uName, String pWord) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement userName = driver.findElement(By.name("user_name"));
		userName.sendKeys(uName);
		WebElement passWord = driver.findElement(By.name("user_password"));
		passWord.sendKeys(pWord);
		driver.findElement(By.id("submitButton")).click();
	}
	
	public static void main(String[] args) throws IOException {
		ExcelNewDDTScript ddtUsingPoi=new ExcelNewDDTScript();
		ddtUsingPoi.readExcel();
 }
	}
