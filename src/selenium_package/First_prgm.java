package selenium_package;

import org.openqa.selenium.chrome.ChromeDriver;

public class First_prgm {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		// EdgeDriver driver = new EdgeDriver();  -> to open edge browser
		// FirefoxDriver driver = new FirefoxDriver(); -> to open firefox browser
		driver.get("https://www.google.com/");
		String actual_title = driver.getTitle();   // to retrieve the title of the web application
		System.out.println("Title of the web application is : "+actual_title);
		
		String expected_title = "Google";
		if (actual_title.equals(expected_title))
		{
			System.out.println("The titles matches");
		}
		else
		{
			System.out.println("Titles not matched");
		}
	}

}



