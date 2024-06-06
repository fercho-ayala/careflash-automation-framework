package pages.components;

import java.util.Locale;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.log4testng.Logger;

import pages.about.CareFlashAboutPage;
import pages.blog.CareFlashBlogPage;
import pages.homepage.CareFlashHomePage;
import pages.join.CareFlashRegistrationPage;
import pages.partners.CareFlashAlliancesPage;
import pages.tour.CareFlashTourPage;

public class NavigatorBar
{
    private Locale currentLocale;
    private ResourceBundle resources;
    protected static Logger logger;
    private final WebDriver driver;
    public NavigatorBar(WebDriver driver,String locale)
    {
        this.driver = driver;
        loadResources(locale);
        logger = Logger.getLogger(getClass());
    }

    private void loadResources(String locale)
    {
        String[] lang = locale.split("_");
        String language = new String(lang[0]);
        String country = new String(lang[1]);
        currentLocale = new Locale(language, country);
        resources = ResourceBundle.getBundle("resources/pages/components/ContentsBundle", currentLocale);
    }

    public CareFlashHomePage clickHome()
    {
        String element = resources.getString("element.home");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashHomePage();
    }
    
    public CareFlashTourPage clickTour()
    {
        String element = resources.getString("element.tour");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashTourPage();
    }
    public CareFlashBlogPage clickNews()
    {
        String element = resources.getString("element.news");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashBlogPage();
    }
    public CareFlashAlliancesPage clickPartners()
    {
        String element = resources.getString("element.partners");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashAlliancesPage();
    }
    public CareFlashAboutPage clickAbout()
    {
        String element = resources.getString("element.about");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashAboutPage();
    }
    public CareFlashRegistrationPage clickJoin()
    {
        String element = resources.getString("element.join");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashRegistrationPage();
    }
}
