package browserHandling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver rv=new ChromeDriver();
		Thread.sleep(3000);
		rv.get("http://www.google.com");
		Dimension d=new Dimension(200, 200);
		
		int h=rv.manage().window().getSize().getHeight();
		
		int w = rv.manage().window().getSize().getWidth();
		Thread.sleep(3000);
		Dimension d1=new Dimension(h/2,w/2);
		rv.manage().window().setSize(d1);
		rv.close();
		
	}

}
