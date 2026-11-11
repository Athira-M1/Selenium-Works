package junit_package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Keralaproperty_login {
	ChromeDriver driver;
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();  // to maximise the window
	}
	
	@Test
	public void title_verification()
	{
		String actual_title = driver.getTitle();
		System.out.println("Title of the web page : "+actual_title);
	}
	
	@Test
	public void text_verification()
	{
		String source_code = driver.getPageSource();  // to retrieve the source code information
		if (source_code.contains("User Login"))
		{
			System.out.println("Text is present");
		}
		else
		{
			System.out.println("Text is not present");
		}
	}
	
	@Test
	public void login()
	{
		WebElement username = driver.findElement(By.id("ulogin")); // locating username using with the help of locator 'ID'
		username.sendKeys("abcd");  // sendKeys() : only accepts string values , it is used to pass values
		
		WebElement password = driver.findElement(By.name("upass"));  // locating password field with locator'name'
		password.sendKeys("1234");
		
		WebElement login_button = driver.findElement(By.id("sub_logbtn"));
		login_button.click();
		
		System.out.println("Login Successfull");
	}

	@AfterEach
	public void closing_method()
	{
		driver.quit();
	}
	
	
}



