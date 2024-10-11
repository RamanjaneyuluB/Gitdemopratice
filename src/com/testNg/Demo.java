package com.testNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {

	@Parameters({"URL"})
	@Test
	public void m1(String urlname) {
		System.out.println("Ram");
		System.out.println(urlname);
	}
	
	@Test(groups = {"smoke"} )
	public void m2() {
		System.out.println("Ram");
	}
}
