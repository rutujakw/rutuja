package Javascript;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Script1 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
          WebDriver driver= new FirefoxDriver();
          driver.get("https://www.facebook.com/");
          String rutu = driver.getPageSource();
          System.out.println(rutu);
      
          driver.findElement(By.id("email"));
          
          Actions a=new Actions(driver);
          
          
          
          
          
          
	}

}
