package pages.privacy;

import org.openqa.selenium.By;

import pages.Page;

/**
 * The Class CareFlashResetPassPopup.
 */
public class CareFlashTellAFriendPopup extends Page
{

    private String window;
    /**
     * Instantiates a new care flash tell a friend pop up.
     */
    public CareFlashTellAFriendPopup()
    {
        super();
        loadResources("resources/pages/privacy/ContentsBundle");
        window = driver.getWindowHandle();
    }
    /**
     * Checks if is title present.
     * 
     * @return true, if is title present
     */
    public boolean verifyContentPresent()
    {
        String element = resources.getString("tellfriend.heading");
        boolean isPresent = isElementPresent(By.xpath("//img[@alt='CareFlash - Updates when it matters most']"))
            && isElementPresent(By.xpath("//div[contains(text(),'" + element + "')]"));
        return isPresent;
    }

    /**
     * Click cancel button.
     */
    public void clickCancelButton()
    {
        String element = resources.getString("tellfriend.cancel");
        driver.findElement(By.xpath("//input[@value=' "+element+"  ']")).click();
        driver.switchTo().window(this.window);
    }

    /**
     * Click tell a friend pop up.
     * 
     * @return the care flash tell a friend pop up
     */
    public CareFlashTellAFriendPopup clickTellAFriendPopUp()
    {
        CareFlashTellAFriendPopup tellAFriendPage = super.footer.clickTellAFriendPopUp();
        driver.switchTo().window(getLastWindow());
        return tellAFriendPage;
    }
}

