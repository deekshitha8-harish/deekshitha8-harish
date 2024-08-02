package genericlib;

import org.testng.annotations.Test;

public class Program2 
{
	@Test(priority=1 , invocationCount=5)
	public void CreateUser()
	{
		System.out.println("CU");	
	}
	@Test(priority=2 , invocationCount=1)
	public void ModifyUser()
	{
		System.out.println("MU");
	}
	@Test(priority=3)
	public void DeleteUser()
	{
		System.out.println("dU");
	}
}
