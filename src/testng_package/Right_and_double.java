package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Right_and_double {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void click() throws Exception 
	{
		Thread.sleep(2000);
		WebElement double_click = driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		
		Actions act = new Actions(driver);
		act.doubleClick(double_click);
	
		
		
		WebElement right_click = driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		act.contextClick(right_click);
		act.perform();
		Thread.sleep(2000);
	
	}
	
	@AfterClass
	public void closing_method()
	{
		driver.quit();
	}

}


