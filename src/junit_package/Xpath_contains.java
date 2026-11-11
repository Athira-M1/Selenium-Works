package junit_package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_contains {
	
	 ChromeDriver driver;
	 
	 @BeforeEach
	 public void setup()
	 {
		 driver = new ChromeDriver();
		 driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		 driver.manage().window().maximize();
	 }
	 
	 
	 @Test
	 public void register() throws Exception
	 {
		 WebElement rediff_mail = driver.findElement(By.xpath("//input[contains(@id,'login')]"));
		 rediff_mail.sendKeys("abhiiiiii");
		 
		 Thread.sleep(2000);
		 WebElement full_name = driver.findElement(By.xpath("//input[contains(@name,'name') and @placeholder=\"Enter your full name\"]"));   // "and" is used to locate this field beacuse other field also contains the text value name(i.e it should be 1 of 1)
		 full_name.sendKeys("Abhi");
	 }

}


