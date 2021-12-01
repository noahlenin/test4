package utility;

import org.testng.annotations.Test;

public class priorityPractice {
	
	
	
	@Test(priority = 1)
	public  void details()
	{
		System.out.println("Enter details");
		int a[]= {1,2,3};
		System.out.println(a[5]);
		
	}
	
	@Test(priority = 2,dependsOnMethods = "details")
	public void create()
	{
		System.out.println("Create Employee Details");
	}
	
	@Test(priority = 3)
	public void modify()
	{
		System.out.println("modify employee details");
	}
	
	@Test(priority = 2)
	public void delete()
	{
		System.out.println("delete employee details");
	}


}
