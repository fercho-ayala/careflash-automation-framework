package pages;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.ResourceBundle;

import libraries.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import pages.about.CareFlashAboutPage;
import pages.about.CareFlashContactPage;
import pages.about.CareFlashFAQsPage;
import pages.blog.CareFlashBlogPage;
import pages.components.FooterLinks;
import pages.components.NavigatorBar;
import pages.homepage.CareFlashHomePage;
import pages.join.CareFlashRegistrationPage;
import pages.partners.CareFlashAlliancesPage;
import pages.privacy.CareFlashPrivacyPage;
import pages.privacy.CareFlashTellAFriendPopup;
import pages.privacy.CareFlashTermOfUsePage;
import pages.tour.CareFlashTourPage;

/**
 * The Class Page.
 */
public class Page
{
    /** The current locale. */
    protected Locale currentLocale;
    
    /** The resources. */
    protected ResourceBundle resources;

    /** The Constant URL. */
    protected final String URL = System.getProperty("url");

    /** The Constant LANGUAGE. */
    protected final String LANGUAGE = System.getProperty("language");

    /** The Constant EN. */
    private final String EN = "en_US";

    /** The Constant SP. */
    private final String SP = "es_ES";

    /** The Constant IN. */
    private final String IN = "Ingles";
    private final String ES = "Spanish";



    /** The driver. */
    protected WebDriver driver;
    protected WebDriverWait wait;

    /** The footer. */
    protected FooterLinks footer;
    
    /** The navbar. */
    protected NavigatorBar navbar;

    /** The logger. */
    protected Logger logger;

    /**
     * Instantiates a new pages.
     */
    protected Page()
    {
        driver = WebDriverManager.getDriverInstance();
        wait = WebDriverManager.getDriverWaitInstance();
        footer = new FooterLinks(driver,LANGUAGE);
        navbar = new NavigatorBar(driver,LANGUAGE);
        logger = Logger.getLogger(getClass());
    }
    
    /**
     * Load resources.
     */
    protected void loadResources(String resourcePath)
    {
        String[] lang = LANGUAGE.split("_");
        String language = new String(lang[0]);
        String country = new String(lang[1]);
        currentLocale = new Locale(language, country);
        resources = ResourceBundle.getBundle(resourcePath, currentLocale);
    }

    /**
     * Home.
     * 
     * @return the care flash home pages
     */
    public CareFlashHomePage home()
    {
        driver.get(URL);
        driver.manage().window().maximize();
        return new CareFlashHomePage();
    }

    /**
     * Home pages.
     */
    public void homePage()
    {
        driver.get(URL);
        driver.manage().window().maximize();
    }
    
    /**
     * Sets the language.
     */
    public void setLanguage()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put(EN, IN);
        map.put(SP, ES);

