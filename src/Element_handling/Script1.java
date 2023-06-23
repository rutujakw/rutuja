package Element_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(3000);
		WebElement un = driver.findElement(By.id("username"));
		Thread.sleep(3000);
		un.sendKeys("admin");
		un.sendKeys(Keys.CONTROL+"a");
		un.sendKeys(Keys.CONTROL,"c");
		Thread.sleep(3000);
		//un.sendKeys(Keys.TAB+""+Keys.CONTROL+"v");
		un.sendKeys(Keys.chord(Keys.TAB,Keys.CONTROL+"v"));

}
}