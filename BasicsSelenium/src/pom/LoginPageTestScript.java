package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class LoginPageTestScript {
	
	@Test
	public void login() {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888/index.php?action=Login&module=Users");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		PageFactory.initElements(driver, LoginPageTestScriptObjects.class);

		LoginPageTestScriptObjects.userName.sendKeys("admin");
		LoginPageTestScriptObjects.passWord.sendKeys("admin");
		LoginPageTestScriptObjects.loginBtn.click();

		driver.quit();
	
	}
}
