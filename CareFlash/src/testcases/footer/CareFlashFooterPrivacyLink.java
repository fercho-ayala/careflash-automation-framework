package testcases.footer;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.privacy.CareFlashPrivacyPage;

/**
 * The Class CareFlashQuickLinkMeetOurPartners.
 */
public class CareFlashFooterPrivacyLink extends TestCase
{

    /*
     * (non-Javadoc)
     * 
     * @see libraries.TestCase#doTest()
     */
    @Override
    public void doTest()
    {
        loadResources("resources/pages/privacy/ContentsBundle");
        CareFlashPrivacyPage privacyPage = new CareFlashPrivacyPage();
        privacyPage.clickPrivacyLink();
        Assert.assertEquals(privacyPage.getElementTextByCss("h2"),resources.getString("privacy.heading2"));
    }

    /**
     * Test care flash footer privacy link.
     */
    @Test
    public void testCareFlashFooterPrivacyLink()
    {
        TestCase.quickRun(CareFlashFooterPrivacyLink.class, "Privacy Link");
    }
}
