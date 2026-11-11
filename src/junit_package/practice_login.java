package junit_package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice_login {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("student");
	
	    WebElement password = driver.findElement(By.id("password"));
	    password.sendKeys("Password123");
	    
	    WebElement submit_button = driver.findElement(By.id("submit"));
	    submit_button.click();
	    
	    System.out.println("Login Successfull");
	}
	
	@AfterEach
	public void closing_method()
	{
		driver.quit();
	}
}


