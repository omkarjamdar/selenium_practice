import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableGridExcersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22780/nz-vs-ind-3rd-odi-india-tour-of-new-zealand-2020");
	    List<WebElement>balls= driver.findElements(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[child::div]/div[4]"));
	    List<WebElement>Player= driver.findElements(By.xpath("//*[@id=\"innings_1\"]/div[1]/div[child::div]/div[1]"));
	    int sum=0;
	    for(int i=1;i<balls.size();i++)
	    {
	    	balls.get(i).getText();
	    	System.out.print(" "+Integer.parseInt(balls.get(i).getText()));
	    	sum+=Integer.parseInt(balls.get(i).getText());
	    }
	    
	    System.out.println("\n"+sum);
	    
	    if(sum==300)
	    	System.out.println("India faced all overs");
	    else
	    	System.out.println("India not faced all overs");
	    
	    
	}

}
