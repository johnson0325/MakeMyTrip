package com.runner;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.base.BaseClass;
import com.lision.ITestListenerClass;
import com.poma.PageObject;
import com.properties.FileReaderManager;
@Listeners(ITestListenerClass.class)
public class MMT extends BaseClass {

	public static PageObject pom = new PageObject();
	
	@Test
	private void MakeMyTrip() throws IOException, InterruptedException {
		ExtentReport_Test.extenttest = extentReports.createTest("MMT").info("Product Details");
		launchBrowser("chrome");
		String url = FileReaderManager.getInstansfilFileReaderManager().getIntansConfiguration().getUrl();
		launchUrl(url);
		implicitwait(50);
		clickButton(pom.getHomePage().getPop());
		clickButton(pom.getHomePage().getHotel());
		clickButton(pom.getHomePage().getCity());
		clickButton(pom.getHomePage().getLocation());
		clickButton(pom.getSearchPage().getDatein());
		jsClick(pom.getSearchPage().getDateout());
		//clickButton(pom.getSearchPage().getDateout());
		
		
		clickButton(pom.getSearchPage().getApply());
		clickButton(pom.getSearchPage().getSearch());
		clickButton(pom.getBookPage().getHotelSelect());
		goWindow(1);
		Thread.sleep(3000);
		clickButton(pom.getBookPage().getBook());
		
		String getfname = FileReaderManager.getInstansfilFileReaderManager().getIntansConfiguration().getfname();
		passInput(pom.getGustDetails().getfName(), getfname);
		String lname = FileReaderManager.getInstansfilFileReaderManager().getIntansConfiguration().getlname();
		passInput(pom.getGustDetails().getlName(), lname);
		String email = FileReaderManager.getInstansfilFileReaderManager().getIntansConfiguration().getemail();
		passInput(pom.getGustDetails().getEmail(), email);
		String mobile = FileReaderManager.getInstansfilFileReaderManager().getIntansConfiguration().getmobile();
		passInput(pom.getGustDetails().getMobile(), mobile);
		clickButton(pom.getGustDetails().getBookwith());
		clickButton(pom.getGustDetails().getBooknow());
		String username = FileReaderManager.getInstansfilFileReaderManager().getIntansConfiguration().getUsername();
		passInput(pom.getLoginPage().getUsername(), username);
		clickButton(pom.getLoginPage().getCon());
		

		ExtentReport_Test.extenttest.pass("MMT",MediaEntityBuilder.createScreenCaptureFromBase64String(fullScreenshot("C:\\Users\\god\\eclipse-workspace\\newWorkspaces\\MMT\\Screen\\Full.png")).build());

	}

	@BeforeSuite
	private void extendStartup() {
		extentReportStart("C:\\Users\\god\\eclipse-workspace\\newWorkspaces\\MMT\\Reports");
	}

	@AfterSuite
	private void extendReoprtEnd() throws IOException {
		extentReportTearDown("C:\\Users\\god\\eclipse-workspace\\newWorkspaces\\MMT\\Reports\\Index.html");
	}
	@AfterTest
	private void tearDown() {
	terminateBrowser();
	}
}
