package sampleTests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AvedaTest {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<WebElement> productType = driver.findElements(By.xpath(" //div[@class='menu__content menu__content--lvl-2 js-nav-category-trigger-content']//div[@class='content']//li//a//font//font"));
		//productType
	}

}
