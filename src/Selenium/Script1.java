package Selenium;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script1 {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		FirefoxDriver rv=new FirefoxDriver();
		Thread.sleep(3000);
		rv.get("http://www.google.com");
		Thread.sleep(3000);
		FirefoxDriver rv1=new FirefoxDriver();
		rv.get("http://www.facebook.com");
		Thread.sleep(3000);
		rv.close();
		rv1.close();
	}

}
