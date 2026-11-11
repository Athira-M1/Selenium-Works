package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrame2 {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://vinothqaacademy.com/iframe/");
		driver.manage().window().maximize();
		
		
	}
	
	
	@Test
	public void iframe_method() throws Exception
	{
		Thread.sleep(4000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/div/div/div/div/div/iframe[1]")));
		WebElement frame_tag = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/div/div/div/div/div/iframe[1]"));
		driver.switchTo().frame(frame_tag);
	
		
		WebElement name = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[2]/div[1]/div/section/div/div/div/div/div/table[1]/tbody/tr/td[1]/input"));
		name.click();
		name.sendKeys("abcd");
	
		
		driver.switchTo().defaultContent();
	}
	

}
