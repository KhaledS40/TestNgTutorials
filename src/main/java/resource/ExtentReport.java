package resource;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

    public static ExtentReports getReportObject() {

        String pathVariable = System.getProperty("user.dir") + "\\report\\index.html";
        ExtentSparkReporter sparkR = new ExtentSparkReporter(pathVariable);
        sparkR.config().setDocumentTitle("FirstTest");
        sparkR.config().setReportName("Test Results");


        ExtentReports report = new ExtentReports();
        report.attachReporter(sparkR);
        report.setSystemInfo("Tester", "Khaled");

        return report;

    }
}
