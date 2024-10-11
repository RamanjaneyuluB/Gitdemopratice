package com.testNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LiveScreens {
	
	@Test 
	public void Livechannels() {
		System.out.println("channel screens");
	}
	
	@Test 
	public void Liveevents() {
		System.out.println("Events Screen");
	}
	
	@Test
	public void Livecomplexevents() {
		System.out.println("Events Screen");
	}
	@Test(groups = {"smoke"} )
	public void LiveSimpleevents() {
		System.out.println("Events Screen");
	}
	
	@Test
	public void LiveModerateevents() {
		System.out.println("Events Screen");
	}
	
	@Test
	public void LiveCOmevents() {
		System.out.println("Events Screen");
	}
	
	@BeforeSuite
	public void beforeTest()
	{
		System.out.println("Before Sute");
	}
	
	@AfterSuite
	public void afterSute() {
		System.out.println("After sute");
	}

}
