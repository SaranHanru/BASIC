package advancedSelConcepts;

//import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteTest {

	public static void main(String[] args) {
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("http://leafground.com/pages/autoComplete.html");
         driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
         
         driver.findElement(By.id("tags")).sendKeys("s");
         List<WebElement> listOfOptions = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
         System.out.println(listOfOptions.size());
         
         for(WebElement webElement : listOfOptions) {
        	 if(webElement.getText().equals("SOAP")) {
        		 webElement.click();
        		 System.out.println("If Part");
        		 break;
        	 }
        	 else {
        		 //webElement.click();
        		 //System.out.println("Else Part");
        		 //break;
        	 }
        	 
         }
         driver.close();
	}

}
