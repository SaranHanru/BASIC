package alertsHandlingTest;

//import java.util.ArrayList;
//import java.util.Collection;
//import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
          WebDriver driver =new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("http://leafground.com/pages/Dropdown.html");
          driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
          
           WebElement dropDown1 = driver.findElement(By.id("dropdown1"));
           Select s=new Select(dropDown1);
           s.selectByIndex(1);
           //System.out.println(s.isMultiple());
           
           WebElement dropDown2 = driver.findElement(By.name("dropdown2"));
           Select s2=new Select(dropDown2);
           s2.selectByVisibleText("Appium");
           
           WebElement dropDown3 = driver.findElement(By.id("dropdown3"));
           Select s3=new Select(dropDown3);
           s3.selectByValue("3");
           
           WebElement dropDown4 = driver.findElement(By.className("dropdown"));
           Select s4=new Select(dropDown4);
           
           //ArrayList a=new ArrayList();
           
           List<WebElement> listOfOptions = s4.getOptions();
           int size = listOfOptions.size();
           System.out.println(size);
           
           //for(WebElement alloption:listOfOptions) {
   		    //String text = alloption.getText();
   			//System.out.println(text);
   			//a.add(text);
           //}
            //Collections.sort(a);
            
            //for(Object all:a) {
    			//System.out.println(all);
    		//}
           
           WebElement dropDown5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
           dropDown5.sendKeys("Loadrunner");
           Thread.sleep(3000);
           
           WebElement multipleSelectBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
           Select s5=new Select(multipleSelectBox);
           s5.selectByIndex(1);
           s5.selectByIndex(2);
           s5.selectByIndex(3);
           System.out.println("Is S5 is multiple Select box is : " +s5.isMultiple());
           Thread.sleep(3000);
           driver.close();
	}
	
}
