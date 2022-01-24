package advancedSelConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SortablesTest {

	public static void main(String[] args) {
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("http://leafground.com/pages/sortable.html");
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          
          List<WebElement> sortable = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
          WebElement fromElement = sortable.get(6);
          WebElement toElement = sortable.get(0);
          
          Actions action=new Actions(driver);
          action.clickAndHold(fromElement);
          action.moveToElement(toElement);
          action.release(toElement);
          action.perform();
          
          driver.close();
}

}
