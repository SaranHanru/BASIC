package advancedSelConcepts;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFileTest {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://leafground.com/pages/download.html");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
       WebElement trynew = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div/div[3]/div[2]/a[1]"));
       trynew.click();
       Thread.sleep(2000);
       File fileLocation = new File("C:\\Users\\admin\\Downloads");
       File[] TotalFiles = fileLocation.listFiles();
       Thread.sleep(2000);
       for (File file : TotalFiles) {
		if(file.getName().equals("testleaf.xlsx")) {
		   System.out.println("File is downloaded");
		   break;
		}
	}       
       driver.close();
	}
}
