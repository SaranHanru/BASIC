package advancedSelConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarTest {

	public static void main(String[] args) {
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("http://leafground.com/pages/Calendar.html");
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          
          WebElement clickCal = driver.findElement(By.id("datepicker"));
          clickCal.click();
          WebElement nowCal = driver.findElement(By.xpath("//a[text()='10']"));
          nowCal.click();
          String selectedDate = nowCal.getText();
          System.out.println(selectedDate); 
          
          driver.close();
	}

}
