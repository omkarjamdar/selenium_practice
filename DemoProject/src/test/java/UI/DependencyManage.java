package UI;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import common.BaseTest;

public class DependencyManage 
{
	@Test
	public void userRegistration()
	{
		//driver.get("https://www.javatpoint.com/string-concatenation-in-java");
		System.out.println("This is test1");
		Assert.assertTrue(false);
	}
	
	@Test(dependsOnMethods = { "userRegistration" })
	public void userSearch()
	{
		//Reporter.log("This is test2");
		System.out.println("Search user");
	}
	
	@Test
	public void reporterTest3()
	{
		System.out.println("This is test3");
	}
	
	@Test
	public void reporterTest4()
	{
		System.out.println("This is test4");
	}
}
