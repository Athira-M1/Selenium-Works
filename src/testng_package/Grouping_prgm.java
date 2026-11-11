package testng_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Grouping_prgm {
	@BeforeClass(alwaysRun=true)
	public void beforeclassmethod()
	{
		System.out.println("Before class method");
	}
	
	@Test(priority=1, groups="smoke")
	public void testmethod_1()
	{
		System.out.println("Test method 1");
	}
	
	@Test(priority=2, groups="sanity")
	public void testmethod_2()
	{
		System.out.println("Test method 2");
	}
	
	@Test(priority=3 , groups= {"regression","smoke"})
	public void testmethod_3()
	{
		System.out.println("Test method 3");
	}
	
	@AfterClass(alwaysRun=true)
	public void afterclassmethod()
	{
		System.out.println("After class method");
	}

}


