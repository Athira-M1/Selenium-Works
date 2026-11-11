package testng_package;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DatePicker_prgm {
	
	ChromeDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Datepicker.html");
		driver.manage().window().maximize();
	}
	
	@Test
	public void datepicker() throws Exception
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement calender = driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
		calender.click();
		
		while(true)   // find month
		{
			String month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText();
			System.out.println("Month : "+month);
			
			if(month.equalsIgnoreCase("January 2027"))
			{
				break;
			}
			else
			{
				WebElement nextarrow = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
				nextarrow.click();
			}
		}  // month selected
		
	//	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[5]")).click();  // method used to select date directly
		
		
		List<WebElement> date = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr/td/a"));
		
		for(WebElement d : date)
		{
			String datetext = d.getText();
			if(datetext.equals("21"))
			{
				d.click();
				System.out.println("Date Selected !!");
				break;
			}
		}
	}

}
