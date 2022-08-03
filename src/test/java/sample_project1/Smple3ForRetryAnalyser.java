package sample_project1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Smple3ForRetryAnalyser 
{
	@Test(retryAnalyzer = Generic.RetryAnalyserImplementationClass.class)
	public void justPractice()
	{
		System.out.println("just practice 1");
		System.out.println("just practice 2");
		Assert.fail();
		System.out.println("just practice 3");
		System.out.println("just practice 4");
	}

}
