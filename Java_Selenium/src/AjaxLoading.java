import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AjaxLoading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait w=new WebDriverWait(driver,10);
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		driver.findElement(By.xpath("//*[@id='content']/a[2]")).click();;
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='results']")));
		
	}

}
