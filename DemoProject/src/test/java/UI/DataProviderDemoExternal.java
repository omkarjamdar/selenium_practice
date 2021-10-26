package UI;

import org.testng.annotations.Test;

import common.ExternalDataProvider1;

public class DataProviderDemoExternal 
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
}
