package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RailwayLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://eticket.railway.gov.bd/login");
		driver.manage().window().maximize()	;
		
		
		driver.findElement(By.id("mobile_number")).sendKeys("***********");
		driver.findElement(By.id("password")).sendKeys("*********");
		
		driver.findElement(By.className("login-form-submit-btn")).click();
		
		
		
		
		
		
		
			

	}

}
