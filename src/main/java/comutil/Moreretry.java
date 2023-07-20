package comutil;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Moreretry implements IRetryAnalyzer {
	
	int count = 0;
	int maxcount = 3 ;
	
	public boolean retry(ITestResult result) {
		if(count<maxcount) {
			count++ ;
			return true ;
		}
		else {
			
		}
		return false;
	}

}
