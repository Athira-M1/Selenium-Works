package testng_package;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
  @BeforeTest
   public void beforetestmethod()
   {
	System.out.println("Before Test method");
   }

  @BeforeClass
  public void beforeclassmethod()
  {
	  System.out.println("Before Class method");
  }
  
  @BeforeMethod
  public void method1()
  {
	  System.out.println("Before Method method");
  }
  
  @Test
  public void testmethod_a()
  {
	  System.out.println("Test method a");
  }
  
  
  @Test
  public void testmethod_x()
  {
	  System.out.println("Test method x");
  }
	  
  @Test
  public void testmethod_c()
  {
	  System.out.println("Test method c");
  }
  
  @AfterMethod
  public void method2()
  {
	  System.out.println("After Method method");
  }
  
  @AfterClass
  public void afterclassmethod()
  {
	  System.out.println("After Class method");
  }
  
  @AfterTest
  public void aftertestmethod()
  {
	  System.out.println("After Test method");
  }

}


