package testcases.footer;

import org.testng.Assert;
import libraries.TestCase;

import org.testng.annotations.Test;

import pages.about.CareFlashFAQsPage;
import pages.homepage.CareFlashHomePage;

/**
 * The Class CareFlashQuickLinkFAQs.
 */
public class CareFlashFooterFAQsLink extends TestCase
{
    @Override
    public void doTest()
    {
        loadResources("resources/pages/about/ContentsBundle");
        CareFlashHomePage homePage = new CareFlashHomePage();
        CareFlashFAQsPage fagsPage = homePage.clickFAQsLink();
        Assert.assertEquals(fagsPage.getElementTextByCss("h2"), resources.getString("fag.heading2"));
        Assert.assertEquals(fagsPage.getElementTextByCss("h3"), resources.getString("fag.heading3"));
    }

    /**
     * Test care flash footer fa qs link.
     */
    @Test
    public void testCareFlashFooterFAQsLink()
    {
        TestCase.quickRun(CareFlashFooterFAQsLink.class, "");
    }
}
