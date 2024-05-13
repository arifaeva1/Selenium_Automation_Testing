package auto;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;

public class URLvErification {

	public static void main(String[] args) {
		//url varification
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().minimize();
		
		String ExpectedURL = "https://www.saucedemo.com/v1/";
		
		String ActualURL = driver.getCurrentUrl();
		System.out.println(ActualURL);
		
		if(ActualURL.equals(ExpectedURL)) {
		System.out.println("URL Matched");
			
	}
		else {
			System.out.println("URL Not Matched");
		}
		
		
		
		
		//assertion
		
		Assert.assertEquals(ActualURL, ExpectedURL,"Condition True");
		

	}

}
