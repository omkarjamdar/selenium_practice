package Log4J;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo 
{
		public static void main(String [] args)
		{
			Logger logger = Logger.getLogger("Log4jDemo");
			
			 PropertyConfigurator.configure("Log4j.properties");
			 System.setProperty("webdriver.chrome.driver", "D:/Softwares/chromedriver/chromedriver.exe");
				WebDriver w=new ChromeDriver();
				String email = "omsjamdar193@gmail.com";
				String password="qqqqqqq";
				w.get("https://www.facebook.com/");
				logger.info("FB Issdff Oppened");
				w.findElement(By.cssSelector("input#email.inputtext._55r1._6luy")).click();
				logger.info("Clicked on  email Field");
				w.findElement(By.id("email")).sendKeys("omsjamdar193@gmail.com");
				logger.info("enterefsfd email addess");
				w.findElement(By.id("pass")).click();
				logger.info("Clickedsdfds on password field");
				w.findElement(By.id("pass")).sendKeys("12345678");
				logger.info("Eneteredsdfsd password");
				w.findElement(By.name("login")).click();
				logger.info("Clickedsdf on login btn");
				logger.error("Wrong "+email+password);
				String a=w.findElement(By.className("_9ay7")).getText();
				System.out.print(a);
		}
}
