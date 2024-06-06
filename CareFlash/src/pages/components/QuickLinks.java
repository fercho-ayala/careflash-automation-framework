package pages.components;

import java.util.Locale;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

import pages.about.CareFlashAboutPage;
import pages.createcommunity.CareFlashSignInPage;

// TODO: Auto-generated Javadoc
/**
 * The Class QuickLinks.
 */
public class QuickLinks
{
    /** The current locale. */
    private Locale currentLocale;
    
    /** The resources. */
    private ResourceBundle resources;

    /** The logger. */
    protected static Logger logger;

    /** The driver. */
    private final WebDriver driver;

    /**
     * Instantiates a new Quick links.
     * 
     * @param driver
     *            the driver
     */
    public QuickLinks(WebDriver driver, String locale)
    {
        this.driver = driver;
        loadResources(locale);
        logger = Logger.getLogger(getClass());
    }

    /**
     * Load resources.
     */
    private void loadResources(String locale)
    {
        String[] lang = locale.split("_");
        String language = new String(lang[0]);
        String country = new String(lang[1]);
        currentLocale = new Locale(language, country);
        resources = ResourceBundle.getBundle("resources/pages/components/ContentsBundle", currentLocale);
    }
    
    /**
     * Click create a new care community quick link.
     * 
     * @return the care flash sign in pages
     */
    public CareFlashSignInPage clickCreateaNewCareCommunityQuickLink()
    {
        String element = resources.getString("element.new_community");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashSignInPage();
    }
    /**
     * Click meet our partners quick link.
     * 
     * @return the care flash partners pages
     */
    public void clickMailToQuickLink()
    {
        String element = resources.getString("element.mail_to");
        driver.findElement(By.linkText(element)).click();
    }

    /**
     * Click about us quick link.
     * 
     * @return the care flash inspiration pages
     */
    public CareFlashAboutPage clickAboutUsQuickLink()
    {
        String element = resources.getString("element.about_us");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashAboutPage();
    }
}