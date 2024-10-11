package com.testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	static ExtentReports extentReports;

	@BeforeTest
	public static ExtentReports reports() {

		String path = System.getProperty("user.dir") + "\\reports\\index";

		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Web Automation Results");
		report.config().setDocumentTitle("Opcon Results");

		extentReports = new ExtentReports();
		extentReports.attachReporter(report);
		extentReports.setSystemInfo("QA", "Ram");
		
		return extentReports;

	}

	/*
	 * @Test public void login() { ExtentTest extentTest =
	 * extentReports.createTest("login");
	 * 
	 * System.setProperty("webdriver.chrome.driver",
	 * "C:\\chromedriver\\chromedriver-win64\\chromedriver.exe"); WebDriver driver =
	 * new ChromeDriver(); driver.get("https://www.amazon.in/");
	 * driver.manage().window().maximize(); driver.getTitle();
	 * 
	 * // extentTest.fail("Fail the test");
	 * 
	 * extentReports.flush();
	 * 
	 * }
	 */
}
