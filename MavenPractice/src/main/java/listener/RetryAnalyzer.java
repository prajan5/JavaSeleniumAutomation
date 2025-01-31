package listener;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int count = 0;
	public boolean retry(ITestResult result) {
		if(count<2)// want to try for twice(<2)
		{
			count++;
			return true;
			
		}
		return false;
	}

}
