package First;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class grouping {
	@BeforeGroups(groups={"sanity"})
	public void login()
	{
		System.out.println("Login");
	}
	
	@AfterGroups (groups={"sanity"})
	public void logout()
	{
		System.out.println("Logout");
	}

	@Test (groups={"sanity"})	
	public void search()
	{
		System.out.println("Search");
	}

	@Test (groups={"sanity"})
	public void transfer()
	{
		System.out.println("Transfer");
	}
	
	@Test (groups={"sanity","regression"})
	public void payment()
	{
		System.out.println("Payment");
	}

	@Test (groups={"sanity"})
	public void password()
	{
		System.out.println("Password");
	}
	@Test (groups={"sanity"})
	
	public void receipt()
	{
		System.out.println("Receipt");
	}
}


