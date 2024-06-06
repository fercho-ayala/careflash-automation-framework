package libraries;

import static libraries.Utils.createLogFile;
import static libraries.Utils.takeScreenshot;
import static org.testng.AssertJUnit.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;
import java.util.ResourceBundle;

import org.testng.log4testng.Logger;

import pages.Page;

/**
 * The Class TestCase.
 */
public abstract class TestCase
{
    /** The verification errors. */
    private StringBuilder verificationErrors;

    /** The logger. */
    protected Logger logger = Logger.getLogger(getClass());
    
    /** The Constant LANGUAGE. */
    private final String LANGUAGE = System.getProperty("language");

    /** The testcase. */
    private static TestCase testcase;
    
    /** The current locale. */
    protected Locale currentLocale;
    
    /** The resources. */
    protected ResourceBundle resources;
    
    protected void loadResources(String resourcePath)
    {
        String[] lang = LANGUAGE.split("_");
        String language = new String(lang[0]);
        String country = new String(lang[1]);
        currentLocale = new Locale(language, country);
        resources = ResourceBundle.getBundle(resourcePath, currentLocale);
    }
    

    /**
     * Run.
     * 
     * @param unqualifiedClassName
     *            the unqualified class name
     */
    private void run(String unqualifiedClassName)
    {
        verificationErrors = new StringBuilder();
        ByteArrayOutputStream errorOutput = new ByteArrayOutputStream();
        PrintStream err = new PrintStream(errorOutput);

        try
        {
            doTest();
        }
        catch (AssertionError | Exception e)
        {
            e.printStackTrace(err);
            logger.error("AssertionError", e);
            verificationErrors.append(e);
            createLogFile(unqualifiedClassName, errorOutput);
            takeScreenshot(unqualifiedClassName);
        }
    }

    /**
     * Quick run.
     * 
     * @param clazz
     *            the clazz
     * @param msgError
     *            the msg error
     */
    public static void quickRun(Class<? extends TestCase> clazz, String msgError)
    {
        try
        {
            testcase = clazz.newInstance();
            testcase.run(clazz.getSimpleName());
        }
        catch (IllegalAccessException | InstantiationException e)
        {
            Logger.getLogger(TestCase.class).error(msgError, e);
        }
        finally
        {
            testcase.tearDown(msgError);
        }
    }

    /**
     * Tear down.
     * 
     * @param message
     *            the message
     */
    private void tearDown(String message)
    {
        if (!"".equals(verificationErrors.toString()))
        {
            fail(message);
        }
    }

    /**
     * Do test.
     */
    public abstract void doTest();
}
