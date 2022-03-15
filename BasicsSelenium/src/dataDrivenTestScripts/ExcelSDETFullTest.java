package dataDrivenTestScripts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import utilityPackage.XLUtility;

public class ExcelSDETFullTest  {
	WebDriver driver;
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
	}
	
	/*@Test
	public void homePage() {
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
	    driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	}*/
	
	/*@Test
	public void leadPage() throws IOException {
		String Path=".\\DataFiles\\LATDDT.xlsx";
		XLUtility xl=new XLUtility(Path);
		xl.getCellData("Sheet3",1 , 0);
		
	    driver.findElement(By.name("firstname")).sendKeys(xl.getCellData("Sheet3", 1, 0));
	   /* WebElement lastName = driver.findElement(By.name("lastname"));
		WebElement company = driver.findElement(By.xpath("//input[@name='company']"));
		WebElement titleName = driver.findElement(By.id("designation"));
		WebElement annualRev = driver.findElement(By.name("annualrevenue"));
		annualRev.clear();
		WebElement empCount = driver.findElement(By.id("noofemployees"));
		WebElement eMail = driver.findElement(By.id("email"));
		WebElement phn = driver.findElement(By.id("phone"));
		WebElement saveBtn = driver.findElement(By.xpath("//input[@title='Save [Alt+S]']"));*/
	}
	
	/*@Test
	public void logout() {
		driver.close();
	}*/
