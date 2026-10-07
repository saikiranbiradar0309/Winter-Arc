package BeforeAfterTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	void abc()
	{
		System.out.println("This is abc from Demo1");
	}
	
	
	@BeforeTest
	void mno()
	{
		System.out.println("This is Before Test");
	}
	
}
