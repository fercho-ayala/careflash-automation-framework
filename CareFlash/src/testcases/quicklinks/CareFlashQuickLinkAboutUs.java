package testcases.quicklinks;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.about.CareFlashAboutPage;
import pages.homepage.CareFlashHomePage;

/**
 * The Class CareFlashQuickLinkAboutUs.
 */
public class CareFlashQuickLinkAboutUs extends TestCase
{

    /*
     * (non-Javadoc)
     * 
     * @see libraries.TestCase#doTest()
     */
    @Override
    public void doTest()
    {
        super.loadResources("resources/pages/about/ContentsBundle");
        CareFlashHomePage homePage = new CareFlashHomePage();
        homePage.homePage();
        CareFlashAboutPage aboutPage = homePage.clickAboutUsQuickLink();
        Assert.assertEquals(aboutPage.getElementTextByCss("h2"),resources.getString("about.heading2"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//p"),resources.getString("about.paragraph"));
        Assert.assertEquals(aboutPage.getElementTextByCss("h3"),resources.getString("about.heading3"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//p[2]"),resources.getString("about.paragraph2"));
    }

    /**
     * Test care flash footer about link.
     */
    @Test
    public void testCareFlashQuickLinksAboutUs()
    {
        TestCase.quickRun(CareFlashQuickLinkAboutUs.class, "");
    }
}
