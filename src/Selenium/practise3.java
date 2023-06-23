package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.Color;

public class practise3 {

	public static void main(String[] args)
	{
	   WebDriver driver=new FirefoxDriver();
	   driver.get("https://www.facebook.com/");
	   
	   
	   //identify element
	   WebElement gt_ele = driver.findElement(By.name("login"));
	   String tgt_colorcode_rgb = gt_ele.getCssValue("background-color");
	   
	   System.out.println(tgt_colorcode_rgb);
	   
	   //convert rgb to hex
	   String tgt_colorcode_hex = Color.fromString(tgt_colorcode_rgb).asHex();
	   
	   System.out.println(tgt_colorcode_hex);
	   
	   String tgt_fontSize=gt_ele.getCssValue("font-size");
	   System.out.println(tgt_fontSize);

	   
	}

}
