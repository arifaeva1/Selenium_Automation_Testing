package auto;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Driver installation
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		//Window and link
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
//		driver.manage().window().minimize();
		
		
		//if else check
		
		String ExpectedTitle ="Swag Labs";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
//		if(ActualTitle.equals(ExpectedTitle)) {
//			System.out.println("Title Matched");
//			
//		}
//		else {
//			System.out.println("Title Not Matched");
//		}
//		assertion
		
		Assert.assertEquals(ActualTitle, ExpectedTitle,"Condition True");
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
