package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FileUpload_sendkeys {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void fileupload()
	{
		WebElement upload_button = driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]"));
		upload_button.sendKeys("C:\\Users\\Athira M\\OneDrive\\Pictures\\Screenshots\\Screenshot 2026-08-03 183714.png");
		
	}

}
