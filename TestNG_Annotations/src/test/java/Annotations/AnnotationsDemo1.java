package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*	- Requirement
 * 
		a. Login				--> @BeforeMethod
		b. Search				--> @Test
		c. Logout				--> @AfterMethod
		d. Login
		e. Advanced Search
		f. Logout

 * 
 * */

public class AnnotationsDemo1 {
	
	
	@BeforeMethod
	void login()
	{
		System.out.println("This is login");
	}
	
	
	@Test(priority = 1)
	void search()
	{
		System.out.println("This is Search");
	}
	
	
	@Test(priority = 2)
	void advancedSearch()
	{
		System.out.println("This is Advanced Search");
	}
	
	
	@AfterMethod
	void logout()
	{
		System.out.println("This is logout");
	}
	
	
	
}
