package TestNG1.Test1TestNG;

import org.testng.annotations.Test;

public class InvocationCount {
	
	 @Test(invocationCount = 9)
	    public void repeatTest() {
	        System.out.println("This test is executed multiple times.");
	    }

}
