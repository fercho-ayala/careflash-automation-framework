package testcases.footer;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.about.CareFlashContactPage;
import pages.homepage.CareFlashHomePage;

/**
 * The Class CareFlashFooterContacUsLink.
 */
public class CareFlashFooterContacUsLink extends TestCase
{

    @Override
    public void doTest()
    {
        loadResources("resources/pages/about/ContentsBundle");
        CareFlashHomePage homePage = new CareFlashHomePage();
        CareFlashContactPage contactPage = homePage.clickContactUsLink();

        Assert.assertEquals(contactPage.getElementTextByCss("h2"),resources.getString("contact.heading2"));
        Assert.assertEquals(contactPage.getElementTextByXPath("//p"),resources.getString("contact.paragraph"));
        Assert.assertEquals(contactPage.getElementTextByXPath("//p[2]"),resources.getString("contact.paragraph2"));
        Assert.assertEquals(contactPage.getElementTextByXPath("//p[3]"),resources.getString("contact.paragraph3"));
        Assert.assertEquals(contactPage.getElementTextByXPath("//p[4]"),resources.getString("contact.paragraph4"));
        Assert.assertEquals(contactPage.getElementTextByXPath("//p[5]"),resources.getString("contact.paragraph5"));
        
    }

    /**
     * Test care flash footer support link.
     */
    @Test
    public void testCareFlashFooterContacUsLink()
    {
        TestCase.quickRun(CareFlashFooterContacUsLink.class, "");

    }
}
