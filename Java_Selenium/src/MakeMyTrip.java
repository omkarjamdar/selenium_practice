import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Search Make My Trip on Google
		driver.get("https://www.makemytrip.com/");
		/*
		driver.findElement(By.name("q")).click();
		driver.findElement(By.name("q")).sendKeys("Make My Trip");
		driver.findElement(By.name("btnK")).click();
		driver.findElement(By.xpath("//*[@id=\'tads\']/div[1]/div/div/div[1]/a/div[2]/span[2]")).click();
		*/
		//For Login
		//Thread.sleep(2000);
	
		Actions A=new Actions(driver);
		
		WebElement login=driver.findElement(By.cssSelector(".makeFlex.hrtlCenter.font10.makeRelative.lhUser.userLoggedOut"));
		login.click();
		//A.doubleClick(login).perform();
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("omsjamdar193@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("Omkar@123");
		driver.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[2]/div[2]/section/form/div[2]/button")).click();
		Thread.sleep(2000);
		
		//Select oneway Flight from Mumbai to Delhi
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[1]/ul/li[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-1\"]")).click();
		//Select s=new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]")));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[1]/div[3]/div[4]/div[6]")).click();
		
		//Getting all URL from HomePage
		List<WebElement> links=driver.findElements(By.tagName("a"));
		String url="";
		Iterator<WebElement> itr=links.iterator();
		while(itr.hasNext())
		{
			url=itr.next().getAttribute("href");
			if(url == null || url.isEmpty())
			{
				System.out.println("This Anchortage has no her");
				continue;
			}
			System.out.println("Url is"+url);
		}
		
		//Explicit Timeout
		WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a")));
		//Thread.sleep(2000);
		//WebElement search=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/p/a"));
		search.click();
		
		
		//Select Trip Type
		/*driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"search-widget\"]/div/div[1]/ul/li[1]")).click();
		*/
		//Select CheckBox
		//Thread.sleep(3000);
		WebElement refundable =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div/div/div[@class='flightBody']/div[@class='flightsContainer makeFlex spaceBetween']/div[contains(@class,'listingLhs')]/div[@class='filterWrapper']/div[1]/div[1]/label[1]/div[1]/span[1]/span[1]")));
		//WebElement refundable=driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[@class='flightBody']/div[@class='flightsContainer makeFlex spaceBetween']/div[contains(@class,'listingLhs')]/div[@class='filterWrapper']/div[1]/div[1]/label[1]/div[1]/span[1]/span[1]"));
		refundable.click();
		//Thread.sleep(3000);
		
		WebElement morning =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[@id='root']/div/div/div[@class='flightBody']/div[@class='flightsContainer makeFlex spaceBetween']/div[contains(@class,'listingLhs')]/div[@class='filterWrapper']/div[2]/div[1]/label[4]/div[1]/span[1]/span[1]")));
		morning.click();;
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,550)");
		
		Thread.sleep(5000);
		
		WebElement book=driver.findElement(By.cssSelector("div[class='makeFlex top gap-x-10'] button[id='bookbutton-RKEY:3fbe933f-acd3-4320-90fa-2c75ff324735:57_0']"));
		book.click();
	}

}
