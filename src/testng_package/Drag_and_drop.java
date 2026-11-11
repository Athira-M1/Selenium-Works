package testng_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Drag_and_drop {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void draganddrop_method() throws Exception
	{
		WebElement src = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
		
		Thread.sleep(2000);
		WebElement hover_button = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));
		act.moveToElement(hover_button).perform();
		Thread.sleep(2000);
		
		WebElement link1 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/div/a"));
		link1.click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		WebElement hold = driver.findElement(By.xpath("//*[@id=\"click-box\"]"));
		act.clickAndHold(hold).perform();
		Thread.sleep(2000);
		
		WebElement double_click = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
		act.doubleClick(double_click).perform();
		Thread.sleep(2000);
	}	
	
		
		

	

}
