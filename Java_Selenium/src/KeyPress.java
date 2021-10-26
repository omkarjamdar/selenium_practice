import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyPress {

	private static final CharSequence Keys = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement em =driver.findElement(By.id("email"));
		WebElement pass =driver.findElement(By.id("pass"));
		
		Actions A=new Actions(driver);
		
		//Action Aseries=A.moveToElement(email).click().keyDown(email,Keys.SHIFT)
	//Action Aseries=A.moveToElement(em).click().keyDown(em,Keys.SHIFT).sendKeys(em,"demo").build();
	
				
	}

}