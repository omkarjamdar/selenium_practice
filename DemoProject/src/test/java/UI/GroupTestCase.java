package UI;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test(groups="user-registration")
public class GroupTestCase 
{
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("This run the before class");
	}
	@BeforeTest
	public void BeforeTest()
	{
		System.out.println("This run the BeforeTest");
	}
	
	@BeforeGroups(value="regression")
	public void beforeGroups()
	{
		System.out.println("This run the BeforeGroup");
	}
	
	@Test(priority=2,groups="regression")
	public void Test1()
	{
		System.out.println("@Test 1");
	}
	
	@Test(priority=1,groups="regression")
	public void Test2()
	{
		System.out.println("@Test 2");
	}
	
	@Test(groups={"regression","bvt"})
	public void Test3()
	{
		System.out.println("@Test 3");
	}
	@Test(groups="bvt")
	public void Test4()
	{
		System.out.println("@Test 4");
		Assert.assertTrue(false);
	}
	
	
	@AfterGroups(value="regression")
	public void afterGroups()
	{
		System.out.println("This run the AfterGroups");
	}
}
