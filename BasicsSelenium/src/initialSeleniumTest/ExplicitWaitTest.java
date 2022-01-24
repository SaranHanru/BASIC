package initialSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTest {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/login.php?type=login");
		WebDriverWait wait=new WebDriverWait(driver, 5);
		driver.findElement(By.id("email")).sendKeys("admin");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("admin");
		WebElement button = driver.findElement(By.id("last"));
		wait.until(ExpectedConditions.elementToBeClickable(button)).click();
		String title = driver.getTitle();
		System.out.println(title);
		WebElement commButton = driver.findElement(By.xpath("/html/body/div/header/nav/div/ul/li/a/span"));
		wait.until(ExpectedConditions.elementToBeClickable(commButton)).click();
		driver.findElement(By.xpath("//a[text()='Sign out']")).click();
		driver.close();
	}

}
