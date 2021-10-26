package UI;

import org.testng.annotations.DataProvider;

public class ExternalDataProvider 
{
	@DataProvider
	public Object dataset2()
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
	
	@DataProvider(name="create1")
	
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
