import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLHandlingCertificate {

	private void abc()
	{
		DesiredCapabilities ch= DesiredCapabilities.chrome();	
		
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		
		ChromeOptions options=new ChromeOptions();
		
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		
		options.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/tieups/tieups.php?othersrcp=23531&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Misspellings&gclid=CjwKCAjwy7CKBhBMEiwA0Eb7aq8VY3fxdJvx5cJbf1uvZtW3sAgdEYZiyO3WFSjJ0OCJpX7FEQDcpRoC_pQQAvD_BwE&gclsrc=aw.ds&_sm_nck=1");
		//driver.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SSLHandlingCertificate a=new SSLHandlingCertificate();
		a.abc();
		
	}

}
