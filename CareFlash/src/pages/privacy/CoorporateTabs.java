package pages.privacy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.about.CareFlashAboutPage;
import pages.about.CareFlashContactPage;
import pages.about.CareFlashFAQsPage;
import pages.about.CareFlashTeamPage;

/**
 * The Class CoorporateTabs.
 */
public class CoorporateTabs
{

    /** The driver. */
    private final WebDriver driver;

    /**
     * Instantiates a new coorporate tabs.
     * 
     * @param driver
     *            the driver
     */
    public CoorporateTabs(WebDriver driver)
    {
        this.driver = driver;
    }

    /**
     * Click inspiration tab.
     * 
     * @return the care flash inspiration pages
     */
    public CareFlashAboutPage clickInspirationTab()
    {
        driver.findElement(By.linkText("Inspiration")).click();
        return new CareFlashAboutPage();
    }

    /**
     * Click contact tab.
     * 
     * @return the care flash contact pages
     */
    public CareFlashContactPage clickContactTab()
    {
        driver.findElement(By.linkText("Contact")).click();
        return new CareFlashContactPage();
    }

    /**
     * Click team tab.
     * 
     * @return the care flash team pages
     */
    public CareFlashTeamPage clickTeamTab()
    {
        driver.findElement(By.linkText("Team")).click();
        return new CareFlashTeamPage();
    }

    /**
     * Click fa qs tab.
     * 
     * @return the care flash fa qs pages
     */
    public CareFlashFAQsPage clickFAQsTab()
    {
        driver.findElement(By.linkText("FAQs")).click();
        return new CareFlashFAQsPage();
    }

    /**
     * Click alliance policy tab.
     * 
     * @return the care flash privacy alliance police pages
     */
    public CareFlashPrivacyAlliancePolicePage clickAlliancePolicyTab()
    {
        driver.findElement(By.linkText("Alliance Policy")).click();
        return new CareFlashPrivacyAlliancePolicePage();
    }

    /**
     * Click moderator policy tab.
     * 
     * @return the care flash privacy moderator police pages
     */
    public CareFlashPrivacyModeratorPolicePage clickModeratorPolicyTab()
    {
        driver.findElement(By.linkText("Moderator Policy")).click();
        return new CareFlashPrivacyModeratorPolicePage();
    }
}
