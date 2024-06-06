package pages.tour;

import org.openqa.selenium.By;
import org.testng.log4testng.Logger;

import pages.Page;
import pages.community.CareFlashHealthVideosPage;
import pages.join.CareFlashRegistrationPage;

public class CareFlashTourPage extends Page
{
    public CareFlashTourPage()
    {
        super();
        loadResources("resources/pages/tour/ContentsBundle");
        logger = Logger.getLogger(getClass());
        //verifyContentPresent();
    }
/*
    public boolean verifyContentPresent()
    {
        boolean isPresent = false;
        isElementPresent(By.cssSelector("/images/views-v-2/corp/tour/tour-1.gif"));
        return isPresent;
    }
*/
    public CareFlashTourPage clickNextButton()
    {
        String element = resources.getString("element.next");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashTourPage();
    }

    public CareFlashTourPage clickPreviousButton()
    {
        String element = resources.getString("element.previous");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashTourPage();
    }
    public CareFlashRegistrationPage clickRegistrationButton()
    {
        String element = resources.getString("element.registration");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashRegistrationPage();
    }
    
    public CareFlashHealthVideosPage clickSampleLink()
    {
        String element = resources.getString("element.sample");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashHealthVideosPage();
    }
}
