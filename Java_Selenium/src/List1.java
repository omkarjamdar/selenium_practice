import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class List1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	    driver.get("https://echoecho.com/htmlforms10.htm");
	    List<WebElement> bttn;
	    
	    bttn=driver.findElements(By.name("group1"));
	    
	    int count=bttn.size();
	    System.out.println(count);
	    
	    for(int i=0;i<count;i++)
	    {
	    	System.out.println(bttn.get(i).getAttribute("value"));
	    }
	    
	    bttn=driver.findElements(By.name("group1"));
	    
	    int count1=bttn.size();
	    System.out.println(count1);
	    
	    for(int i=0;i<count1;i++)
	    {
	    	System.out.println(bttn.get(i).getAttribute("value"));
	    }
	    
	    driver.close();
	}

}
