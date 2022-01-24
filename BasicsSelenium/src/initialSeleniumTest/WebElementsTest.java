package initialSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Ele = driver.findElement(By.id("email"));
		Ele.sendKeys("admin");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(Ele.getText());
		System.out.println(Ele.getLocation());
		System.out.println(Ele.getSize());
		System.out.println(Ele.getTagName());
		System.out.println(Ele.getRect());
		Thread.sleep(2000);
		Ele.clear();
		Thread.sleep(2000);
		driver.close();
	}

}
