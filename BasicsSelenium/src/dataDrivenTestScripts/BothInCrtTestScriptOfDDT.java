package dataDrivenTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BothInCrtTestScriptOfDDT {

	@Test
	@Parameters({"username","password"})
	public void IncorrectCredentials(String uName, String pWord) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys(uName);
		WebElement PassWord = driver.findElement(By.id("password"));
		PassWord.sendKeys(pWord);
		driver.findElement(By.id("last")).click();
		driver.quit();
	}
}
