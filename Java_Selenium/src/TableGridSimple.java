import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGridSimple {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	    int sum=0;
	    
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    
	    js.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(2000);
	    js.executeScript("document.querySelector('.tableFixHead').scrollTop=50000");
	    
	    List<WebElement>values= driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
	    for(int i=0;i<values.size();i++)
	    {
	    	values.get(i).getText();
	    	System.out.print(" "+Integer.parseInt(values.get(i).getText()));
	    	sum+=Integer.parseInt(values.get(i).getText());
	    }
	    System.out.println(" \n Calculated sum is: "+sum);
	    
	    String total=driver.findElement(By.className("totalAmount")).getText();
	   // System.out.print(" \n"+total);
	    String[] arrOfStr = total.split(": ");
	    //System.out.print(" \n"+arrOfStr[1]);
	    
	    if(sum==Integer.parseInt(arrOfStr[1]))
	    	System.out.println("Test Pass");
	    else
	    	System.out.println("Test Fail");
	}

}
