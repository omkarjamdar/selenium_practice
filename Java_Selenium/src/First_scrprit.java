import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_scrprit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
			
		WebDriver w=new ChromeDriver();
		w.get("https://www.google.com");
		w.findElement(By.name("q")).click();
		w.findElement(By.name("q")).sendKeys("Persistent Systems");
		Thread.sleep(2000);
		w.findElement(By.className("gNO89b")).click();
		//w.findElement(By.)
		
	}

}
