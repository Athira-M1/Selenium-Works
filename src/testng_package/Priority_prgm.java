package testng_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Priority_prgm {
	
	
	@BeforeClass
	public void beforeclassmethod()
	{
		System.out.println("Before class method");
	}
	
	@Test (priority=1 , invocationCount=3)  // invocationCount = 3 : method executes 3 times
	public void method_x()
	{
		System.out.println("Test method x");
	}
	
	@Test (priority=2 , enabled = false)   // enabled = false : completely disables the method
	public void method_a()
	{
		System.out.println("Test method a");
	}
	
	@Test (priority=3)
	public void method_f()
	{
		System.out.println("Test method f");
	}
	
	@AfterClass
	public void afterclassmethod()
	{
		System.out.println("After Class method");
	}
	
}
	

