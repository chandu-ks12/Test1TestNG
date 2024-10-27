package RetryLogicDemo;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TestCasesExample {
	
	@Test(retryAnalyzer=RetryAnalyserr.class)
	public void TestCase01()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void TestCase02()
	{
		Assert.assertTrue(false);
	}
	@Test
	public void TestCase03()
	{
		Assert.assertTrue(true);
	}
}
