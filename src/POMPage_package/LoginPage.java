package POMPage_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	// locating web elements using Page Factory
	@FindBy(xpath="//*[@id=\"ulogin\"]") WebElement username;
	@FindBy(id="upass") WebElement password;
	@FindBy(id="sub_logbtn") WebElement login_button;
	
	// constructor
	public LoginPage(WebDriver driver) 
	{
		this.driver=driver;	
		PageFactory.initElements(driver, this);
	}
	
	
	// Methods
	public void setValues()
	{
		username.sendKeys("abc@gmail.com");
		password.sendKeys("1234");
	}
	
	public void login_method()
	{
		login_button.click();
	}
	
	public String title_method()
	{
		String title = driver.getTitle();
		return title;
	}
	
	

}

