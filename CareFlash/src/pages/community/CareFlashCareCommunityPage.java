package pages.community;

import org.openqa.selenium.By;

import pages.Page;
import pages.homepage.CareFlashTodayPage;

public class CareFlashCareCommunityPage extends Page
{
    public CareFlashCareCommunityPage()
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

    public void setcommunitynamel(String communityname)
    {
        driver.findElement(By.id("titleID")).clear();
        driver.findElement(By.id("titleID")).sendKeys(communityname);
    }

    public void clickSomeOneElse()
    {
        driver.findElement(By.id("adminIsPatient2")).click();
    }

    public void setFirstName(String firstname)
    {
        driver.findElement(By.id("patientFirstName")).clear();
        driver.findElement(By.id("patientFirstName")).sendKeys(firstname);
    }

    public void setLastName(String lastname)
    {
        driver.findElement(By.id("patientLastName")).clear();
        driver.findElement(By.id("patientLastName")).sendKeys(lastname);
    }

    public void clickWhatNext()
    {
        driver.findElement(By.cssSelector("span.b_next")).click();
    }

    public void clickWhatTab()
    {
        driver.findElement(By.cssSelector("#tab_what > a > span > img")).click();
    }

    public void clickWhereNext()
    {
        driver.findElement(By.cssSelector("#tab_where > a.button.tabbutton")).click();
    }

    public void clickWhereTab()
    {
        driver.findElement(By.cssSelector("#tab_where > a > span")).click();
    }

    public void clickWhyNext()
    {
        driver.findElement(By.cssSelector("#tab_why > a.button.tabbutton > span.b_next")).click();
    }

    public void clickWhyTab()
    {
        driver.findElement(By.cssSelector("css=#tab_why > a > span > img")).click();
    }

    public void clickSettingsNext()
    {
        driver.findElement(By.cssSelector("#tab_settings > a.button.tabbutton > span.b_next")).click();
    }

    public void clickSettingsTab()
    {
        driver.findElement(By.cssSelector("#tab_settings > a > span > img")).click();
    }

    public void clickCreateCommunityButton()
    {
        driver.findElement(By.cssSelector("input.input-button")).click();
    }

    public CareFlashCommnunityPlace clickSendInvitationButton()
    {
        driver.findElement(By.cssSelector("span.b_next")).click();
        return new CareFlashCommnunityPlace();
    }

    public CareFlashTodayPage clickDeleteCommunity()
    {
        String element = resources.getString("element.delete.carecommunity");
        driver.findElement(By.xpath("//input[@value='" + element + "']")).click();
        driver.switchTo().alert().accept();
        return new CareFlashTodayPage();
    }
}
