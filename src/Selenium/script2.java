package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class script2 {

	public static void main(String[] args) throws InterruptedException {
	
		FirefoxDriver rv=new FirefoxDriver();
		Thread.sleep(3000);
		rv.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		rv.close();	

	}

}
