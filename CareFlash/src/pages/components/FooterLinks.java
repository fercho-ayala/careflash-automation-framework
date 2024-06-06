package pages.components;

import java.util.Locale;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

import pages.about.CareFlashAboutPage;
import pages.about.CareFlashContactPage;
import pages.about.CareFlashFAQsPage;
import pages.privacy.CareFlashPrivacyPage;
import pages.privacy.CareFlashTellAFriendPopup;
import pages.privacy.CareFlashTermOfUsePage;

/**
 * The Class FooterLinks.
 */
public class FooterLinks
{
    /** The logger. */
    protected static Logger logger;

    /** The driver. */
    private final WebDriver driver;

    /** The current locale. */
    private Locale currentLocale;
    
    /** The resources. */
    private ResourceBundle resources;

    /**
     * Instantiates a new footer links.
     * 
     * @param driver
     *            the driver
     */
    public FooterLinks(WebDriver driver,String locale)
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
     * Click support link.
     * 
     * @return the care flash contact pages
     */
    public CareFlashContactPage clickContactUsLink()
    {
        String element = resources.getString("element.contact");
        driver.findElement(By.linkText(element)).click();
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            logger.info("InterruptedExceptionSupport", e);
        }
        return new CareFlashContactPage();
    }

    /**
     * Click tell a friend pop up.
     * 
     * @return the care flash tell a friend pop up
     */
    public CareFlashTellAFriendPopup clickTellAFriendPopUp()
    {
        String element = resources.getString("element.tell");
        driver.findElement(By.linkText(element)).click();
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            logger.info("InterruptedExceptionTellaFriend", e);
        }
        return new CareFlashTellAFriendPopup();
    }

    /**
     * Click terms of use link.
     * 
     * @return the care flash term of use pages
     */
    public CareFlashTermOfUsePage clickTermsOfUseLink()
    {
        String element = resources.getString("element.terms");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashTermOfUsePage();
    }

    /**
     * Click privacy link.
     * 
     * @return the care flash privacy pages
     */
    public CareFlashPrivacyPage clickPrivacyLink()
    {
        String element = resources.getString("element.privacy");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashPrivacyPage();
    }

    /**
     * Click about link.
     * 
     * @return the care flash inspiration pages
     */
    public CareFlashAboutPage clickTellUsLink()
    {
        String element = resources.getString("element.about");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashAboutPage();
    }

    /**
     * Click FAQs link.
     * 
     * @return the care flash faqs pages
     */
    public CareFlashFAQsPage clickFAQsLink()
    {
        String element = resources.getString("element.faqs");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashFAQsPage();
    }

}