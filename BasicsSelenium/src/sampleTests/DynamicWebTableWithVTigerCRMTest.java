package sampleTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTableWithVTigerCRMTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.id("submitButton")).click();
		driver.findElement(By.xpath("//td[@class='tabUnSelected']//a[text()='Leads']")).click();
		
	    ////*[@id="row_51"]/td[2] ////*[@id="row_51"]/td[3]/a
		////*[@id="row_51"]/td[2] //
		////*[@id="row_52"]/td[2] //
		////*[@id="row_53"]/td[2] //
		////*[@id="row_54"]/td[2] //
		////*[@id="row_55"]/td[2] //
		////*[@id="row_56"]/td[2] //
		//*[@id="53"]
		//*[@id="selectCurrentPageRec"]
		//*[@id="51"]
		
		//Method : 1
		
		/*String before_Xpath="//*[@id=\"row_";
		String after_Xpath="\"]/td[3]";
		
		for(int i=51;i<=56;i++) {
		String name = driver.findElement(By.xpath(before_Xpath+i+after_Xpath)).getText();
		System.out.println(name);
		
		if(name.contains("LEA50")) {
			driver.findElement(By.xpath("//*[@id="+i+"]")).click();
		}
		}
		Thread.sleep(2000);
		driver.close();*/
		
		//Method : 2
		
		driver.findElement(By.xpath("//a[contains(text(),'Pazhani')]/parent::td//preceding-sibling::td//input[@name='selected_id']")).click();
		driver.close();		
}
}