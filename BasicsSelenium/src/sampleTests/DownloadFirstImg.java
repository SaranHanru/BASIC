package sampleTests;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFirstImg {

	public static void main(String[] args) throws IOException {

		WebDriver driver=null;
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Rose");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		List<WebElement> list = driver.findElements(By.tagName("img"));
		//String src = firstImg.getAttribute("src");
		//System.out.println(src);
		int count=1;
		URL imageURL=null;
		for(WebElement element :list)
		{
			String src = element.getAttribute("src");
			System.out.println(src);
			imageURL =new URL(src);
			BufferedImage saveImg = ImageIO.read(imageURL);
			ImageIO.write(saveImg, "png", new File("new.png"));
			count++;
		}
		}
	}
	
