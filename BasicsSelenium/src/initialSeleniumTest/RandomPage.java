package initialSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class RandomPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("SkillRary: Online Courses - Learn Anywhere, Learn Any Skill"))
		{
			System.out.println("Pass : Title is Dispalyed");
		}
		else
		{
			System.out.println("Fail : Title is not dispalyed");
		}
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		String url = driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.close();
	}

}
