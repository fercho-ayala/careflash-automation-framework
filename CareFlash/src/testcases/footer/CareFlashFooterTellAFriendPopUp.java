package testcases.footer;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.privacy.CareFlashTellAFriendPopup;

/**
 * The Class CareFlashFooterTellAFriendPopUp.
 */
public class CareFlashFooterTellAFriendPopUp extends TestCase
{

    /*
     * @see libraries.TestCase#doTest()
     */
    @Override
    public void doTest()
    {
        CareFlashTellAFriendPopup careFlashTellAFriendPopUp = new CareFlashTellAFriendPopup();
        careFlashTellAFriendPopUp.clickTellAFriendPopUp();
        Assert.assertTrue(careFlashTellAFriendPopUp.verifyContentPresent());
        careFlashTellAFriendPopUp.clickCancelButton();
    }

    /**
     * Test care flash footer tell a friend pop up.
     */
    @Test
    public void testCareFlashFooterTellAFriendPopUp()
    {
        TestCase.quickRun(CareFlashFooterTellAFriendPopUp.class, "");
    }
}
