package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class programme1 {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.Amazon.in/");
		Thread.sleep(3000);
		
		//take screeenshot
		TakesScreenshot s=(TakesScreenshot)driver;
		File src=s.getScreenshotAs(OutputType.FILE);
		Thread.sleep(3000);
		
		//define location with filename+extension
	    String path="../Selenium/image/amazon.png";
	    File dest=new File(path);
	    
	    Thread.sleep(3000);
	    //save the file
	    FileUtils.copyFile(src, dest);
	
		

	}

}
