package libraries;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

/**
 * The Class Utils.
 */
public class Utils
{

    /** The logger. */
    private static Logger logger = Logger.getLogger(Utils.class);

    /**
     * Instantiates a new utils.
     */
    private Utils()
    {

    }

    /**
     * Creates the log file.
     * 
     * @param className
     *            the class name
     * @param errorOutput
     *            the error output
     */
    public static void createLogFile(String className, ByteArrayOutputStream errorOutput)
    {
        File outfile = new File(Setup.LOGS_FOLDER_PATH.concat("test").concat(className) + ".txt");
        BufferedWriter writeFile;
        try
        {
            writeFile = new BufferedWriter(new FileWriter(outfile));
            writeFile.write(errorOutput.toString());
            writeFile.close();
        }
        catch (IOException e)
        {
            logger.error("Some sort has occurred creating log file.", e);
        }
    }

    /**
     * Take screenshot.
     * 
     * @param className
     *            the class name
     */
    public static void takeScreenshot(String className)
    {
        WebDriver driver = WebDriverManager.getDriverInstance();
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try
        {
            FileUtils.copyFile(scrFile, new File(Setup.IMAGES_FOLDER_PATH.concat("test").concat(className) + ".png"));
        }
        catch (IOException e)
        {
            logger.error("Some sort has occurred taking screenshoot.", e);
        }
    }
}
