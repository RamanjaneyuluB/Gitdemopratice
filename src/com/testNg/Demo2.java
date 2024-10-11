package com.testNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo2 {
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("After class");
	}
	
	@Test(groups = {"smoke"} )
	public void m2() {
		System.out.println("Nagra");
	}
	
	@Test(dataProvider = "getData")
	public void m3(String username, String password) {
		System.out.println("Nagra");
		System.out.println(username);
		System.out.println(password);
	}
	
	@Test(enabled = false)
	public void m4() {
		System.out.println("Nagra");
	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		
		data[0][0] = "username";
		data[0][1] = "password";
		
		data[1][0] = "username";
		data[1][1] = "password";
		
		data[2][0] = "username";
		data[2][1] = "password";
		
		return data;
	}
	
	@Test(dependsOnMethods = {"m3"})
	public void m5() {
		System.out.println("Nagra");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Tests");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}


}
