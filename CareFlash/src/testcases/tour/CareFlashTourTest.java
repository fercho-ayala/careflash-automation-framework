package testcases.tour;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.homepage.CareFlashHomePage;
import pages.tour.CareFlashTourPage;

public class CareFlashTourTest extends TestCase
{
    private CareFlashHomePage homePage;
    private CareFlashTourPage tourPage;

    @BeforeTest
    public void setUp()
    {
        super.loadResources("resources/pages/tour/ContentsBundle");
        homePage = new CareFlashHomePage();
        tourPage = homePage.clickTour();
    }

    @Override
    public void doTest()
    {

    }

    @Test
    public void testTour1()
    {
        Assert.assertEquals(tourPage.getElementTextByXPath("//h3"), resources.getString("tour.heading3"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p"), resources.getString("tour.paragraph"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p[2]"), resources.getString("tour.paragraph2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/ul/li"), resources.getString("tour.bullet"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/ul/li[2]"),
                resources.getString("tour.bullet2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/ul/li[3]"),
                resources.getString("tour.bullet3"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/ul/li[4]"),
                resources.getString("tour.bullet4"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/ul/li[5]"),
                resources.getString("tour.bullet5"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/ul/li[6]"),
                resources.getString("tour.bullet6"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//li[7]"), resources.getString("tour.bullet7"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//li[8]"), resources.getString("tour.bullet8"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//li[9]"), resources.getString("tour.bullet9"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//li[10]"), resources.getString("tour.bullet10"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p[3]"), resources.getString("tour.paragraph3"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//ul[2]/li"), resources.getString("tour.bullet11"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//ul[2]/li[2]"), resources.getString("tour.bullet12"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//ul[2]/li[3]"), resources.getString("tour.bullet13"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//ul[2]/li[4]"), resources.getString("tour.bullet14"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//ul[2]/li[5]"), resources.getString("tour.bullet15"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//ul[2]/li[6]"), resources.getString("tour.bullet16"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//ul[2]/li[7]"), resources.getString("tour.bullet17"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//ul[2]/li[8]"), resources.getString("tour.bullet18"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//ul[2]/li[9]"), resources.getString("tour.bullet19"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//ul[2]/li[10]"), resources.getString("tour.bullet20"));
    }

    @Test(dependsOnMethods = { "testTour1" })
    public void testTour2()
    {
        tourPage = tourPage.clickNextButton();
        Assert.assertEquals(tourPage.getElementTextByXPath("//h2"), resources.getString("tour2.heading2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/p"), resources.getString("tour2.paragraph"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p[2]"), resources.getString("tour2.paragraph2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p[3]"), resources.getString("tour2.paragraph3"));
    }

    @Test(dependsOnMethods = { "testTour2" })
    public void testTour3()
    {
        tourPage = tourPage.clickNextButton();
        tourPage = tourPage.clickPreviousButton();
        tourPage = tourPage.clickNextButton();
        Assert.assertEquals(tourPage.getElementTextByXPath("//h2"), resources.getString("tour3.heading2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/p"), resources.getString("tour3.paragraph"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p[2]"), resources.getString("tour3.paragraph2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p[3]"), resources.getString("tour3.paragraph3"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p[4]"), resources.getString("tour3.paragraph4"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p[5]"), resources.getString("tour3.paragraph5"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p[6]"), resources.getString("tour3.paragraph6"));
    }

    @Test(dependsOnMethods = { "testTour3" })
    public void testTour4()
    {
        tourPage = tourPage.clickNextButton();
        tourPage = tourPage.clickPreviousButton();
        tourPage = tourPage.clickNextButton();
        Assert.assertEquals(tourPage.getElementTextByXPath("//h2"), resources.getString("tour4.heading2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/p"), resources.getString("tour4.paragraph"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p[2]"), resources.getString("tour4.paragraph2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//p[3]"), resources.getString("tour4.paragraph3"));
    }

    @Test(dependsOnMethods = { "testTour4" })
    public void testTour5()
    {
        tourPage = tourPage.clickNextButton();
        tourPage = tourPage.clickPreviousButton();
        tourPage = tourPage.clickNextButton();
        Assert.assertEquals(tourPage.getElementTextByXPath("//h2"), resources.getString("tour5.heading2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/p"), resources.getString("tour5.paragraph"));
    }

    @Test(dependsOnMethods = { "testTour5" })
    public void testTour6()
    {
        tourPage = tourPage.clickNextButton();
        tourPage = tourPage.clickPreviousButton();
        tourPage = tourPage.clickNextButton();
        Assert.assertEquals(tourPage.getElementTextByXPath("//h2"), resources.getString("tour6.heading2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/p"), resources.getString("tour6.paragraph"));
    }

    @Test(dependsOnMethods = { "testTour6" })
    public void testTour7()
    {
        tourPage = tourPage.clickNextButton();
        tourPage = tourPage.clickPreviousButton();
        tourPage = tourPage.clickNextButton();
        Assert.assertEquals(tourPage.getElementTextByXPath("//h2"), resources.getString("tour7.heading2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/p"), resources.getString("tour7.paragraph"));
    }

    //@Test(dependsOnMethods = { "testTour6" })
    //public void testSampleLink()
    //{
        //tourPage.clickSampleLink();
    //}

    @Test(dependsOnMethods = { "testTour7" })
    public void testTourlast()
    {
        tourPage = tourPage.clickNextButton();
        Assert.assertEquals(tourPage.getElementTextByXPath("//h2"), resources.getString("tourlast.heading2"));
        Assert.assertEquals(tourPage.getElementTextByXPath("//div[2]/div/p"), resources.getString("tourlast.paragraph"));
    }
    
    //@Test(dependsOnMethods = { "testLast" })
    //public void testRegistrationLink()
    //{
        //tourPage.clickRegistrationButton();
    //}
}
