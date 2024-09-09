package com.juaracoding.TestOrangeHrm.impl;

//
import com.juaracoding.TestOrangeHrm.connectivity.DriverSingleton;
import com.juaracoding.TestOrangeHrm.scenariomapping.LoginTesting;
import com.juaracoding.TestOrangeHrm.util.Constants;
import com.juaracoding.TestOrangeHrm.util.GlobalFunction;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Test1Hooks {
	public static WebDriver driver;
	public static ExtentTest extentTest;
	public static ExtentReports reports = new ExtentReports(GlobalFunction.rootProject+"/"+GlobalFunction.extendReportName +"-main/extentreport/TestOrangeHrm.html");
	private static LoginTesting[] tests = LoginTesting.values();
	private static final int[] DATA_OUTLINE = {

			1,//TLPA001 Valid Login
			1,//TLNA002 Login Dengan Email Dan Password Kosong
			1,//TLNA003 Login Dengan Email Tidak Valid
			1,//TLNA004 Login Dengan Password Tidak Valid
			1,
			1,
			1,
			1,


	};
	private String testReport = "";
	
	@Before
	public void setUp() {
		DriverSingleton.getInstance(Constants.CHROME);
		driver = DriverSingleton.getDriver();
		testReport = tests[GlobalFunction.testCount].getTestName();
		extentTest = reports.startTest(testReport);
		if(GlobalFunction.countOutline==DATA_OUTLINE[GlobalFunction.testCount])
		{
			GlobalFunction.countOutline=0;
			GlobalFunction.testCount++;
		}
		GlobalFunction.countOutline++;
	}
	
	@AfterStep
	public void getResultStatus(Scenario scenario) throws IOException {
		if(scenario.isFailed()) {
			String screenshotPath = GlobalFunction.getScreenshot(driver, GlobalFunction.extendReportName +scenario.getName().replace(" ", "_"));
			extentTest.log(LogStatus.FAIL, scenario.getName()+"\n"
					+extentTest.addScreenCapture(screenshotPath));
		}
	}
	
	@After
	public void closeObject() {
		reports.endTest(extentTest);
		reports.flush();
	}
	
	@AfterAll
	public static void closeBrowser() {
		GlobalFunction.delay(Constants.TIMEOUT_DELAY, Constants.GLOB_PARAM_DELAY);
		DriverSingleton.closeObjectInstance();
	}
}