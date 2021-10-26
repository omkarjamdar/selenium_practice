import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripLoadingPage 
{
	File src;
	FileInputStream FileInput;
	Workbook wb;
	XSSFSheet Sheet1;
	WebDriverWait wait;
	WebDriver driver;
	Actions A;
	MakeMyTripLoadingPage(WebDriver driver,WebDriverWait wait,Actions A) throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		this.wait=wait;
		this.driver=driver;
		this.A=A;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");


	}

	private void Details()
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1700)");
		try
		{
			WebElement secure=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='INSURANCE']//div//div[1]//label[1]")));
			secure.click();
			//Thread.sleep(2000);
			WebElement adult=wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("addTravellerBtn")));
			adult.click();

			WebElement fname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First & Middle Name']")));
			fname.click();
			fname.sendKeys("Omkar Harish");

			WebElement lname=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']")));
			lname.click();
			lname.sendKeys("Jamdar");

			WebElement male=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='AdultFormWrapper collapse show']//label[1]")));
			male.click();

			WebElement mobile=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Mobile No']")));
			mobile.click();
			mobile.sendKeys("8087207610");

			WebElement email=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Email']")));
			email.click();
			email.sendKeys("omsjamdar193@gmail.com");

			WebElement Continue=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='Continue']")));
			Continue.click();
		}
		catch(NoSuchElementException N)
		{
			System.out.println("Element Not Found in Details Section");
		}
		catch(StaleElementReferenceException S)
		{
			System.out.println("Element is no longer appearing");
		}
		catch(TimeoutException T)
		{
			System.out.println("Execution fail due to insufficient time");
		}
		catch(ElementNotVisibleException E)
		{
			System.out.println("Element is present on DOM is not visible");
		}
		catch(ElementNotSelectableException E)
		{
			System.out.println("Element is disable,so unable to select that element"); 	
		}
	}

	private void BookFlight() throws InterruptedException
	{
		try
		{
			WebElement Refundable=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Refundable Fares')]")));
			Refundable.click();
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,700)");

			//WebElement ViewPrice=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"bookbutton-RKEY:7daca44c-0b11-4ada-a281-68147f3c98c7:7_0\"]")));
			//ViewPrice.click();
			List<WebElement> btn=driver.findElements(By.className("button"));
			Iterator <WebElement> itr=btn.iterator();
			String ID="",ID1="";
			int i=1;
			while(i<4)
			{
				ID=itr.next().getAttribute("id");	

				if(i==3)
				{
					ID1=itr.next().getAttribute("id");
				}
				i++;
			}

			A.moveToElement(driver.findElement(By.id(ID))).click().perform();
			//Thread.sleep(2000);
			String parent_window=driver.getWindowHandle();
			System.out.println(parent_window);
			A.moveToElement(driver.findElement(By.xpath("//div[contains(@class,'collapse show')]//div[2]//div[1]//div[3]//button[1]"))).click().perform();

			/*
			Set<String> s1=driver.getWindowHandles();
			Iterator <String> i1=s1.iterator();
			//while(i1.hasNext())
			//{
			String child_window=i1.next();
			//if(!parent_window.equalsIgnoreCase(child_window))
			//{
			Thread.sleep(3000);
			driver.switchTo().window(child_window);
			System.out.println(child_window);
			//}
			//}
	*/
			Details();

		}
		catch(NoSuchElementException N)
		{
			System.out.println("Element Not Found in Details Section");
		}
		catch(StaleElementReferenceException S)
		{
			System.out.println("Element is no longer appearing");
		}
		catch(TimeoutException T)
		{
			System.out.println("Execution fail due to insufficient time");
		}
		catch(ElementNotVisibleException E)
		{
			System.out.println("Element is present on DOM is not visible");
		}
		catch(ElementNotSelectableException E)
		{
			System.out.println("Element is disable,so unable to select that element"); 	
		}
	}

	private void Search() throws InterruptedException
	{
		try
		{
			WebElement oneway=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-cy='oneWayTrip']")));
			oneway.click();
			WebElement Destination=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div/div/div/div[@data-cy='flightSW']/div[2]/div[1]/div[1]")));
			Destination.click();
			driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]")).click();
			driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-1\"]")).click();
			//Thread.sleep(5000);
			//WebElement Date=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='Tue Sep 28 2021']")));
			//Date.click();
			//WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Search']")));
			//search.click();

			A.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='Search']"))).doubleClick().perform();
			BookFlight();
		}
		catch(NoSuchElementException N)
		{
			System.out.println("Element Not Found in Details Section");
		}
		catch(StaleElementReferenceException S)
		{
			System.out.println("Element is no longer appearing");
		}
		catch(TimeoutException T)
		{
			System.out.println("Execution fail due to insufficient time");
		}
		catch(ElementNotVisibleException E)
		{
			System.out.println("Element is present on DOM is not visible");
		}
		catch(ElementNotSelectableException E)
		{
			System.out.println("Element is disable,so unable to select that element"); 	
		}
	}

	private void login() throws InterruptedException, IOException
	{

		//Read The Username and Password from xml file
		src=new File("D:/Training/SELENIUM/Selenium/MakeMyTrip.xlsx");
		FileInput=new FileInputStream(src);
		wb=new XSSFWorkbook(FileInput);
		Sheet1=(XSSFSheet) wb.getSheetAt(0);
		String username=Sheet1.getRow(0).getCell(0).getStringCellValue();
		String password=Sheet1.getRow(0).getCell(1).getStringCellValue();
		//Thread.sleep(2000);
		try
		{
			WebElement login= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut")));
			//login.click();
			A.doubleClick(login).perform();
			WebElement user=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
			//WebElement user=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username"));
			user.click();
			driver.findElement(By.id("username")).sendKeys(username);

			WebElement conti=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@data-cy='continueBtn']")));
			conti.click();

			WebElement pass=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
			pass.click();
			driver.findElement(By.id("password")).sendKeys(password);
			driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
		}
		catch(NoSuchElementException N)
		{
			System.out.println("Element Not Found in Details Section");
		}
		catch(StaleElementReferenceException S)
		{
			System.out.println("Element is no longer appearing");
		}
		catch(TimeoutException T)
		{
			System.out.println("Execution fail due to insufficient time");
		}
		catch(ElementNotVisibleException E)
		{
			System.out.println("Element is present on DOM is not visible");
		}
		catch(ElementNotSelectableException E)
		{
			System.out.println("Element is disable,so unable to select that element"); 	
		}
		Search();
	}

	private void CheckBrokenLink()
	{
		String HomePage="https://www.makemytrip.com/";
		String url="";
		List<WebElement> bttn;
		try
		{
			bttn=driver.findElements(By.tagName("a"));
			System.out.print(bttn.size());
			Iterator<WebElement> it=bttn.iterator();
			while(it.hasNext())
			{
				url=it.next().getAttribute("href");
				System.out.println(url);

				if(url== null 	|| url.isEmpty())
				{
					System.out.println("Url is not configured for anchor tag or it is empty");
					continue;
				}
				if(!url.startsWith(HomePage))
				{
					System.out.println("Url is belongs to other domain,skipping it.");
					continue;
				}
			}
		}
		catch(NoSuchElementException N)
		{
			System.out.println("Element Not Found in Details Section");
		}
		catch(StaleElementReferenceException S)
		{
			System.out.println("Element is no longer appearing");
		}
		catch(TimeoutException T)
		{
			System.out.println("Execution fail due to insufficient time");
		}
		catch(ElementNotVisibleException E)
		{
			System.out.println("Element is present on DOM is not visible");
		}
		catch(ElementNotSelectableException E)
		{
			System.out.println("Element is disable,so unable to select that element"); 	
		}
	}

	public static void main(String []args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions A=new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		MakeMyTripLoadingPage  a= new MakeMyTripLoadingPage (driver,wait,A);
		a.CheckBrokenLink();
		a.login();
	}
}


