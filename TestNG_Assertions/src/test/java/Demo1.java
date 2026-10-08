import org.testng.annotations.Test;

public class Demo1 {
	
	@Test
	void testTitle()
	{
		String exp_title = "Opencart";
		String act_title = "Opencart";
		
		if(exp_title .equals(act_title))
		{
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
	}
}
