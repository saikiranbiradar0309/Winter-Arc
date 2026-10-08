import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssertion {
	
	@Test
	void softAssert()
	{
		
		System.out.println("Testing...");
		System.out.println("Testing...");
		
		
		SoftAssert softAssertion = new SoftAssert();
		
		softAssertion.assertEquals(1,2);		// It will mark passed if we wont specify .assertAll() at the end
		
		System.out.println("Testing...");
		System.out.println("Testing...");
		
		softAssertion.assertAll();
	}
}
