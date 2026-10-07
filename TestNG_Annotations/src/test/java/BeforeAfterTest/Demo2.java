package BeforeAfterTest;

import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Demo2 {
	
	
	@Test
	void pqr()
	{
		System.out.println("This is PQR from Demo2");
	}
	
	
	@AfterTest
	void xyz()
	{
		System.out.println("This is After Test");
	}
}	
