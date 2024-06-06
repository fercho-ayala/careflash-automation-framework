package testcases.about;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.about.CareFlashAboutPage;
import pages.about.CareFlashContactPage;
import pages.homepage.CareFlashHomePage;

public class CareFlashContactUsTest extends TestCase
{
    private CareFlashHomePage homePage;
    private CareFlashAboutPage aboutPage;
    private CareFlashContactPage contactPage;
    
    @BeforeClass
    public void setUp()
    {
        super.loadResources("resources/pages/about/ContentsBundle");
        homePage = new CareFlashHomePage();
        homePage.homePage();
        aboutPage = homePage.clickAbout();
        contactPage = aboutPage.clickContactUsTab();
        System.out.println("SETUP: " + this.getClass().getName());
    }

    @Override
    public void doTest()
    {

    }
    
    @Test
    public void testContactUs()
    {
        Assert.assertEquals(contactPage.getElementTextByCss("h2"),resources.getString("contact.heading2"));
        Assert.assertEquals(contactPage.getElementTextByXPath("//p"),resources.getString("contact.paragraph"));
        Assert.assertEquals(contactPage.getElementTextByXPath("//p[2]"),resources.getString("contact.paragraph2"));
        Assert.assertEquals(contactPage.getElementTextByXPath("//p[3]"),resources.getString("contact.paragraph3"));
        Assert.assertEquals(contactPage.getElementTextByXPath("//p[4]"),resources.getString("contact.paragraph4"));
        Assert.assertEquals(contactPage.getElementTextByXPath("//p[5]"),resources.getString("contact.paragraph5"));
    }
}
