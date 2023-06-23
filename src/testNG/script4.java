package testNG;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class script4 {
	@Test(invocationCount=10)
	void m2()
	{
		Reporter.log("hiiiiii",true);
	}
	

}
