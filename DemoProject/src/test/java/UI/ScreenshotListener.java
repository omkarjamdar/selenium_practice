package UI;

import org.testng.Assert;
import org.testng.annotations.Test;

import common.BaseTest;

public class ScreenshotListener extends BaseTest 
{
	@Test

	public  void launchApp()
	{
		
		driver.get("https://ebay.com");
		Assert.assertTrue(false);
	}
	
	
}
