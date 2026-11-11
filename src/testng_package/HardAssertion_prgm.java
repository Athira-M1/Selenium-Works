package testng_package;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HardAssertion_prgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details&");
		driver.manage().window().maximize();
	}
	
	@Test(priority = 1)
	public void title_verification()
	{
		String actual_title=driver.getTitle();
	//	System.out.println("Actual Title : "+actual_title);
		
		String expected_title = "Rediffmail Free Unlimited ";
		Assert.assertEquals(expected_title, actual_title);
		System.out.println("Title Verification Successfull");   // only executes after the assertion is passed
	}
	
	@Test(priority = 2)
	public void url_verification()
	{
		String actual_url = driver.getCurrentUrl();  // to retrieve the current url of the web application
	//	System.out.println("Actual URL : "+actual_url);
		
		String expected_url = "https://register.rediff.com/register/register.php?FormName=user_details&";
		Assert.assertEquals(expected_url, actual_url);
		System.out.println("URL Verification Successfull");
	}

}
