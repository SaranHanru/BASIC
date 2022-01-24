package testNGTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestScript {

	@Test
	public void openGoogle() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	driver.manage().window().maximize();
	driver.quit();
	}
	
	@Test
	public void openBing() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		driver.quit();	
	}
}
