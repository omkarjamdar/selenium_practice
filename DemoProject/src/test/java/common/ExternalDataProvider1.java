package common;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class ExternalDataProvider1 
{
	@DataProvider(name="external")
	public Object[][] dataset2(Method m)
	{
		Object[][] dataset1=null;
		if(m.getName().equals("display3"))
		{
			dataset1= new Object[][]
					{
							{"omkar","jamdar","sangli"},
							{"Sameer","hakke","mumbai"},
							{"Suleman","Shekh","Dubai"}
					};
		}
		else
		{
			dataset1= new Object[][]
					{
							{"omkar","jamdae"},
							{"sameer","hakke"},
							{"Suleman","Shekh"}
						
					};
		}
		
		return dataset1;
			
	}
	
	
}
