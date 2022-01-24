package initialSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement Ele = driver.findElement(By.id("email"));
		Ele.sendKeys("admin");
		Point Location = Ele.getLocation();
		System.out.println(Location.getX());
		System.out.println(Location.getY());
		//int x = Location.getX();
		//System.out.println(x);
		//int y = Location.getY();
		//System.out.println(y);
		driver.close();
	}

}
