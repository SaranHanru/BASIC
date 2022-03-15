package sampleTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailCreateAnAccountTest {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='Create account']")).click();
		driver.findElement(By.xpath("//span[text()='For myself']")).click();
		driver.findElement(By.id("firstName")).sendKeys("Mr.");
		driver.findElement(By.id("lastName")).sendKeys("Tester");
		driver.findElement(By.id("username")).sendKeys("testers_testmail27");
		driver.findElement(By.name("Passwd")).sendKeys("ImTester@27");
		driver.findElement(By.name("ConfirmPasswd")).sendKeys("ImTester@27");
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

}
