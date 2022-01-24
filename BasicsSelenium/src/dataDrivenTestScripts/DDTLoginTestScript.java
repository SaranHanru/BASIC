package dataDrivenTestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTLoginTestScript {

	String [][] data= {
			{"admin","dummy"},
			{"dummy","dummy"},
			{"dummy","admin"},
			{"admin","admin"}
	      };
	
	@DataProvider(name="loginData")
	public String[][] loginDataProvider() {
		return data;
	}
	
	@Test(dataProvider = "loginData")
	public void correctCredentials(String uName, String pWord) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		WebElement UserName = driver.findElement(By.id("email"));
		UserName.sendKeys(uName);
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys(pWord);
		driver.findElement(By.id("last")).click();
		driver.quit();
	}
}
