import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Handling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		
		WebDriver w=new ChromeDriver();
		
		w.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		
		w.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/button")).click();
		Alert A=w.switchTo().alert();
		Thread.sleep(3000);
		A.accept();
		
	}

}
