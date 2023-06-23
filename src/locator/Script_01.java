package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_01 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("admin");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("123456");
		Thread.sleep(3000);
		driver.findElement(By.name("login")).click();
		
		}

}
