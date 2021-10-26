import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail_AlretCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		Alert A=driver.switchTo().alert();
		A.accept();
		driver.findElement(By.id("login1")).click();
		driver.findElement(By.id("login1")).sendKeys("omsjamdar193@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		A.accept();
		driver.findElement(By.id("password")).click();
		driver.findElement(By.id("password")).sendKeys("1234556");
		driver.findElement(By.name("proceed")).click();
		
		driver.findElement(By.linkText("Create a new account")).click();
		driver.findElement(By.id("Register")).click();
		Thread.sleep(2000);
		A.accept();
		Thread.sleep(1000);
		driver.navigate().back();
	}

}
