package libraries;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.log4testng.Logger;

public class SuiteListener implements ISuiteListener
{

    /*
     * (non-Javadoc)
     * 
     * @see org.testng.ISuiteListener#onStart(org.testng.ISuite)
     */
    @Override
    public void onStart(ISuite suite)
    {
        Logger.getLogger(getClass()).info("Starting... " + suite.getName());
        WebDriverManager.startDriver();
        WebDriverManager.openBrowser();
        //Page.setLanguage(); //TODO
    }

    /*
     * (non-Javadoc)
     * 
     * @see org.testng.ISuiteListener#onFinish(org.testng.ISuite)
     */
    @Override
    public void onFinish(ISuite suite)
    {
        Logger.getLogger(getClass()).info("Finishing... " + suite.getName());
        WebDriverManager.stopDriver();
    }
}
