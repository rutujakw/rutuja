package testNG;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class script3 {
	
	@Test
	void m1()
	{
		Reporter.log("first method");
		AssertJUnit.fail();
	}
	
	@Test(dependsOnMethods = "m1")
	void m2()
	{
		Reporter.log("dependent method");
	}
	

}
