package cogito;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class program2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		WebElement searchfield = driver.findElement(By.name("q"));
		searchfield.sendKeys("wikipedia.org");
		searchfield.sendKeys(Keys.ENTER);
		String text = driver.findElement(By.id("result-stats")).getText();
		String title = driver.getTitle();
		driver.findElement(By.xpath("(.//a)[1]")).getAttribute("href");
		
		
		

	}

}
