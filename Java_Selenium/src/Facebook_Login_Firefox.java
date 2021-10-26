import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_Login_Firefox {
	public static void main(String[]args) {
		System.setProperty("webdriver.gecko.driver","D:/Softwares/geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:/Softwares/geckodriver/geckodriver.exe");
		//System.setProperty("webdriver.gecko.driver","D:/Softwares/geckodriver/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
	}
}
