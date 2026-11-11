package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CopyPaste_prgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void copypaste() throws Exception
	{
		WebElement fullname = driver.findElement(By.xpath("/html/body/div[2]/div[2]/form/div/div[2]/input"));
		fullname.sendKeys("abcd");
		
		// to select the value from fullname field (ctrl+a)
		
		Actions act = new Actions(driver);
		act.keyDown(fullname, Keys.CONTROL).sendKeys("a");
		act.keyUp(Keys.CONTROL);
		
		// to copy the value from fullname field (ctrl+c)
		
		act.keyDown(fullname, Keys.CONTROL).sendKeys("c");
		act.keyUp(Keys.CONTROL);
		
		// to paste the copied value to the mail id field (ctrl+v)
		
		WebElement mailid = driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		act.keyDown(mailid, Keys.CONTROL).sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		Thread.sleep(2000);
	}
	
	@AfterClass
	public void closing_method()
	{
		driver.quit();
	}

}



