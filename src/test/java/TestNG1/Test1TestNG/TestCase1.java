package TestNG1.Test1TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestCase1 {
	
	
	@BeforeSuite
	public void BeforeSute()
	{
		System.out.println("Before suite");
	}
	@AfterSuite
	public void AfterSute()
	{
		System.out.println("After suite");
	}
	
	
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("Before Test");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("After Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before Class ");
	}
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class ");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("this is BeforeMethod 1...");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("this is AfterMethod 1...");
	}
	@Test
	public void test1()
	{
		System.out.println("this is test 1...");
	}
	
	@Test
	public void test2()
	{
		System.out.println("this is test 2...");
	}

}
