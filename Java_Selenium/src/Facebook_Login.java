import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.get("https://www.facebook.com/");
		
		w.findElement(By.cssSelector("input#email.inputtext._55r1._6luy")).click();
		w.findElement(By.id("email")).sendKeys("omsjamdar193@gmail.com");
		w.findElement(By.id("pass")).click();
		w.findElement(By.id("pass")).sendKeys("12345678");
		w.findElement(By.name("login")).click();
		
		String a=w.findElement(By.className("_9ay7")).getText();
		System.out.print(a);
		
	}

}
