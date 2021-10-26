import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver w=new ChromeDriver();
		
		w.get("https://jqueryui.com/droppable/");
		w.manage().window().maximize();
		
		w.switchTo().frame(w.findElement(By.xpath("//*[@id=\"content\"]/iframe")));
		w.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		Actions a=new Actions(w);
		
		WebElement src=w.findElement(By.id("draggable"));
		WebElement dst=w.findElement(By.id("droppable"));
		
		a.dragAndDrop(src, dst).build().perform();
		Thread.sleep(3000);
		w.navigate().back();
		w.close();
		
		
	}



}
