package com.lision;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.BaseClass;
import com.runner.ExtentReport_Test;


	public class ITestListenerClass extends BaseClass implements ITestListener {

		public String testName;
		public String methodName;

		@Override
		public void onTestStart(ITestResult result) {

		}

		@Override
		public void onTestSuccess(ITestResult result) {
			try {
				ExtentReport_Test.extenttest.pass(result.getMethod().getMethodName() + " : " + "Test Pass",
						MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
			}

			catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void onTestFailure(ITestResult result) {

			try {
				ExtentReport_Test.extenttest.fail(result.getMethod().getMethodName() + " : " + "Test Failed",
						MediaEntityBuilder.createScreenCaptureFromPath(takeScreenshot()).build());
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}

