package RetryLogicDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserr implements IRetryAnalyzer {
	
	//counter to keep track of retry attemps
	
	int counterForRetryAttempts = 0;
	
	int setMaxLimitForRetry =3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
