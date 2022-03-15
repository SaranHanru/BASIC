package sampleTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonSignInXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[text()='Sign in']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele1);
		ele1.click();

	}

}
