package pages.about;

import java.util.Locale;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

/**
 * The Class CoorporateTabs.
 */
public class AboutSubNavBar
{

    /** The driver. */
    private WebDriver driver;
    
    /** The current locale. */
    private Locale currentLocale;
    
    /** The resources. */
    private ResourceBundle resources;
    
    /** The logger. */
    protected static Logger logger;


    public AboutSubNavBar(WebDriver driver, String locale)
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
        resources = ResourceBundle.getBundle("resources/pages/about/ContentsBundle", currentLocale);
    }
    /**
     * Click inspiration tab.
     * 
     * @return the care flash inspiration pages
     */
    public CareFlashAboutPage clickAboutTab()
    {
        String element = resources.getString("element.about");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashAboutPage();
    }

    /**
     * Click faqs tab.
     * 
     * @return the care flash fa qs pages
     */
    public CareFlashFAQsPage clickFAQsTab()
    {
        String element = resources.getString("element.faq");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashFAQsPage();
    }

    /**
     * Click team tab.
     * 
     * @return the care flash team pages
     */
    public CareFlashTeamPage clickTeamTab()
    {
        String element = resources.getString("element.team");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashTeamPage();
    }

    /**
     * Click contact tab.
     * 
     * @return the care flash contact pages
     */
    public CareFlashContactPage clickContactUsTab()
    {
        String element = resources.getString("element.contact_us");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashContactPage();
    }
}
