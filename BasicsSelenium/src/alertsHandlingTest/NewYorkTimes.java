package alertsHandlingTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewYorkTimes {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("https://international.nytimes.com/");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		driver.findElement(By.xpath("//h3[text()='Breaking News, US News, World News, Videos - The New ...']")).click();
		driver.findElement(By.xpath("//div[@class='css-jj4aw3']//li[@class='css-cwdrld']//a[text()='Sports']")).click();
		
	}

}
////div[@class='css-jj4aw3']//li[@class='css-cwdrld']//a[text()='Sports']