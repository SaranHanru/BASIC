package advancedSelConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLinksTest {

	public static void main(String[] args) throws InterruptedException {
          WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("http://leafground.com/pages/Link.html");
          driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
          
          WebElement HomePage = driver.findElement(By.xpath("//a[text()='Go to Home Page']"));
          HomePage.click();
          driver.navigate().back();
          
          WebElement whereTo = driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']"));
          String directingTo = whereTo.getAttribute("href");
          System.out.println("Page directing to : "+directingTo);
          
          WebElement brokenPage = driver.findElement(By.xpath("//a[text()='Verify am I broken?']"));
          brokenPage.click();
          String pageTitle = driver.getTitle();
          //System.out.println(pageTitle);
          
          if(pageTitle.equals("HTTP Status 404 – Not Found")) {
        	  System.out.println("Link is broken");
          }
          else {
        	  System.out.println("Link is not broken");
          }
          driver.navigate().back();
          
          WebElement HomePage1 = driver.findElement(By.xpath("//a[text()='Go to Home Page']"));
          HomePage1.click();
          
          List<WebElement> numOfLinks = driver.findElements(By.tagName("a"));
          int size = numOfLinks.size();
          System.out.println("links in this page were : "+size);
          driver.close();
	}

}
