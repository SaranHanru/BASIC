package alertsHandlingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBtnTest {

	public static void main(String[] args) throws InterruptedException {
         WebDriver driver =new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://leafground.com/pages/radio.html");
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         
          WebElement check = driver.findElement(By.xpath("//input[@id='yes']"));
          check.click();
          System.out.println(check.isEnabled());
         

         WebElement Ele = driver.findElement(By.xpath("(//input[@value='1'])[2]"));
         System.out.println(Ele.isSelected());
         Thread.sleep(2000);
         /**
         WebElement ele = driver.findElement(By.xpath("(//input[@value='0'])[2]"));
         System.out.println(ele.isSelected());
         Thread.sleep(2000);
         **/
         WebElement grpCheck = driver.findElement(By.xpath("(//input[@value='1'])[3]"));
         System.out.println(grpCheck.isSelected());
         Thread.sleep(2000);
         driver.close();
	}

}
