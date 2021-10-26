package UI;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest 
{
	
	@BeforeClass
	public void setup1()
	{
		System.out.println("BeforeClass");
	}
	
	@BeforeTest
	public void setup()
	{
		System.out.println("BeforeTest");
	}
	@Test(priority=1,description="This is Loging test")
	public void bloginTest()
	{
		System.out.println("@Test 1");
	}
	
	@Test(priority=2,description="This is Logout test")
	public void alogoutTest()
	{
		System.out.println("@Test 2");
	}
	
	@AfterTest
	public void setupclose()
	{
		System.out.println("AfterTest");
	}
	
	@AfterClass
	public void setup2()
	{
		System.out.println("AfterClass");
	}
	
	@AfterSuite
	public void setup3()
	{
		System.out.println("@AfterSuite");
	}
	
	@BeforeSuite
	public void setup4()
	{
		System.out.println("@BeforeSuite");
	}
}
