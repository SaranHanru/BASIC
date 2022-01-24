package testNGTestScripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestSuiteTestScript {
	
WebDriver driver;
long startTime;
long endTime;

	@BeforeSuite
	public void launchBrowser() {
		startTime = System.currentTimeMillis();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
	}
		
	
	@Test
	public void openGoogle() {
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void openYahoo() {
		driver.get("https://in.search.yahoo.com/?fr2=inr");		
		
	}
	
	@AfterSuite
	public void closeBrowser() {
		driver.quit();
		endTime = System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println("Total Time Taken is :"+totalTime);
	}
		
}
