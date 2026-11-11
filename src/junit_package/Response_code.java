package junit_package;

import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Response_code {
	ChromeDriver driver;
	
	@BeforeEach
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://keralaproperty.in/member/login/");
		driver.manage().window().maximize();
	}
	
	
	@Test
	public void link_test() throws Exception  
	{
		String url = driver.getCurrentUrl();  // to retrieve the current url
		URI obj = new URI(url); // to verify the text is in correct link format
		URL link = obj.toURL();
		HttpURLConnection con = (HttpURLConnection) link.openConnection();
		int responsecode = con.getResponseCode();
		System.out.println("Response Code is : "+responsecode);
		
		if(responsecode==200)
		{
			System.out.println("Valid Link");
		}
		else if(responsecode==404)
		{
			System.out.println("Broken Link");
		}
		else
		{
			System.out.println("Other Response Code");
		}
			
	}
	
	
	@AfterEach
	public void closing_method()
	{
		driver.quit();
	}
	

}


