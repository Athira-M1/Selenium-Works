package junit_package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_prgm {
	
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.xpath("//input[@id=\"ulogin\"]"));
		username.sendKeys("abcde");
		
		WebElement password = driver.findElement(By.xpath("//input[@id=\"upass\"]"));
		password.sendKeys("abc@123");
		
		WebElement submit_button = driver.findElement(By.xpath("//input[@id=\"sub_logbtn\"]"));
		submit_button.click();
	}
	
	
	@AfterEach
	public void closing_method()
	{
		driver.quit();
	}
	

}


