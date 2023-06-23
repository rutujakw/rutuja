package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(2000);
		//create account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("Rutuja");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Kolte");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("rutu@123");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_day")).sendKeys("18");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_month")).sendKeys("oct");
		Thread.sleep(2000);
		driver.findElement(By.name("birthday_year")).sendKeys("1998");
		Thread.sleep(2000);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();
		
		

	}

}
