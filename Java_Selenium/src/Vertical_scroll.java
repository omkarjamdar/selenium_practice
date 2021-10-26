import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vertical_scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.manage().window().maximize();
		
		w.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		
		JavascriptExecutor js=(JavascriptExecutor)w;
		js.executeScript("window.scrollBy(0,3000)");
		
		Thread.sleep(3000);
		
		w.navigate().back();
	}

}
