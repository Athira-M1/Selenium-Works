package testng_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void browser_setup(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
			System.out.println("Chrome Browser");
		}
		else
		{
			driver = new EdgeDriver();
			System.out.println("Edge Browser");
		}
		
	}
	
	@Test
	public void method1() throws Exception
	{
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

}


