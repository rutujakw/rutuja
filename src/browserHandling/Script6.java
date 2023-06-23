package browserHandling;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Script6 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		FirefoxDriver rv=new FirefoxDriver();
		rv.get("http://www.facebook.com");
		Thread.sleep(2000);
		 String title=rv.getTitle();
		 System.out.println("title is"+title);
		 Thread.sleep(2000);
         rv.manage().window().maximize();
         Thread.sleep(2000);
         rv.get("http://www.google.com");
         Thread.sleep(2000);
         Dimension d =new Dimension(400,600);
         rv.manage().window().setSize(d);
         Thread.sleep(2000);
         System.out.println(d);
         Thread.sleep(2000);
         int h=rv.manage().window().getSize().getHeight();
         int w=rv.manage().window().getSize().getWidth();
         Thread.sleep(2000);
         Dimension d1=new Dimension(h*2,w*2);
         rv.manage().window().setSize(d1);
         Thread.sleep(2000);
         rv.navigate().back();
         
         String displaypage="facebook";
         
         while(true)
         {
        	 Thread.sleep(2000);
        	 
        	 if(displaypage.contains("facebook"))
        	 {
        		 System.out.println("facebook page displayed");
        		 break;
        	 }
         }
         
         Thread.sleep(2000);
         String url=rv.getCurrentUrl();
         System.out.println(url);
         Thread.sleep(2000);

         int x=rv.manage().window().getPosition().getX();
        int y= rv.manage().window().getPosition().getY();
        Point p=new Point(x,y);
        
        System.out.println("position="+p);
        Thread.sleep(2000);

        Point p1=new Point(500,500);
        rv.manage().window().setPosition(p1);
        rv.navigate().forward();
        rv.get("http://www.google.com");
        
        Thread.sleep(2000);
         rv.manage().window().minimize();
         Thread.sleep(2000);

         rv.close();
	}

}
