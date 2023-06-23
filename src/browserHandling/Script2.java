package browserHandling;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver rv=new ChromeDriver();
		Thread.sleep(3000);
		rv.navigate().to("http://www.google.com");
		Thread.sleep(3000);
		Dimension d =new Dimension(30, 50);
		rv.manage().window().setSize(d);
		Thread.sleep(3000);
		Point p=new Point(150,300);
		rv.manage().window().setPosition(p);
		Thread.sleep(3000);
		rv.manage().window().maximize();
		Thread.sleep(3000);
		rv.manage().window().fullscreen();
		Thread.sleep(3000);
		rv.manage().window().minimize();
		
	}

}
