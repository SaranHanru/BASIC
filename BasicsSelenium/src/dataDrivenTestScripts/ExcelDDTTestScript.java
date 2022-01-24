package dataDrivenTestScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelDDTTestScript {

	public static void main(String[] args) throws IOException, InterruptedException  {
		
		FileInputStream fis=new FileInputStream("C:\\Users\\admin\\OneDrive\\Desktop\\LATDDT.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String us = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		String pwd = wb.getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();	
		String amt = wb.getSheet("Sheet1").getRow(2).getCell(2).getStringCellValue();
			
		/*
		 * WebDriver driver=new ChromeDriver(); driver.manage().window().maximize();
		 * driver.get("https://demoapp.skillrary.com/login.php?type=login");
		 * driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 * driver.findElement(By.id("email")).sendKeys(us);
		 * driver.findElement(By.id("password")).sendKeys(pwd);
		 * driver.findElement(By.id("last")).click();
		 */
			  
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys(us);
		driver.findElement(By.name("user_password")).sendKeys(pwd);
		driver.findElement(By.id("submitButton")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//img[@title='Create Lead...']")).click();
		WebElement field = driver.findElement(By.name("annualrevenue"));
		field.clear();
		field.sendKeys(amt);
		Thread.sleep(3000);
		driver.findElement(By.name("button")).click();
	    driver.quit();
	}

}
