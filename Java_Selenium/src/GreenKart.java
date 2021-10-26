import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:/Softwares/chromedriver/chromedriver.exe");
		String[] itemsNeeds= {"Cucumber","Brocolli"};
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	/*
		List<String> list=new ArrayList<String>();
		int i=1;
		do
		{
			list.add(driver.findElement(By.xpath("//*[@id=\'root\']/div/div[1]/div/div["+i+"]/h4")).getText());
			i++;
		}while(i!= 31);
		
		System.out.print(list);*/
		
		//Add Product
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[1]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[2]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[3]/div[3]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div[16]/div[3]/button")).click();
		
		//Search Product
		driver.findElement(By.className("search-keyword")).click();
		driver.findElement(By.className("search-keyword")).sendKeys("Capsicum");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div[3]/button")).click();
		//*[@id="root"]/div/div[1]/div/div[1]/h4
		//*[@id="root"]/div/div[1]/div/div[2]/h4
		
		
		
		//Proceed To checkout
		WebDriverWait w=new WebDriverWait(driver,10);
		driver.findElement(By.className("cart-icon")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/div[2]/div[2]/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/input")).click();
		driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.className("promoBtn")).click();
		//Thread.sleep(2000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		
		
		//Choose Country
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select")).click();
		Select s= new Select(driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select")));
		s.selectByValue("India");
		Thread.sleep(2000);
		//Agree Term and Condition
		driver.findElement(By.className("chkAgree")).click();
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		
	}

}
