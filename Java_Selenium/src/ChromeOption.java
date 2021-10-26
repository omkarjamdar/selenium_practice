import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		
		ChromeOptions options=new ChromeOptions();
		
		
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteCookieNamed("cricket");
		driver.get("https://www.cricbuzz.com/live-cricket-scores/37567/dc-vs-srh-33rd-match-indian-premier-league-2021");
		driver.navigate().back();
		driver.close();
		
	}

}
