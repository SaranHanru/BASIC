package alertsHandlingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonsTest {

	public static void main(String[] args) throws InterruptedException {
           WebDriver driver=new ChromeDriver();
           driver.manage().window().maximize();
           driver.get("http://leafground.com/pages/Button.html");
           driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
           
           driver.findElement(By.id("home")).click();
           Thread.sleep(2000);
           driver.navigate().back();
           
           WebElement pos = driver.findElement(By.id("position"));
           Point loc = pos.getLocation();
           System.out.println(loc.getX());
           System.out.println(loc.getY());
           Thread.sleep(2000);
           
           WebElement btnColour = driver.findElement(By.id("color"));
           System.out.println(btnColour.getAttribute("style"));
           Thread.sleep(2000);
           
           WebElement btnSize = driver.findElement(By.id("size"));
           Dimension btnatt = (btnSize.getSize());
           System.out.println(btnatt.getHeight());
           System.out.println(btnatt.getWidth());
           Thread.sleep(2000);
           driver.close();
	}

}
