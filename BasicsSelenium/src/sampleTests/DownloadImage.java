package sampleTests;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class DownloadImage {

	public static void main(String[] args) throws IOException  {

		WebDriver driver=null;
		try {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Rose");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		WebElement firstImg = driver.findElement(By.xpath("(//img)[37]"));
		String src = firstImg.getAttribute("src");
		System.out.println(src);
		URL imageURL = new URL(src);
		BufferedImage saveImg = ImageIO.read(imageURL);
		ImageIO.write(saveImg,"png",new File(".png"));
	    
		} catch (MalformedURLException e){
			e.printStackTrace();
		}finally {
		driver.close();
		}
		
	}

}
