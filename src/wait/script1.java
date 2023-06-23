package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script1 {

	public static void main(String[] args) 
	{
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	    driver.get("http://www.facebook.com");
	    
	    driver.findElement(By.id("email")).sendKeys("rutuja");
	   
	    driver.findElement(By.id("pass")).sendKeys("1234ryuut");
	   
		driver.findElement(By.linkText("Log in")).click();
		
	}

}
