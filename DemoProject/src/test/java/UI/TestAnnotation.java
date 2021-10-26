package UI;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotation 
{
		@BeforeTest
		public void test1()
		{
			System.out.println("Login to application");
		}
		
		@BeforeMethod
		public void test2()
		{
			System.out.println("Connected with database");
		}
		
		@Test(priority=1,description="It perform 1st operation")
		public void test3()
		{
			System.out.println("Perform operation 1");
		}
		
		@Test(priority=2,description="It perform 2st operation")
		public void test4()
		{
			System.out.println("Perform operation 2");
		}
		
		@AfterMethod
		public void test5()
		{
			System.out.println("Disconnected with database");
		}
		
		@AfterTest
		public void test6()
		{
			System.out.println("logout from application");
		}
		
}
