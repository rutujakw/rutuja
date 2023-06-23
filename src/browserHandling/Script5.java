package browserHandling;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Script5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver rv=new FirefoxDriver();
		rv.get("http://www.google.com");
		rv.get("http://www.youtube.com");
		rv.get("http://www.amazon.com");
		rv.get("http://www.fscebook.com");
		rv.get("http://www.myntra.com");
		
		String exppage="youtube";
		
		while(true)
		{
			Thread.sleep(3000);
			String dispalayedpage= rv.getTitle();
			
		
			if(dispalayedpage.contains(exppage))
				{
				break;
				}
			else
			{
				rv.navigate().back();
			}
			}

	}
	

}
