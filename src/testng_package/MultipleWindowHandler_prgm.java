package testng_package;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindowHandler_prgm {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void test() throws Exception
	{
		String parent_window = driver.getWindowHandle();  // details of parent window
		System.out.println("Title of Google : "+driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		System.out.println(driver.getTitle());
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.saucedemo.com/");
		System.out.println(driver.getTitle());
		driver.close();  // to close the current tab
		
		ArrayList<String> windowdetails = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(windowdetails.get(1));  // redirect back to 1st tab(index position)
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(parent_window);	
		
	}
	
	@AfterTest
	public void closing_method()
	{
		driver.quit();
	}
	

}


