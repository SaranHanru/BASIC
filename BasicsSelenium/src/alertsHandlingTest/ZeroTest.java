package alertsHandlingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroTest {

	public static void main(String[] args) throws InterruptedException {
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("http://leafground.com/pages/Alert.html");
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          
          driver.findElement(By.xpath("//button[text()='Alert Box']")).click();
          
          Alert alert = driver.switchTo().alert();
          Thread.sleep(2000);
          alert.accept();
          
          driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
          
          Alert ale = driver.switchTo().alert();
          ale.accept();
          Thread.sleep(3000);
          
          driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
          
          Alert al=driver.switchTo().alert();
          al.sendKeys("Duckling");
          al.accept();
          Thread.sleep(2000);
          
          driver.findElement(By.xpath("//button[text()='Line Breaks?']")).click();
          
          Alert aler = driver.switchTo().alert();
          aler.accept();
          Thread.sleep(2000);
          
          WebElement ne = driver.findElement(By.xpath("//button[text()='Sweet Alert']"));
          ne.click();
          //driver.switchTo().alert();
          Thread.sleep(2000);
          driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button")).click();
          Thread.sleep(2000);
          
          driver.close();
	}

}
