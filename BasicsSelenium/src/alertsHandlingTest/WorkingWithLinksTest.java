package alertsHandlingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithLinksTest {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("http://leafground.com/pages/Link.html");
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       
       
       driver.findElement(By.linkText("Go to Home Page")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.partialLinkText("Home Page")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       driver.findElement(By.xpath("//a[text()='Go to Home Page']")).click();
       Thread.sleep(2000);
       driver.navigate().back();
       Thread.sleep(2000);
       
       driver.close();
	}

}
