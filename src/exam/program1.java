package exam;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		//login to orangehrm
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//span[text()='PIM']")).click();
		
		Thread.sleep(3000);
         driver.findElement(By.xpath(".//button[text()=' Add ']")).click();
         Thread.sleep(3000);
        driver.findElement(By.name("firstName")).sendKeys("rutuja");
        
        Thread.sleep(3000);
        driver.findElement(By.name("middleName")).sendKeys("Amol");
        
        Thread.sleep(3000);
        driver.findElement(By.name("lastName")).sendKeys("kolte");
        
        Thread.sleep(3000);
        
        
        Thread.sleep(3000);
       
        
        
         
         
         
         
	}

}
