package UI;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataParameterDemo 
{
	@Parameters({"parametername"})
	@Test
	public void display(String abc)
	{
		System.out.println("Hi"+ abc);
	}
}
