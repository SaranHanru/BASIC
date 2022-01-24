package advancedSelConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PlayWithSelectableTest {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leafground.com/pages/selectable.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
         List<WebElement> selectable = driver.findElements(By.xpath("//ol[@id='selectable']/li"));
         int listSize = selectable.size();
         System.out.println(listSize);
         
         /**Actions a =new Actions(driver);
         a.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).perform();**/
         
         Actions a=new Actions(driver);
         a.clickAndHold(selectable.get(0));
         a.clickAndHold(selectable.get(1));
         a.clickAndHold(selectable.get(2));
         a.perform();
        Thread.sleep(2000);
        driver.close();
	}

}
