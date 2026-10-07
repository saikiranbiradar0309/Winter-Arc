package Annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {
	
	@BeforeClass
	void Login()
	{
		System.out.println("This is Login");
	}
	
	
	@Test(priority = 1)
	void Search()
	{
		System.out.println("This is Search");
	}
	
	
	@Test(priority = 2)
	void advancedSearch()
	{
		System.out.println("This is Advanced Search");
	}
	
	
	@AfterClass
	void Logout()
	{
		System.out.println("This is Logout");
	}
	
}	
