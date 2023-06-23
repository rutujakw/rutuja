package browserHandling;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1 {

	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver rv = new FirefoxDriver();
		Thread.sleep(3000);
		rv.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		rv.close();	


	}

}
