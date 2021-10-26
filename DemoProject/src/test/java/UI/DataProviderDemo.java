package UI; 

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import common.ExternalDataProvider1;

public class DataProviderDemo
{

	
	
	@Test(dataProvider="external",dataProviderClass=ExternalDataProvider1.class)
	public void display3(String fname,String lname,String city)
	{
		System.out.println("External Provider"+fname+" "+lname+" "+city);
	}
	
	@Test(dataProvider="external",dataProviderClass=ExternalDataProvider1.class)
	public void display4(String fname,String lname)
	{
		System.out.println("External Provider"+fname+" "+lname);
	}
	
	@Test(dataProvider="dataset")	
	public void display(String username,String Password)
	{
		System.out.println(username+"===="+Password);
	}
	
	
	@Test(dataProvider="create")
	public void display1(String username,String password,String test)
	{
		System.out.println(username+" "+password+" "+test );
	}
	
	//Calling DataProvider from external class
	@Test(dataProvider="create1",dataProviderClass=ExternalDataProvider1.class)
	public void display2(String username,String password,String test)
	{
		System.out.println("xternalDataProvider1"+username+" "+password+" "+test );
	}
	
	//Calling DataProvider from external class
	@Test(dataProvider="dataset2",dataProviderClass=ExternalDataProvider.class)
	public void display2(String username,String password)
	{
		System.out.println("External"+username+"===="+password);
	}
	
	
	
	@DataProvider
	public Object dataset()
	{
		Object[][] dataset1=new Object[4][2];
		dataset1[0][0]="1";
		dataset1[0][1]="2";
		
		dataset1[1][0]="1";
		dataset1[1][1]="2";
		
		dataset1[2][0]="1";
		dataset1[2][1]="2";
		
		dataset1[3][0]="1";
		dataset1[3][1]="2";
		
		return dataset1;
	}
	
	@DataProvider(name="create")
	
	public Object[][] dataset1()
	{
		return new Object[][]
				{
					{"username","password","test"},
					{"username1","password1","test1"},
					{"username2","password2","test2"}
				};
	}
	
}
