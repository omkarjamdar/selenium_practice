import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.get("http://demo.automationtesting.in/Static.html");
		w.manage().window().maximize();
		w.findElement(By.id("angular"));
		Actions a=new Actions(w);
		
		WebElement src=w.findElement(By.id("angular"));
		WebElement dst=w.findElement(By.id("droparea"));
		
		a.dragAndDrop(src, dst).build().perform();
	
	}

}
