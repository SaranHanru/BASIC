package initialSeleniumTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisp_IsSel_IsEnabTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement Un = driver.findElement(By.id("username"));
		if (Un.isDisplayed()) {
			System.out.println("Pass : Element is Displayed");
			Un.sendKeys("admin");
		} else {
			System.out.println("Fail : Element is not dispalayed");
		}
		
		WebElement LoginBtn = driver.findElement(By.xpath("//div[text()='Login ']"));
		if(LoginBtn.isEnabled()) {
			System.out.println("Pass : Element is Enabled");
			LoginBtn.click();
		}
		else {
			System.out.println("Fail : Element is not Enabled");
		}
		
		WebElement Cbox = driver.findElement(By.id("keepLoggedInCheckBox"));
		Cbox.click();
		if(Cbox.isSelected()) {
			
			System.out.println("Pass : Element is Selected");
		}
		else {
			System.out.println("Fail : Element is not Selected");
		}
		driver.close();
	}
}
