package testcases.about;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.about.CareFlashAboutPage;
import pages.about.CareFlashFAQsPage;
import pages.homepage.CareFlashHomePage;
import libraries.TestCase;

public class CareFlashFAQsTest extends TestCase
{
    private CareFlashHomePage homePage;
    private CareFlashAboutPage aboutPage;
    private CareFlashFAQsPage fagsPage;
    
    @BeforeClass
    public void setUp()
    {
        super.loadResources("resources/pages/about/ContentsBundle");
        homePage = new CareFlashHomePage();
        homePage.homePage();
        aboutPage = homePage.clickAbout();
        fagsPage = aboutPage.clickFAQsTab();
        System.out.println("SETUP: " + this.getClass().getName());
    }

    @Override
    public void doTest()
    {

    }
    
    @Test
    public void testFAQs()
    {
        Assert.assertEquals(fagsPage.getElementTextByCss("h2"), resources.getString("fag.heading2"));
        Assert.assertEquals(fagsPage.getElementTextByCss("h3"), resources.getString("fag.heading3"));
    }
}
