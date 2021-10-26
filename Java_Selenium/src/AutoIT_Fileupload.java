import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT_Fileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://smallpdf.com/pdf-converter");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//*[@id=\"__cond-30\"]/div/div/div/div/div[1]/div/form/label/div/div[2]/div/button[1]")).click();
	    Thread.sleep(2000);
	    Runtime.getRuntime().exec("D:\\Training\\SELENIUM\\Selenium\\FirstAutoITScipt.exe");
	}

}
