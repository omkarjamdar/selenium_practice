package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class VerifyTitleTest
{
	  WebDriver driver;
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.ebay.com/");
	}
	@Test
	public void titleTest()
	{
		
	    String title="Electronics, Cars, Fashion, Collectibles & More | eBay";
	    String actualtitle=driver.getTitle();	System.out.println("Hello");
	    try 
	    {
	    		Assert.assertEquals(actualtitle, title);
	    }
	    catch(Exception e)
	    {
	    	System.out.println("Title is not match");
	    }
	    	System.out.println("Hello");
	}
	
	@AfterSuite
	public void setup1()
	{
		driver.close();
	}
	
}
