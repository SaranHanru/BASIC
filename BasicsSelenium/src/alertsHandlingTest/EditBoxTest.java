package alertsHandlingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditBoxTest {

	public static void main(String[] args) throws InterruptedException {
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("http://leafground.com/pages/Edit.html");
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           
           driver.findElement(By.id("email")).sendKeys("Testmail@hotmail.com");
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("My Mail");
           Thread.sleep(2000);
           WebElement getValue = driver.findElement(By.name("username"));
           System.out.println(getValue.getAttribute("value"));
           Thread.sleep(2000);
           driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
           Thread.sleep(2000);
           WebElement verify = driver.findElement(By.xpath("//input[@disabled='true']"));
           boolean EnabledorNot = verify.isEnabled();
           System.out.println(EnabledorNot);
           driver.close();
	}

}
