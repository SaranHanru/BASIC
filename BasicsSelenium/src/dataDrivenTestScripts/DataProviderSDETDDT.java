package dataDrivenTestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderSDETDDT {
WebDriver driver;
	@BeforeClass
	public void launch() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@Test(dataProvider = "LoginData")
	public void login(String user,String pwd,String exp) {
		//System.out.println(user + pwd + exp);
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		WebElement txtEmail = driver.findElement(By.id("Email"));
		txtEmail.clear();
		txtEmail.sendKeys(user);
		
		WebElement txtPassword = driver.findElement(By.id("Password"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[text()='Log in']")).click(); //Login Button
		
		String exp_title = "Dashboard / nopCommerce administration";
		String act_title = driver.getTitle();
		
		if(exp.equals("valid"))
		{
			if(exp_title.equals(act_title))
			{
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Assert.assertTrue(true);
			}
			else
			{
				Assert.assertTrue(false);
			}
		}
		else if(exp.equals("Invalid"))
		{
			if(exp_title.equals(act_title))
			{
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
		}
	}
	
	@DataProvider(name="LoginData")
	public String [][] getData(){
		String loginData[][]= {
				{"admin@yourstore.com","admin","valid"},
				{"admin@yourstore.com","adm","Invalid"},
				{"adm@yourstore.com","admin","Invalid"},
				{"adm@yourstore.com","adm","Invalid"}
		};
		return loginData;
	}
	@AfterClass
	public void Close() {
		driver.close();
	}
}
