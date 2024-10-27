package TestNG1.Test1TestNG;

import org.testng.annotations.Test;

public class GroupAttribute {
	@Test(groups="Software company")
	public void infosys()
	{
		System.out.println("Infosys");
	}
	
	@Test(groups="Software company")
	public void wioros()
	{
		System.out.println("wipro");
	}

	@Test(groups="Automobile company")
	public void Mariti()
	{
		System.out.println("Mariti");
	}
	
	@Test(groups="Automobile company")
	public void TATA()
	{
		System.out.println("TATA");
	}
	
	
}
