package UI;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestDemo 
{
	boolean datasetup=true;
	@Test(enabled=false)
	public void skipTest1()
	{
			System.out.println("Skipping this test as it is not completed");
	}
	
	@Test
	public void skipTest2()
	{
			System.out.println("Skipping this test Forcefully");
			throw new SkipException("Skipping This test");
	}
	
	@Test
	public void skipTest3()
	{
			System.out.println("Skipping this test as based on condition");
			if(datasetup == true)
			{
				System.out.println("Execute the test");
			}
			else
			{
				System.out.println("Do not execute further steps");
				throw new SkipException("Skipping This test");
			}
	}
	
	
}
