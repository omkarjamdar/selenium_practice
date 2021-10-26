package UI;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class parent {
protected WebDriver driver;
	parent()
	{
		 System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		 driver=new ChromeDriver();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent p=new parent();
	}

}
