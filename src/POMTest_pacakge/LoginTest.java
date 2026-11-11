package POMTest_pacakge;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMBase_package.BaseClass;
import POMPage_package.LoginPage;

public class LoginTest extends BaseClass {  // to get driver information from BaseClass
		
	LoginPage obj;
	
	@BeforeMethod
	public void object_method()
	{
		 obj = new LoginPage(driver);
	}
	
	
	@Test
	public void logintest_method()
	{
		obj.setValues();
		obj.login_method();
	}
	
	@Test
	public void title_verification()
	{
		System.out.println("Title : "+obj.title_method());
	}

}



