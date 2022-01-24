package initialSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsTest {

	public static void main(String[] args) throws InterruptedException {
		/**WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.close();**/
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/index.php");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//a[text()='LOGIN']")).click();
		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("admin");
		driver.findElement(By.id("last")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a/span")).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.close();	
	}

}
