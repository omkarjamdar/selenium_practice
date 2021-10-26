import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru99_AlertCheck {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.get("http://demo.guru99.com/test/delete_customer.php");
		w.manage().window().maximize();
		
		
		
		
		w.findElement(By.name("cusid")).click();
		w.findElement(By.name("cusid")).sendKeys("12345");
		w.findElement(By.name("submit")).click();
		
		Alert A=w.switchTo().alert();
		A.accept();
		Thread.sleep(2000);
		A.accept();
		Thread.sleep(3000);
		
		w.findElement(By.name("submit")).click();
		Thread.sleep(1000);
		A.dismiss();
		w.close();
	}

}
