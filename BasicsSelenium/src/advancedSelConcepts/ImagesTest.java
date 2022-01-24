package advancedSelConcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesTest {

	public static void main(String[] args) throws InterruptedException {
            WebDriver driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://leafground.com/pages/Image.html");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            
            driver.findElement(By.xpath("//img[@src='../images/home.png']")).click();
            Thread.sleep(2000);
            driver.navigate().back();
            
            WebElement brokenImg = driver.findElement(By.xpath("//img[@src='../images/abcd.jpg']"));
            
            //naturalWidth is used to check the width i.e Whether the image is broken or not --> if Width = 0 img broken.., Width = 1 img is not broken 
            if(brokenImg.getAttribute("naturalWidth").equals("0")) {
            	System.out.println("The image is Broken");
            }
            else {
            	System.out.println("The image is not broken");
            }
            driver.close();          
	}

}
