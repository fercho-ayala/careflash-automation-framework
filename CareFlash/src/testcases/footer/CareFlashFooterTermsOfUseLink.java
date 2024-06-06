package testcases.footer;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.privacy.CareFlashTermOfUsePage;

/**
 * The Class CareFlashFooterTermsOfUseLink.
 */
public class CareFlashFooterTermsOfUseLink extends TestCase
{
    
    /* (non-Javadoc)
     * @see libraries.TestCase#doTest()
     */
    @Override
    public void doTest()
    {
        loadResources("resources/pages/privacy/ContentsBundle");
        CareFlashTermOfUsePage termsOfUsePage = new CareFlashTermOfUsePage();
        termsOfUsePage.clickTermsOfUseLink();
        Assert.assertEquals(termsOfUsePage.getElementTextByCss("h2"),resources.getString("tos.heading2"));
    }

    /**
     * Test care flash footer terms of use link.
     */
    @Test
    public void testCareFlashFooterTermsOfUseLink()
    {
        TestCase.quickRun(CareFlashFooterTermsOfUseLink.class, "");

    }

}
