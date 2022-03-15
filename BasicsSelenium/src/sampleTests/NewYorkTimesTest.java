package sampleTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewYorkTimesTest {
	
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://international.nytimes.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement sportsPage = driver.findElement(By.xpath("//div[@class='css-jj4aw3']//li[@class='css-cwdrld']//a[text()='Sports']"));
		sportsPage.click();
		String header="Sports - The New York Times International";
		String head = sportsPage.getText();
		System.out.println(head);
		if(head.equals(header)) {
			System.out.println("Entered into Sports Column of New York Times");
		}else
			System.out.println("Wrong Page");
		driver.close();
	}

}
