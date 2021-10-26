import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    String url="";
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    String HomePage="https://orchidrepublic.com/blogs/news/types-yellow-flowers-meanings";
	    driver.get(HomePage);
	    List<WebElement> bttn;
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
	    driver.close();
	}

}
