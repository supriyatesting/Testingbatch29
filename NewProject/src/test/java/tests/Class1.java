package tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Class1 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass test class1");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod test class1");
	}
	
	@Test
	public void testB() {
		System.out.println("test B test Class1");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod test Class1");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass testClass1");
	}
	

	}
	
	


