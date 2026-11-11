package testng_package;

import org.testng.annotations.Test;

public class DependsOn_method_prgm {
	
	@Test
	public void reg()
	{
		System.out.println("Registration Method");
	}
	
	@Test(dependsOnMethods = "reg") // login method depends on reg method (login method will only execute when reg method is successful)
	public void login()
	{
		System.out.println("Login Method");
	}
	
	@Test(dependsOnMethods = {"reg","login"})  // home method depends on both reg and login method
	public void home()
	{
		System.out.println("Home Method");
	}

}


