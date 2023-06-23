package browserHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_01 {

	public static void main(String[] args) throws InterruptedException {
		
		// TODO Auto-generated method stub
          WebDriver driver=new ChromeDriver();
          driver.get("https:\\www.amazon.com");
          Thread.sleep(3000);
          WebElement un=driver.findElement(By.tagName("span"));
          Thread.sleep(3000);
          
          
	}

}
