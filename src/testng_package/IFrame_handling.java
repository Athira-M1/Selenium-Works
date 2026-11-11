package testng_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class IFrame_handling {
	
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();	
	}
	
	@Test(priority =1)
	public void login_method()
	{
		WebElement username = driver.findElement(By.xpath("//*[@id=\"ulogin\"]"));
		username.sendKeys("test1234@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//*[@id=\"upass\"]"));
		password.sendKeys("test@123");
		
		WebElement login_button = driver.findElement(By.xpath("//*[@id=\"sub_logbtn\"]"));
		login_button.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlContains("myhome"));
	}
	
	@Test(priority=2)
	public void addProperty_method()
	{
		WebElement add_property = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div/ul/li[3]/a"));
		add_property.click();
		
		// summary box is inside iframe so we need to switch to that iframe 1st and then pass values to the summary box
		WebElement frame_tag = driver.findElement(By.xpath("//*[@id=\"frm_property\"]/div[9]/div/div/iframe"));
		driver.switchTo().frame(frame_tag);
		
		WebElement summary_box = driver.findElement(By.xpath("/html/body"));
		summary_box.click();
		summary_box.sendKeys("abcdef");
		
		driver.switchTo().defaultContent();
	}

}


