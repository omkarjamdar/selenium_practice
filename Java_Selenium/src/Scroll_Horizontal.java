import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_Horizontal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.manage().window().maximize();
		
		w.get("http://demo.guru99.com/test/guru99home/scrolling.html");
		
		JavascriptExecutor js=(JavascriptExecutor)w;
		
		WebElement ele=w.findElement(By.linkText("VBScript"));
		WebElement ele1=w.findElement(By.xpath("//a[contains(text(),'SAP MM')]"));
		
		js.executeScript("arguments[0].scrollIntoView()",ele);
		
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView()",ele1);
		
		js.executeScript("document.querySelector(\"#rt-feature\").scrollLeft=5000");
		
		w.close();
	}

}
