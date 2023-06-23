package browserHandling;

import org.openqa.selenium.chrome.ChromeDriver;

public class Script3 {

	public static void main(String[] args) throws InterruptedException {
		
       ChromeDriver rv=new ChromeDriver();
       Thread.sleep(3000);
       rv.get("http://www.google.com");
       Thread.sleep(3000);
       rv.close();
	}

}
