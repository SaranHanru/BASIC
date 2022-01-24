package alertsHandlingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxTest {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://leafground.com/pages/checkbox.html");
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
        
       WebElement checkBox = driver.findElement(By.xpath("(//input[@type='checkbox'])[6]"));
       System.out.println(checkBox.isSelected());
       
       WebElement checkBox2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
       if(checkBox2.isSelected()) {
    	   System.out.println("Selected");
    	   checkBox2.click();
       }
       else {
    	   System.out.println("not selected");
       }
       
       WebElement checkBox3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));
       if(checkBox3.isSelected()) {
    	   System.out.println("Selected");
    	   checkBox3.click();
    	   System.out.println(checkBox3.isSelected());
       }
       else {
    	   System.out.println("not selected");
       }
       
       driver.findElement(By.xpath("(//input[@type='checkbox'])[9]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@type='checkbox'])[10]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@type='checkbox'])[11]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@type='checkbox'])[12]")).click();
       Thread.sleep(2000);
       driver.findElement(By.xpath("(//input[@type='checkbox'])[13]")).click();
       Thread.sleep(2000);
       driver.close();
	}
}
