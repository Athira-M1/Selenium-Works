package junit_package;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_prgm {
	 ChromeDriver driver;
	 
	 @BeforeEach
	 public void setup()
	 {
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Athira%20M/OneDrive/Desktop/alert.html");
		driver.manage().window().maximize();
	 }
	
	 
	 @Test
	 public void alert() throws Exception
	 {
		 WebElement alertbox = driver.findElement(By.xpath("//input[@value=\"Display alert box\"]"));
		 alertbox.click();
		 
		 // handle alert box
		 Alert alrt = driver.switchTo().alert();  // to switch the control to the alert box
		 String text=alrt.getText();             // to retrieve the text from alert box
		 System.out.println("Alert Text : "+text);
		 
		 Thread.sleep(2000);
		 alrt.accept();   // accepts the alert
		 
		 
		 WebElement firstname = driver.findElement(By.xpath("/html/body/input[2]"));
		 firstname.sendKeys("Athira");
		 
		 WebElement lastname = driver.findElement(By.xpath("/html/body/input[3]"));
		 lastname.sendKeys("M");
		 
		 WebElement submit_button = driver.findElement(By.xpath("/html/body/input[4]"));
		 submit_button.click();
	 }

}



