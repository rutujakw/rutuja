package Element_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class script2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys("admin1234");
		driver.findElement(By.name("pwd")).sendKeys("rutuja123");
		driver.findElement(By.id("loginButtonContainer")).click();
		WebElement error_msg = driver.findElement(By.xpath(".//span[starts-with(text(),'username']"));
		boolean output=error_msg.isDisplayed();
		if(output)
		{
			System.out.println("error msg displayed");
		}
		else
		{
			System.out.println("error msg is not displayed");
		}
			

	}

}

