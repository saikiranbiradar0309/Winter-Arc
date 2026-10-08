import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo2 {
	
	
	@Test
	void getTitle()
	{
		String exp_title = "Opencart";
		String act_title = "Opencart";
		
		//String act_title = "OpenCart";		You will get Error.
		
		Assert.assertEquals(exp_title, act_title);
	}
}
