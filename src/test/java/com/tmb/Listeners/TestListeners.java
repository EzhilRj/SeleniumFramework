package com.tmb.Listeners;
import com.tmb.Annotations.FrameworkAnnotations;
import com.tmb.Reports.ExtentLogger;
import com.tmb.Reports.ExtentReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestListeners implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.createtest(result.getMethod().getDescription());
        ExtentLogger.author(result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(FrameworkAnnotations.class).author());
    }

    @Override
    public void onStart(ITestContext context) {
        ExtentReport.initReports();
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentLogger.pass(result.getName());

    }

    @Override
    public  void onTestFailure(ITestResult result) {
        ExtentLogger.fail(result.getName());
        ExtentLogger.fail(result.getThrowable().getMessage());
        ExtentLogger.fail(Arrays.toString(result.getThrowable().getStackTrace()));
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.flushreport();
    }
}
