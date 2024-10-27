package TestNG1.Test1TestNG;

import org.testng.annotations.Test;

public class AnnotationAttributes {
	
	@Test(priority=1)
	public void testCase1() 
	{
		
		System.out.println("Mobile Login");
	}
	
	@Test(priority=2)
	public void testCase2() 
	{
		
		System.out.println("Weblogin Login");
	}
	
	@Test(description="This is testcase3")
	public void testCase3() 
	{
		
		System.out.println("APIlogin Login");
	}
}
