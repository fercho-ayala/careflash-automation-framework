package pages.homepage;

import org.openqa.selenium.By;

import pages.Page;
import pages.community.CareFlashCommnunityPlace;
import pages.community.CareFlashHealthVideosPage;
import pages.community.CareFlashMyAccountPage;
import pages.community.CareFlashCareCommunityPage;

/**
 * The Class CareFlashTodayPage.
 */
public class CareFlashTodayPage extends Page
{
    /**
     * Instantiates a new care flash today pages.
     */
    public CareFlashTodayPage()
    {
        super();
        loadResources("resources/pages/homepage/ContentsBundle");
    }
    /**
     * Logout.
     * 
     * @return the login
     */
    public CareFlashHomePage logout()
    {
        driver.findElement(By.id("signout")).click();
        return new CareFlashHomePage();
    }

    public CareFlashCommnunityPlace placeLink(String community)
    {
        driver.findElement(By.linkText(community)).click();
        return new CareFlashCommnunityPlace();
    }


    public CareFlashTodayPage clickNewToday()
    {
        String element = resources.getString("element.newtoday");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashTodayPage();    }


    public CareFlashMyAccountPage clickMyAccount()
    {
        String element = resources.getString("element.myaccount");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashMyAccountPage();
    }

    public CareFlashHealthVideosPage clickHealthVideos()
    {
        String element = resources.getString("element.healthvideos");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashHealthVideosPage();
    }

    public CareFlashCareCommunityPage clickNewCareCommunity()
    {
        String element = resources.getString("element.newcarecommunity");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashCareCommunityPage();
    }
}
