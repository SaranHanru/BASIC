package advancedSelConcepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesTest {

	public static void main(String[] args) {
             WebDriver driver=new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("http://leafground.com/pages/frame.html");
             driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
             
             driver.switchTo().frame(0);
             WebElement frame1 = driver.findElement(By.id("Click"));
             frame1.click();
             System.out.println(frame1.getText());
             String finalText = frame1.getText();
             if(finalText.equals("Hurray! You Clicked Me.")) {
            	 System.out.println("enters frame");
             }
             else {
            	 System.out.println("not enters frame");
             }
             driver.switchTo().defaultContent();
             driver.switchTo().frame(1);
             driver.switchTo().frame("frame2");
             WebElement frame2 = driver.findElement(By.id("Click1"));
             frame2.click();
             System.out.println(frame2.getText());
             String FrameText = frame2.getText();
             if(FrameText.equals("Hurray! You Clicked Me.")) {
            	 System.out.println("Frame 2 enters inside");
             }
             else {
            	 System.out.println("Not enters into frame");
             }
             
             driver.switchTo().defaultContent();
             List<WebElement> TotalFrames = driver.findElements(By.tagName("iframe"));
             System.out.println(TotalFrames.size());
             
             driver.close();
	}

}
