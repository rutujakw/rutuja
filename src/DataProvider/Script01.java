package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Script01
{
	@DataProvider
	public Object[][] testData()
	{
		Object[][] rv=new Object[3][2];
		
		rv[0][0]="admin1";
		rv[0][1]="manager1";
		rv[1][0]="admin2";
		rv[1][1]="manager2";
		rv[2][0]="admin3";
		rv[2][1]="manager3";
		
		return rv;
	}
	
	@Test(dataProvider="testData")
	public void testlogin(String un,String pwd)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(un);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		driver.findElement(By.id("u_0_5_Hn")).click();
		
	}
	
	
	

}
