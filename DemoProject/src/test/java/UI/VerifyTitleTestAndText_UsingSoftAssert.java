package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitleTestAndText_UsingSoftAssert
{
	  WebDriver driver;
	  SoftAssert softassert;
	@BeforeSuite
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.ebay.com/");
	    softassert=new SoftAssert();
	}
	@Test
	public void titleTest()
	{
		
	    String expectedtitle="Electronssicees, Cars, Fashion, Collectibles & More | eBay";
	    String actualtitle=driver.getTitle();	
	    String ExpectedText="Seassrch";
	    System.out.println("Verifying Title");
	    softassert.assertEquals(actualtitle, expectedtitle, "Title Verification fail");
	    String actualText=driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).getAttribute("value");
	    System.out.println("Verifying Text"); 
	    softassert.assertEquals(actualText, ExpectedText, "Text Verification fail");
	    System.out.println("Closing Browser");
	}
	
	@AfterSuite
	public void setup1()
	{
		driver.close();
		softassert.assertAll();
	}
	
}
