package junit_package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_prgm {
	ChromeDriver driver;
	@BeforeEach
	public void browser_setup()
	{
		System.out.println("Before Each Method");
	    driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void title_verification()
	{
		System.out.println("Test Method 1");
		String actual_title = driver.getTitle();
		String expected_title = "Google";
		if(actual_title.equals(expected_title))
		{
			System.out.println("Titles matches"); 
		}
		else
		{
			System.out.println("Titles does not match");
		}
	}

	
	@Test
	public void method2()
	{
		System.out.println("Test Method 2");
	}
	
	
	@AfterEach
	public void closing_method()
	{
		System.out.println("After Each Method");
		// driver.close();   // to close the browser tab
		driver.quit();
	}
}





