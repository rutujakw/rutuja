package generics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestScript_04 {

	public static void main(String[] args)  throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(4000);
		map.addDataIntoshmap("SignUpPage");
		

	}

}