        try
        {
            driver.findElement(By.linkText(map.get(LANGUAGE))).click();
        }
        catch (NoSuchElementException e)
        {
            // Page.logger.info("No such element: " + map.get(LANGUAGE), e);
        }
    }

    /**
     * Checks if is element present.
     * 
     * @param by
     *            the by
     * @return true, if is element present
     */
    protected boolean isElementPresent(By by)
    {
        try
        {
            driver.findElement(by);
            return true;
        }
        catch (NoSuchElementException e)
        {
            logger.warn("No such element: " + by.toString(), e);
            return false;
        }
    }
    
    protected boolean isTitlePresent(String text)
    {
        return isElementPresent(By.xpath("//h1[contains(text(), '" + text + "')]")) 
               || isElementPresent(By.xpath("//h2[contains(text(), '" + text + "')]"))
               || isElementPresent(By.xpath("//h3[contains(text(), '" + text + "')]"));
    }
    
    protected boolean isParagraphPresent(String text)
    {
        return isElementPresent(By.xpath("//p[contains(text(), '" + text + "')]"));
    }

    protected String getAttributeHref(By by)
    {
        String text = "";
        try
        {
            text = driver.findElement(by).getAttribute("HREF");
            
            System.out.println("ATTRIBUTE: " + text);
        }
        catch (NoSuchElementException e)
        {
            logger.warn("No such HREF attribute: " + by.toString(), e);
        }
        return text;
    }
    protected String getAttribute(By by, String name)
    {
        String attribute = "";
        try
        {
            attribute = driver.findElement(by).getAttribute(name);
            System.out.println("ATTRIBUTE: " + attribute);
        }
        catch (NoSuchElementException e)
        {
            logger.warn("No such " + attribute +" attribute: " + by.toString(), e);
        }
        return attribute;
    }

    public String getAttributeById(String id, String name)
    {
        return getAttribute(By.id(id),name);
    }
    public String getAttributeByName(String nameElement, String name)
    {
        return getAttribute(By.name(nameElement),name);
    }
    public String getAttributeByTagName(String tagName, String name)
    {
        return getAttribute(By.tagName(tagName),name);
    }
    public String getAttributeByCss(String css, String name)
    {
        return getAttribute(By.cssSelector(css),name);
    }
    public String getAttributeByXPath(String xpath, String name)
    {
        return getAttribute(By.xpath(xpath),name);
    }
    public String getAttributeByLinkText(String linkText, String name)
    {
        return getAttribute(By.linkText(linkText),name);
    }
    public String getAttributeByPartialLinkText(String partialLinkText, String name)
    {
        return getAttribute(By.partialLinkText(partialLinkText),name);
    }

    protected String getElementText(By by)
    {
        String text = "";
        try
        {
            text = driver.findElement(by).getText();
            System.out.println("TEXT SITE: " + text);
            //text = new String(text.getBytes(),"UTF8");
            //System.out.println("TEXT SITE UTF8: " + text);
        }
        catch (NoSuchElementException e)
        {
            logger.warn("No such element: " + by.toString(), e);
        }/*
        catch (UnsupportedEncodingException e)
        {
            e.printStackTrace();
        }*/
        return text;
    }
    public String getElementTextById(String id)
    {
        return getElementText(By.id(id));
    }
    public String getElementTextByName(String name)
    {
        return getElementText(By.name(name));
    }
    public String getElementTextByTagName(String tagName)
    {
        return getElementText(By.tagName(tagName));
    }
    public String getElementTextByCss(String css)
    {
        return getElementText(By.cssSelector(css));
    }
    public String getElementTextByXPath(String xpath)
    {
        return getElementText(By.xpath(xpath));
    }
    public String getElementTextByLinkText(String linkText)
    {
        return getElementText(By.linkText(linkText));
    }
    public String getElementTextByPartialLinkText(String partialLinkText)
    {
        return getElementText(By.partialLinkText(partialLinkText));
    }
    
    public String getLastWindow()
    {
        String windowName = "";
        for (String windowHandle : driver.getWindowHandles())
        {
            windowName = windowHandle;
        }
        return windowName;
    }

    /**
     * Gets the language.
     * 
     * @return the language
     */
    public String getLANGUAGE()
    {
        return LANGUAGE;
    }

    /**
     * Gets the footer.
     * 
     * @return the footer
     */
    public FooterLinks getFooter()
    {
        return footer;
    }
    
    /**
     * Gets the NavigatorBar.
     * 
     * @return the 
     */
    public NavigatorBar getNavBar()
    {
        return navbar;
    }

    public CareFlashHomePage clickHome()
    {
        return this.navbar.clickHome();
    }
    
    public CareFlashTourPage clickTour()
    {
        return this.navbar.clickTour();
    }
    public CareFlashBlogPage clickNews()
    {
        return this.clickNews();
    }
    public CareFlashAlliancesPage clickPartners()
    {
        return this.navbar.clickPartners();
    }
    public CareFlashAboutPage clickAbout()
    {
        return this.navbar.clickAbout();
    }
    public CareFlashRegistrationPage clickJoin()
    {
        return this.navbar.clickJoin();
    }

    /**
     * Click support link.
     * 
     * @return the care flash contact pages
     */
    public CareFlashContactPage clickContactUsLink()
    {
        return this.footer.clickContactUsLink();
    }

    /**
     * Click tell a friend pop up.
     * 
     * @return the care flash tell a friend pop up
     */
    public CareFlashTellAFriendPopup clickTellAFriendPopUp()
    {
        return this.footer.clickTellAFriendPopUp();
    }

    /**
     * Click terms of use link.
     * 
     * @return the care flash term of use pages
     */
    public CareFlashTermOfUsePage clickTermsOfUseLink()
    {
        return this.footer.clickTermsOfUseLink();
    }

    /**
     * Click privacy link.
     * 
     * @return the care flash privacy pages
     */
    public CareFlashPrivacyPage clickPrivacyLink()
    {
        return this.footer.clickPrivacyLink();
    }

    /**
     * Click about link.
     * 
     * @return the care flash inspiration pages
     */
    public CareFlashAboutPage clickTellUsLink()
    {
        return this.footer.clickTellUsLink();
    }

    /**
     * Click FAQs link.
     * 
     * @return the care flash faqs pages
     */
    public CareFlashFAQsPage clickFAQsLink()
    {
        return this.footer.clickFAQsLink();
    }
    
}
