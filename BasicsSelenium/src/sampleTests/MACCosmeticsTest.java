package sampleTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class MACCosmeticsTest {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.maccosmetics.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		WebElement macStackBtn = driver.findElement(By.xpath("//a[@id='header_nav_section_label_1' ]//span[text()='MACSTACK']"));
		//macStackBtn.click();
		act.moveToElement(macStackBtn).perform();
		driver.findElement(By.xpath("(//div[@class='gnav-tout__link'] //a[text()='SHOP NOW']) [1]")).click();
		System.out.println("Done");
	}

}
