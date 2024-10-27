package BatchTesting;

import org.testng.annotations.Test;

public class HomeScreenTest {
	
	@Test
	public void LaunchApplication() {
		
		System.out.println("Application Launched Passed");	
	}
	@Test
	public void VerifyTitle() {
		
		System.out.println("Title Verifyed");	
	}
	@Test
	public void Verifylogo() {
		
		System.out.println("Logo Verifyed");	
	}
}
