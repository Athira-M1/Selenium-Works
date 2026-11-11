package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion_prgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details&");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void logo_verification()
	{
		WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/a/img"));
		boolean result = logo.isDisplayed();
		System.out.println(result);
		
		
		SoftAssert obj = new SoftAssert();
		obj.assertTrue(result);  // to check whether the value of result is true or not
		obj.assertAll();
		System.out.println("Logo is Displayed");
	}
	
	@Test
	public void title_verification()
	{
		String actual_title=driver.getTitle();
		//	System.out.println("Actual Title : "+actual_title);
			
			String expected_title = "Rediffmail Free Unlimited ";
			SoftAssert obj = new SoftAssert();
			obj.assertEquals(expected_title, actual_title);
		    obj.assertAll();
			System.out.println("Title verification Successfull");
	}

}

