package testcases.about;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.about.CareFlashAboutPage;
import pages.homepage.CareFlashHomePage;

public class CareFlashAboutTest extends TestCase
{
    private CareFlashHomePage homePage;
    private CareFlashAboutPage aboutPage;
    
    @BeforeClass
    public void setUp()
    {
        super.loadResources("resources/pages/about/ContentsBundle");
        homePage = new CareFlashHomePage();
        homePage.homePage();
        aboutPage = homePage.clickAbout();
        System.out.println("SETUP: " + this.getClass().getName());
    }

    @Override
    public void doTest()
    {

    }
    
    @Test
    public void testAbout()
    {
        Assert.assertEquals(aboutPage.getElementTextByXPath("//h2"), resources.getString("about.heading2"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//p"), resources.getString("about.paragraph"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//h3"), resources.getString("about.heading3"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//p[2]"), resources.getString("about.paragraph2"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//div[8]/div/div/div/div/ul/li"), resources.getString("about.bullet"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//div[8]/div/div/div/div/ul/li[2]"), resources.getString("about.bullet2"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//div[8]/div/div/div/div/ul/li[3]"), resources.getString("about.bullet3"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//div[8]/div/div/div/div/ul/li[4]"), resources.getString("about.bullet4"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//div[2]/ul/li"), resources.getString("about.bullet5"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//div[2]/ul/li[2]"), resources.getString("about.bullet6"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//div[2]/ul/li[3]"), resources.getString("about.bullet7"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//div[2]/ul/li[4]"), resources.getString("about.bullet8"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//p[3]"), resources.getString("about.paragraph3"));
        Assert.assertEquals(aboutPage.getElementTextByXPath("//p[4]"), resources.getString("about.paragraph4"));
        Assert.assertEquals(aboutPage.getElementTextByLinkText("http://www.youtube.com/watch?v=JDt__PSfUjlY&feature=youtu.be"), resources.getString("about.link1"));
        Assert.assertEquals(aboutPage.getAttributeByLinkText("http://www.youtube.com/watch?v=JDt__PSfUjlY&feature=youtu.be", "HREF"), resources.getString("about.hreflink1"));
    }
}
