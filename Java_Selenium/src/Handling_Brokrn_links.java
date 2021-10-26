

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Brokrn_links {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String HomePage="http://www.zlti.com";
		String url="";
		int repCode=200;
		
		System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(HomePage);
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		Iterator<WebElement> it=links.iterator();
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

}
