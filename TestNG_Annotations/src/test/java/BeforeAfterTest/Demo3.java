package BeforeAfterTest;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Demo3 {
	
	
	@Test
	void test()
	{
		System.out.println("This is test case");
	}
	
	@BeforeSuite
	void before()
	{
		System.out.println("This is before suit");
	}
	
	
	@AfterSuite
	void after()
	{
		System.out.println("This is after suit");
	}
}
