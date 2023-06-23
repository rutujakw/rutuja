
package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script2 {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
		// TODO Auto-generated method stub

		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.amazon.in/");
		/*
		//take Screenshort
		TakesScreenshot s=(TakesScreenshot)driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		
		String path = "../Selenium/image/amazon.png";
		File dest = new File(path);
		
		Thread.sleep(3000);
		FileUtils.copyFile(src, dest);
		*/
		
		Thread.sleep(3000);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone14");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(300,0)");
		
		Thread.sleep(3000);
		WebElement tgt_ele = driver.findElement(By.xpath(".//div[@class='a-section']"));
		 File src1 = tgt_ele.getScreenshotAs(OutputType.FILE);
		 
		 Thread.sleep(3000);
		 String path = "../Selenium/image/screenshot2.png";
		 File dest1=new File(path);
		 
		 FileUtils.copyFile(src1, dest1);
		 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(.//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
		 
		 
		 Thread.sleep(3000);
		 String parent_refid = driver.getWindowHandle();
		 Set<String> ref = driver.getWindowHandles();
		 
		 for(String refid : ref)
		 {
			 if(!parent_refid.equals(refid))
			 {
				 driver.switchTo().window(refid);
				 
			 }
		 }
		 
		 Thread.sleep(3000);
		 js.executeScript("window.scrollBy(0,300)");

		 Thread.sleep(3000);
		 WebElement tgt_ele1 = driver.findElement(By.xpath(".//div[@id='imgTagWrapperId']"));
		 File scr2 = tgt_ele1.getScreenshotAs(OutputType.FILE);
		 
		 String path2 = "../Selenium/image/screenshot3.png";
		File dest2=new File(path2);
		 
		 FileUtils.copyFile(scr2, dest2);
		 
}
}
