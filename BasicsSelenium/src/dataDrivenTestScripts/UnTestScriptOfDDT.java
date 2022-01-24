package dataDrivenTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class UnTestScriptOfDDT {

	@Parameters({"username","password"})
	@Test
	public void correctUsername(String uName, String pWord) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		WebElement userName=driver.findElement(By.id("email"));
		userName.sendKeys(uName);
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys(pWord);
		driver.findElement(By.id("last")).click();
		driver.quit();
	}
}
