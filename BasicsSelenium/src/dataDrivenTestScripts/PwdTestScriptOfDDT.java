package dataDrivenTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PwdTestScriptOfDDT {


	@Test
	@Parameters({"username","password"})
	public void correctPassword(String uName, String pWord) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		WebElement Username = driver.findElement(By.id("email"));
		Username.sendKeys(uName);
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(pWord);
		driver.findElement(By.id("last")).click();
		driver.quit();
	}
}
