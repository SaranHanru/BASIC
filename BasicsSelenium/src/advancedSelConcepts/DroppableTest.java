package advancedSelConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DroppableTest {

	public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://leafground.com/pages/drop.html");
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         
         WebElement drag = driver.findElement(By.id("draggable"));
         WebElement drop = driver.findElement(By.id("droppable"));
         
         Actions a=new Actions(driver);
         //a.clickAndHold(drag).moveToElement(drop).release(drop).perform();
         a.dragAndDrop(drag, drop).perform();
	}

}
