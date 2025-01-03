package guru99DemoTests.mainTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import resource.ExtentReport;

public class IListeners extends BaseTest implements ITestListener {


//    ExtentReports extent = ExtentReport.getReportObject();
//    ExtentTest test;
    /**
     * Invoked each time before a test will be invoked. The <code>ITestResult</code> is only partially
     * filled with the references to class, method, start millis and status.
     *
     * @param result the partially filled <code>ITestResult</code>
     * @see ITestResult#STARTED
     */
    public void onTestStart(ITestResult result) {
        extentReports.createTest(result.getMethod().getMethodName());
    }
//
//    /**
//     * Invoked each time a test succeeds.
//     *
//     * @param result <code>ITestResult</code> containing information about the run test
//     * @see ITestResult#SUCCESS
//     */
//    public void onTestSuccess(ITestResult result) {
//
//        test.log(Status.PASS, "Test passed");
//    }

    /**
     * Invoked each time a test fails.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#FAILURE
     */
    @Override
    public void onTestFailure(ITestResult result) {


        //test.fail(result.getThrowable());

        //getScreenshot(result.getTestName()+ ".jpg");
        // if for some reason we get null on the second shot, we can try another way

        System.out.println(result.getMethod().getMethodName());
        getScreenshot(result.getMethod().getMethodName()+ ".jpg");

        // if we wanna to have the name of the test in screenshot, we can use the below code
        //System.out.println(result.getTestContext().getName() + " - " + result + getMethod().getMethodName());
        getScreenshot(result.getTestContext().getName() + " - " + result.getMethod().getMethodName()+ ".jpg");

    }


    /**
     * Invoked each time a test is skipped.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#SKIP
     */
//    public void onTestSkipped(ITestResult result) {
//        // not implemented
//    }

    /**
     * Invoked each time a method fails but has been annotated with successPercentage and this failure
     * still keeps it within the success percentage requested.
     *
     * @param result <code>ITestResult</code> containing information about the run test
     * @see ITestResult#SUCCESS_PERCENTAGE_FAILURE
     */
//    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//        // not implemented
//    }
//
//    /**
//     * Invoked each time a test fails due to a timeout.
//     *
//     * @param result <code>ITestResult</code> containing information about the run test
//     */
//    public void onTestFailedWithTimeout(ITestResult result) {
//        onTestFailure(result);
//    }
//
//    /**
//     * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt;
//     * tag and calling all their Configuration methods.
//     *
//     * @param context The test context
//     */
//    public void onStart(ITestContext context) {
//        // not implemented
//    }
//
//    /**
//     * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have
//     * run and all their Configuration methods have been called.
//     *
//     * @param context The test context
//     */
//    public void onFinish(ITestContext context) {
//        extent.flush();
//    }
}
