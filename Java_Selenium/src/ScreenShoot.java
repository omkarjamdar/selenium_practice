import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShoot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		WebDriver w=new ChromeDriver();
		w.manage().window().maximize();
		
		w.get("https://orchidrepublic.com/blogs/news/types-yellow-flowers-meanings");
		JavascriptExecutor js=(JavascriptExecutor)w;
		js.executeScript("window.scrollBy(0,600)");
		
		Thread.sleep(3000);
		
		TakesScreenshot srcShot=((TakesScreenshot)w);
		
		File srcFile=srcShot.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile,new File("D:/Traning/SELENIUM/Selenium/ScreenShot1.png"));
		
		w.quit();
	}

}
