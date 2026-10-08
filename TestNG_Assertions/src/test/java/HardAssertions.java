import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {
	
	@Test
	void hardAssertions()
	{
		//Assert.assertEquals("Saikiran", "Sai Kiran");		// Fails
		//Assert.assertEquals("Saikiran", "Saikiran");		// Pass
		
		
		//Assert.assertEquals(123, 324);		// Fails
		//Assert.assertEquals(123, 123);			// Pass
		
		
		//Assert.assertNotEquals(123, 321);  	// Pass
		//Assert.assertNotEquals(123, 123); 	// Fails
		
		
		//Assert.assertTrue(true);			// True
		//Assert.assertTrue(false);			// false
		//Assert.assertTrue(1 == 2); 			// Fails
		
		
		
		//Assert.assertFalse(1==2);					// Pass
		//Assert.assertFalse(1==1); 					// Fail
		
	}
}
