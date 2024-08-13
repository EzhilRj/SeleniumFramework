package com.tests;

import com.tmb.Driver.Driver;
import com.tmb.Reports.ExtentReport;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;


public class BaseTest {

    @BeforeMethod
    public void setUp() throws Exception {
        Driver.initDriver();
    }

    @AfterMethod
    public void teardown() throws Exception {
        Driver.quitDriver();

    }
}
