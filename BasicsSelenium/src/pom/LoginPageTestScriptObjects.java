package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageTestScriptObjects {

	@FindBy(name = "user_name")
	public static WebElement userName;

	@FindBy(name = "user_password")
	public static WebElement passWord;

	@FindBy(id = "submitButton")
	public static WebElement loginBtn;

}

