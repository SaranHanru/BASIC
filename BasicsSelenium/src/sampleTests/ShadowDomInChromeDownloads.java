package sampleTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDomInChromeDownloads {
	
	@Test
	public void shadowDomTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("chrome://downloads/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		WebElement searchTab = (WebElement) jse.executeScript("return document.querySelector(\"body > downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#searchInput\")");
		WebElement enterSearchBtn = (WebElement)jse.executeScript("return document.querySelector(\"downloads-manager\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#toolbar\").shadowRoot.querySelector(\"#search\").shadowRoot.querySelector(\"#icon\").shadowRoot.querySelector(\"#icon > iron-icon\")");
		String js="arguments[0].setAttribute('value','NaveenAutomationLabs')";
		((JavascriptExecutor)driver).executeScript(js, searchTab);
		((JavascriptExecutor)driver).executeScript("arguments[0].click();",enterSearchBtn);			
	}

}
