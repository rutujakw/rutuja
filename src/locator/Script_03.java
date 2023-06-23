package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.com");
		driver.findElement(By.name("action_submitForm")).click();
		driver.findElement(By.name("subdomain")).sendKeys("rutuja_kolte");
		driver.findElement(By.name("Name")).sendKeys("rutuja amol kolte");
		driver.findElement(By.name("Email")).sendKeys("aaru123@gmail.com");
		driver.findElement(By.name("Contact")).sendKeys("1234356789");
		driver.findElement(By.name("Country")).sendKeys("Togo");
		driver.findElement(By.id("Form_getForm_action_submitForm")).click();
	}

}
