import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTripBooking {

	WebDriverWait wait;
	WebDriver driver;
	Actions A;
	MakeMyTripBooking(WebDriver driver,WebDriverWait wait,Actions A) throws IOException, InterruptedException
	{
		this.wait=wait;
		this.driver=driver;
		this.A=A;
		//System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		 wait = new WebDriverWait(driver,30);
		driver.get("https://www.makemytrip.com/flight/reviewDetails/?itineraryId=fbd46d5fe1916c3945fca0136dca0cd4e8034458&crId=2af95c20-2c21-4250-8252-41108afa0256&cur=INR&xflt=eyJjIjoiRSIsInAiOiJBLTFfQy0wX0ktMCIsInQiOiIiLCJzIjoiQk9NLURFTC0yMDIxMDkzMCJ9&rKey=RKEY:2235b956-1d88-4b67-bc84-8b82a16b944f:45_0&ccde=IN");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1700)");
		
		WebElement secure=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='INSURANCE']//div//div[1]//label[1]")));
		secure.click();
		Thread.sleep(2000);
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
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions A=new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver,30);
		MakeMyTripBooking a=new MakeMyTripBooking(driver,wait,A);
	}

}
