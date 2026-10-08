package OrangeHRM;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	int count = 0;
	int maxRetryCount = 2;
	
	@Override
	public boolean retry(ITestResult result) {
		
		
		if(count < maxRetryCount)
		{
			count++;
			return true;
			
		}
		return false;
	}

}
