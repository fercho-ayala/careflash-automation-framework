package pages.community;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.Page;

public class CareFlashCommnunityPlace extends Page
{
    public CareFlashCommnunityPlace()
    {
        super();
        loadResources("resources/pages/carecommunity/ContentsBundle");
        //verifyContentPresent();
    }

    public boolean verifyContentPresent()
    {
        boolean isPresent = false;
        String imageLearnMore = resources.getString("partner.img1.alt");
        String imageCreateCoomunity = resources.getString("partner.img2.alt");

        isPresent = isElementPresent(By.cssSelector("em"))
                && isElementPresent(By.cssSelector("img[alt=\"" + imageLearnMore + "\"]"))
                && isElementPresent(By.cssSelector("img[alt=\"" + imageCreateCoomunity + "\"]"));
        return isPresent;
    }

    public String getImageTitle(String title)
    {
        return getElementTextByCss("img[alt=\"" + title + "\"]");
    }

    public CareFlashiHelpCalendarPage clickiHelpCalendar()
    {
        driver.findElement(By.id("ihelp_calendar_link")).click();
        return new CareFlashiHelpCalendarPage();
    }

    public CareFlashPhotosPage clickPhotos()
    {
        String element = resources.getString("element.photos");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashPhotosPage();
    }

    public CareFlashSocialStorytellingPage clickSocialStorytelling()
    {
        String element = resources.getString("element.socialstorytelling");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashSocialStorytellingPage();
    }

    public CareFlashHealthVideosPage clickHealthVideos()
    {
        String element = resources.getString("element.healthvideos");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashHealthVideosPage();
    }

    public CareFlashMembersPage clickMembers()
    {
        String element = resources.getString("element.members");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashMembersPage();
    }

    public CareFlashMembersPage clickInviteFriends()
    {
        String element = resources.getString("element.invitefriends");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashMembersPage();
    }

    public CareFlashCareCommunityPage clickEditCommunity()
    {
        String element = resources.getString("element.editcommunity");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashCareCommunityPage();
    }

    public CareFlashCareCommunityPage clickNewCareCommunity()
    {
        String element = resources.getString("element.newcarecommunity");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashCareCommunityPage();
    }

    public CareFlashEditCommunityPage clickEditCommunityInfo()
    {
        String element = resources.getString("element.editcommunityinfo");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashEditCommunityPage();
    }

    public CareFlashPhotosPage clickMyPhoto()
    {
        driver.findElement(By.id("myphoto")).click();
        return new CareFlashPhotosPage();
    }

    public CareFlashSocialStorytellingPage click()
    {
        driver.findElement(By.cssSelector("a.main-title")).click();
        return new CareFlashSocialStorytellingPage();
    }

    public CareFlashSitatedPage clicSituated()
    {
        driver.findElement(By.id("helplink")).click();
        return new CareFlashSitatedPage();
    }

    public CareFlashHealthVideosPage clickClassHealthVideos()
    {
        String element = resources.getString("element.classhealthvideos");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashHealthVideosPage();
    }

    public CareFlashEditCommunityPage clickAddDetails()
    {
        String element = resources.getString("element.adddetails ");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashEditCommunityPage();
    }

    public CareFlashMembersPage clickViewFriends()
    {
        driver.findElement(By.id("view_all_friends")).click();
        return new CareFlashMembersPage();
    }

    public CareFlashiHelpCalendarPage clickEnteraNewRequest()
    {
        String element = resources.getString("element.enteranewrequest");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashiHelpCalendarPage();
    }

    public void clickEditStory()
    {
        driver.findElement(By.id("storyEdit")).click();
    }

    public void clickCancelEditStoryButton()
    {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("cancelEditStory")));
        element.click();
    }

    public void clickCreateDiscussion()
    {
        driver.findElement(By.id("forumEdit")).click();
    }

    public void clickCancelEntryButton()
    {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("cancelentry")));
        element.click();
    }

    public CareFlashViewCommentsPage clickViewComments()
    {
        String element = resources.getString("element.viewcomments");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashViewCommentsPage();
    }

    public void clickViewOlderPosts()
    {
        String element = resources.getString("element.viewolderpost");
        driver.findElement(By.linkText(element)).click();
    }
}
