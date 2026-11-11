package junit_package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logo_verification {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void locate() throws Exception
	{
		WebElement logo = driver.findElement(By.xpath("//img[@title=\"Rediffmail\"]"));
		boolean result = logo.isDisplayed();
		if(result==true)
		{
			System.out.println("Logo is Displayed");
		}
		else
		{
			System.out.println("Logo is not Displayed");
		}
		
		
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value=\"f\"]"));
		boolean button_enabled = radiobutton.isEnabled();    // to check whether the radio button is enabled or not
		System.out.println("female button is enabled : "+button_enabled);
		
		Thread.sleep(2000);
		WebElement checkbox = driver.findElement(By.xpath("//input[contains(@name,\"chk_altemail\")]"));
		checkbox.click();
		boolean checkbox_button = checkbox.isSelected();
		if(checkbox_button==true)
		{
			System.out.println("Checkbox is selected");
		}
		else
		{
			System.out.println("Checkbox is not selected");
			
		}	
	}
	
	@AfterEach
	public void closing_method()
	{
		driver.quit();
	}

}


