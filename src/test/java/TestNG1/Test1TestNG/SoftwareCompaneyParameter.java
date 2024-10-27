package TestNG1.Test1TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class SoftwareCompaneyParameter {
	
	
	@Parameters({"SoftwareCompaneyName"})
	@Test
		public void testCase1(String name)
		{
			System.out.println(name);

	}
	}

