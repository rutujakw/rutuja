package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//Write test Script to print element dimension and location as output
public class practise1 {

	public static void main(String[] args)
	{
		//open app
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");		
		//identify element
		WebElement tgt_ele = driver.findElement(By.id("email"));
		
		//element dimension
		int ele_height = tgt_ele.getSize().getHeight();
		//tgt_ele.getRect().getHeight();
		
		int ele_width = tgt_ele.getSize().getWidth();
          //tgt_ele.getRect().getWidth();
		
		System.out.println("Email field Height"+ele_height);
		System.out.println("Email field Weight"+ele_width);
		
		//element location
		int ele_xloc = tgt_ele.getLocation().getX();
		//tgt_ele.getRect().getX()
		
	       int ele_yloc = tgt_ele.getLocation().getY();
	       //tgt_ele.getRect().getY();
	       
	       System.out.println("email field x location"+ele_xloc);
	       System.out.println("email field y location"+ele_yloc);
	}

}
