package testng_basics;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basics {
	
	@Test
	public void m1()
	{
		//System.out.println("from m1()");
		Reporter.log("from m1()",true);
	}
	@Test
	public void m2()
	{
		//System.out.println("from m2()");
		Reporter.log("from m2()",true);
	}

}
