package Element_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_05 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		Thread.sleep(3000);
		driver.findElement(By.linkText("create new account"));
		
		

	}

}
