package junit_package;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_prgm2 {
	
ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
}
	
	@Test
	public void register()
	{
		WebElement rediff_home = driver.findElement(By.xpath("//p[@id=\"signin_info\"]/a"));
		rediff_home.click();
	}
	
	@AfterEach
	public void closing_method()
	{
		driver.quit();
	}
	
}
	
	


