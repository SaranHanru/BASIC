package initialSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningBrowserScript {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/**
		ChromeDriver c=new ChromeDriver();
		c.manage().window().maximize();
		Thread.sleep(3000);
		c.close();**/
		/**
		//to launch empty firefox browser
		FirefoxDriver fd=new FirefoxDriver();
		fd.manage().window().maximize();
		Thread.sleep(3000);
		fd.close();
		**/
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.javascriptkit.com/javatutors/alert2.shtml");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
