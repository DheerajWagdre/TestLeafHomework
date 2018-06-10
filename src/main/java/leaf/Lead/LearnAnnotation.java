package leaf.Lead;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotation {
	@BeforeSuite
	public void BeforeSuit(){

		System.out.println("beforeSuit");
	}
	@BeforeTest
	public void BeforeTest(){

		System.out.println("beforeTest");
	}
	@org.testng.annotations.BeforeClass
	public void BeforeClass(){

		System.out.println("BeforeClass");
	}
	@BeforeMethod
	public void BeforeMethod(){

		System.out.println("BeforeMethod");
	}
	@Test
	public void Test(){

		System.out.println("Test");
	}
	@Test
	public void Test2(){

		System.out.println("Test2");
	}
	@AfterMethod
	public void AfterMethod(){

		System.out.println("AfterMethod");
	}
	@AfterClass
	public void AfterClass(){

		System.out.println("AfterClass");
	}
	
	@org.testng.annotations.AfterTest
	public void AfterTest(){

		System.out.println("AfterTest");
	}
	@AfterSuite
	public void AfterSuit(){

		System.out.println("AfterSuit");
	}

}
