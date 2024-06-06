package libraries;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.log4testng.Logger;

public class TestListener implements ITestListener
{

    /** The logger. */
    private Logger logger = Logger.getLogger(this.getClass());

    /*
     * (non-Javadoc)
     * 
     * @see org.testng.ITestListener#onTestFailure(org.testng.ITestResult)
     */
    @Override
    public void onTestFailure(ITestResult tr)
    {
        System.out.println("LOG: " + tr.getInstanceName());
        System.out.println("LOG: " + tr.getName());
        System.out.println("LOG: " + tr.getTestName());
        System.out.println("LOG: " + tr.getMethod().getMethodName());

        logger.error("Failed Test.");
        Reporter.log("<a href=logs/" + tr.getName() + ".txt" + ">Log File</a>");
        Reporter.log("<a href=images/" + tr.getName() + ".png" + ">Screenshot File</a>");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.testng.ITestListener#onTestSkipped(org.testng.ITestResult)
     */
    @Override
    public void onTestSkipped(ITestResult tr)
    {
        logger.info("Skipped Test.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.testng.ITestListener#onTestSuccess(org.testng.ITestResult)
     */
    @Override
    public void onTestSuccess(ITestResult tr)
    {
        System.out.println("LOG: " + tr.getInstanceName());
        System.out.println("LOG: " + tr.getName());
        System.out.println("LOG: " + tr.getTestName());
        System.out.println("LOG: " + tr.getMethod().getMethodName());
        logger.info("Test Sucess.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.testng.ITestListener#onFinish(org.testng.ITestContext)
     */
    @Override
    public void onFinish(ITestContext arg0)
    {
        logger.info("Finish.");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.testng.ITestListener#onStart(org.testng.ITestContext)
     */
    @Override
    public void onStart(ITestContext arg0)
    {
        logger.info("Start");
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.testng.ITestListener#onTestFailedButWithinSuccessPercentage(org.testng
     * .ITestResult)
     */
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult tr)
    {
        logger.info("Test Failed But With in Success Percentage");
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.testng.ITestListener#onTestStart(org.testng.ITestResult)
     */
    @Override
    public void onTestStart(ITestResult tr)
    {
        logger.info("Starting Test.");
    }
}
