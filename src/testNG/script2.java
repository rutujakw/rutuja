package testNG;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class script2 
{
	
	@Test(priority=1)
	void m1()
	{
		Reporter.log("first priority",true);
	}
	
	@Test(priority=2)
	void m2()
	{
		Reporter.log("second priority",true);
	}
	
	@Test(priority=2)
	void a1()
	{
		Reporter.log("third priority",true);
	}
	

}
