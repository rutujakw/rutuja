package Element_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_04 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		Thread.sleep(3000);
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("abc@123");
		
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
	}

}
