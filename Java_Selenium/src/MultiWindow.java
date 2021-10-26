import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultiWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//Actions A=new Actions(driver);
		driver.get("https://business.udemy.com/request-demo/");
		String parentid=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[normalize-space()='terms']")).click();
		
		Set<String>ids=driver.getWindowHandles();
		
		Iterator<String>it=ids.iterator();
		
		String childid=it.next();
		Thread.sleep(2000);
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
		/*
		List<WebElement> links=driver.findElements(By.tagName("a"));
		String url="";
		Iterator<WebElement> itr=links.iterator();
		while(itr.hasNext())
		{
			url=itr.next().getAttribute("href");
			
			System.out.println("Url is"+url);
		}
		
		*/		
	}

}
