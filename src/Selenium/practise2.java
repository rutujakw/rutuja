package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//write test script to verify password field aligned below email field or not
public class practise2 {

	public static void main(String[] args)
	{
		//open app
				WebDriver driver=new FirefoxDriver();
				driver.get("https://www.facebook.com/");		
				//identify element
				WebElement tgt_ele = driver.findElement(By.id("email"));
				
				//element location
				int ele_xloc = tgt_ele.getLocation().getX();
				//tgt_ele.getRect().getX()
				   
				int emailfield_yloc = tgt_ele.getLocation().getY();
			      
			       
			       System.out.println("email field x location"+ele_xloc);
			       System.out.println("email field y location"+emailfield_yloc);
			       
			       WebElement pass_field = driver.findElement(By.id("pass"));
			
			       int passfield_xloc = pass_field.getLocation().getX();
			       int  passfield_yloc = pass_field.getLocation().getY();
			       
			       System.out.println("password field xloc"+passfield_xloc+" yloc"+passfield_yloc);
			       
			       if(ele_xloc==passfield_xloc && emailfield_yloc<passfield_yloc)
			       {
			    	   System.out.println("password field align below email field");
			    	   
			       }
			       else
			       {
			    	   System.out.println("password field is not alligned below email field");
			       }
			       

	}

}
