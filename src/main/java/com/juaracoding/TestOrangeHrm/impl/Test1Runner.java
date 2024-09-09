package com.juaracoding.TestOrangeHrm.impl;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/main/resources/features/001TestLoginPositif.feature",
		"src/main/resources/features/002TestLoginNegatif.feature",


		},
glue = "com.juaracoding.TestOrangeHrm.impl",
monochrome=true,
plugin = {"pretty","html:ujian6-report/extentreport/Report-OrangeHrm.html",
		"json:ujian6-report/extentreport/Report-OrangeHrm.json",
		"junit:ujian6-report/extentreport/Report-OrangeHrm.xml"})
public class Test1Runner extends AbstractTestNGCucumberTests{}