package sampleTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HdfcTest {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hdfcbank.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//img[@class ='closeSummer']")).click();
		WebElement productType = driver.findElement(By.xpath("//a[text()='Select Product Type']"));
		productType.click();
		WebElement acc = driver.findElement(By.xpath("//ul[@class='dropdown1 dropdown-menu']//li[text()='Accounts']"));
		acc.click();
	}

}
