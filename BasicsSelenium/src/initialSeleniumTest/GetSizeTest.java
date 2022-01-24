package initialSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeTest {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		/**WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Ele = driver.findElement(By.id("email"));
		Ele.sendKeys("admin");
		Dimension Size = Ele.getSize();
		System.out.println(Size.getHeight());
		System.out.println(Size.getWidth());**/
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Hi");
		ele.clear();
		//System.out.println(ele.getAttribute("title"));
		String value = ele.getAttribute("title");
		System.out.println(value);
		Thread.sleep(3000);
		if(ele.getAttribute("title").equals(value))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
	}

}
