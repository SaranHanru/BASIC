package advancedSelConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTipTest {
           public static void main(String[] args) {
        	   WebDriver driver=new ChromeDriver();
        	   driver.manage().window().maximize();
        	   driver.get("http://leafground.com/pages/tooltip.html");
        	   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        	   
        	   WebElement name = driver.findElement(By.id("age"));
        	   System.out.println(name.getAttribute("title"));
        	   driver.close();
           }
}
