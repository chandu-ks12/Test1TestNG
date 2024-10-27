package TestNG1.Test1TestNG;

import org.testng.annotations.Test;

public class LoanDepartment {
	
	@Test
	//(enabled=false)
	public void MobileloginPersonalLoan()
	
	{
		System.out.println("MobileloginPersonalLoan");
	}
	
	@Test
	//(enabled=false)
	public void WebloginPersonalLoan()
	
	{
		System.out.println("WebloginPersonalLoan");
	}
	
	@Test
	//(enabled=true)
	public void APIloginPersonalLoan()
	
	{
		System.out.println("APIloginPersonalLoan");
	}
	

	@Test
	public void MobileloginAutomobilelLoan()
	
	{
		System.out.println("APIloginAutomobilelLoan");

}
	@Test
	public void WebloginAutomobilelLoan()
	
	{
		System.out.println("APIloginAutomobilelLoan");

}
	@Test
	public void APIloginAutomobilelLoan()
	
	{
		System.out.println("APIloginAutomobilelLoan");

}
}