package testNG;


import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class script5 {
	
	@Test(groups="s1")
	void m1()

	{
		Reporter.log("hiiii",true);
		
	}
	
	@Test(groups="s1")
	void m2()

	{
		Reporter.log("hiiii",true);
	}
	@Test(dependsOnGroups ="s1")
	void m3()

	{
		Reporter.log("hiiii",true);
	}


}
