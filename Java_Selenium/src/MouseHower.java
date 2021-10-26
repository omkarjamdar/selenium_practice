import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHower {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ugc.ac.in/");
		
		//driver.findElement(By.linkText("Universities"));
		
		Actions A=new Actions(driver);
		
		A.moveToElement(driver.findElement(By.linkText("Universities"))).perform();
		Thread.sleep(3000);
		
		driver.navigate().back();
	}

}
