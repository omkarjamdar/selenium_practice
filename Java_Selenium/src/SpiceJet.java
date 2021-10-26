import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SpiceJet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("SpiceJet");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//*[@id=\'rso\']/div[1]/div/div/div[2]/ul/li[1]/div/div/div/div/div[1]/a/div")).click();
		driver.findElement(By.className("spicejet_logo")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_OneWay")).click();
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")).click();
		Select s= new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListCurrency")));
		s.selectByValue("GBP");
		Thread.sleep(2000);
		s.selectByIndex(3);
		Thread.sleep(2000);
		s.selectByVisibleText("EUR");
		
		
		//Dropdown With in Dropdwon
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Select s1=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));  
		s1.selectByValue("3");
		
		Select s2=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD")));
		s2.selectByValue("2");
		
		Select s3=new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_INFANT")));
		s3.selectByIndex(3);
		
		//Calender
		//driver.findElement(By.id("custom_date_picker_id_1")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'21')]")).click();
		//driver.findElement(By.cssSelector("ui-state-default.ui-state-highlight.ui-state-active")).click();
		
	/*	driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		Thread.sleep(3000);
		Select s4=new Select(driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")));
		s4.selectByValue("PNQ");
		Thread.sleep(2000);
		try 
		{
			//driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")).click();
			Select s5=new Select(driver.findElement(By.name("ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT")));
			Thread.sleep(3000);
			s5.selectByValue("DEL");
		}
		catch(Exception e)
		{
			System.out.print("Decpature City");
		//}*/
		
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());
		driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).click();
		System.out.println(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_FamilyAndFriends")).isSelected());
		
		driver.findElement(By.linkText("Special Assistance")).click();
		driver.findElement(By.id("SpecialAssistanceWindow")).click();
		
	}

}
