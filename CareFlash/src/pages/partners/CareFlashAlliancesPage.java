package pages.partners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.log4testng.Logger;

import pages.Page;

public class CareFlashAlliancesPage extends Page
{
    /** The logger. */
    protected static Logger logger;
    
    
    private String windowsName;
    
    public CareFlashAlliancesPage()
    {
        super();
        loadResources("resources/pages/components/ContentsBundle");
        windowsName = driver.getWindowHandle();
        logger = Logger.getLogger(getClass());
        verifyContentPresent();
    }

    public void verifyContentPresent() 
    {
        Assert.assertTrue(isElementPresent(By.cssSelector("h1")));
        Assert.assertTrue(isElementPresent(By.cssSelector("p")));
    }
    
    public void switchToAlliancesPage()
    {
        if (!this.windowsName.equals(driver.getWindowHandle()))
        {
            driver.close();
            driver.switchTo().window(windowsName);
        }
    }

    public CareFlashPartnerPage clickPartnerLink(String id)
    {
        driver.findElement(By.id(id)).click();
        driver.switchTo().window(getLastWindow());
        return new CareFlashPartnerPage();
    }
}