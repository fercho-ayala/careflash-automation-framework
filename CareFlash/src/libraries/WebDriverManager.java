package libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverManager 
{
    private static WebDriver driver;
    
    private static WebDriverWait wait;
  
    /** The Constant BROWSER. */
    public static final String BROWSER = System.getProperty("browser");

    /** The Constant URL. */
    private static final String URL = System.getProperty("url");

    /** The Constant OS. */
    private static final String OS = System.getProperty("os.name");

    /** The Constant WEB_DRIVER_PATH. */
    private static final String WEB_DRIVER_PATH = "resources/webdrivers/chrome";

    /** The Constant CHROME_DRIVER. */
    private static final String CHROME_DRIVER = "webdriver.chrome.driver";


    public static WebDriver getDriverInstance()
    {
        return driver;
    }
    
    public static WebDriverWait getDriverWaitInstance()
    {
        return wait;
    }
    
    /**
     * Open browser.
     */
    public static void openBrowser()
    {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    /**
     * Select browser.
     */
    private static void selectBrowser()
    {
        if ("firefox".equals(BROWSER))
        {
            driver = new FirefoxDriver();
        }
        else if ("chrome".equals(BROWSER))
        {
            if ("Mac OS X".equals(OS))
            {
                System.setProperty(CHROME_DRIVER, WEB_DRIVER_PATH + "/chromedriver");
            }
            else
            {
                System.setProperty(CHROME_DRIVER, WEB_DRIVER_PATH + "\\chromedriver.exe");
            }
            driver = new ChromeDriver();
        }
        else if ("ie".equals(BROWSER))
        {
            System.setProperty("webdriver.ie.driver", WEB_DRIVER_PATH + "\\IE\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }
        else if ("safari".equals(BROWSER))
        {
            driver = new SafariDriver();
        }
    }

    public static WebDriver startDriver() {
        selectBrowser();
        wait = new WebDriverWait(driver, 30);
        return driver;
    }
    
    public static void stopDriver() {
        driver.close();
        driver.quit();
    }
}