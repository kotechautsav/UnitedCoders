package com.testing.Parabank.ExtensionMethods;

import org.testng.annotations.AfterTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.testing.Parabank.Utils.DateUtils;

public class ExtendReport {
	public static ExtentReports report;
	//Method for Extent Report
	
	public static ExtentReports getReportInstance(){
		
		if(report == null){
			String reportName = DateUtils.getTimeStamp() + ".html";
			ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter( System.getProperty("user.dir")+"\\ReportOutputs\\"+reportName);
			report =  new ExtentReports();
			report.attachReporter(htmlReporter);
			
			report.setSystemInfo("OS", "Windows 10");
			report.setSystemInfo("Environment", "UAT");
			report.setSystemInfo("Build Number", "10.8.1");
			report.setSystemInfo("Browser", "Chrome,Firefox");
			//ExtentHtmlReport
			htmlReporter.config().setDocumentTitle("Automation Results");
			htmlReporter.config().setReportName("Test Report");
			htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
			htmlReporter.config().setTimeStampFormat("MMM dd, yyyy HH:mm:ss");
		}
		//Returning the report.
		return report;
	}
	
	@AfterTest
	public static void flushReport() {
		report.flush();
	}

}