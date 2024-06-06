package testcases.home;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.community.CareFlashHealthVideosPage;
import pages.createcommunity.CareFlashSignInPage;
import pages.homepage.CareFlashHomePage;
import pages.homepage.CareFlashSocialMarketingPage;
import pages.join.CareFlashRegistrationPage;
import pages.privacy.CareFlashTellAFriendPopup;
import pages.search.CareFlashSearchPage;

public class CareFlashHomeTest extends TestCase
{
    private CareFlashHomePage homePage;
    
    @BeforeTest
    public void setUp()
    {
        super.loadResources("resources/pages/homepage/ContentsBundle");
        homePage = new CareFlashHomePage();
        homePage.homePage();
    }
    
    @Override
    public void doTest()
    {

    }
    
    @Test
    public void testHomeText()
    {
      //HomeTop
        Assert.assertEquals(homePage.getElementTextByXPath("//h1"), resources.getString("home.heading1"));
        Assert.assertEquals(homePage.getElementTextByXPath("//p"), resources.getString("home.paragraph"));
        Assert.assertEquals(homePage.getElementTextByXPath("//p[2]"), resources.getString("home.paragraph2"));
        Assert.assertEquals(homePage.getElementTextByXPath("//p[3]"), resources.getString("home.paragraph3"));
        Assert.assertEquals(homePage.getElementTextByXPath("//p[4]"), resources.getString("home.paragraph4"));
        //HomeCenter
        Assert.assertEquals(homePage.getElementTextByXPath("//div[2]/div/h1"), resources.getString("home.cheading1"));
        Assert.assertEquals(homePage.getElementTextByXPath("//li/p"), resources.getString("home.cline1"));
        Assert.assertEquals(homePage.getElementTextByXPath("//li[2]/p"), resources.getString("home.cline2"));
        Assert.assertEquals(homePage.getElementTextByXPath("//li[3]/p"), resources.getString("home.cline3"));
        Assert.assertEquals(homePage.getElementTextByXPath("//li[4]/p"), resources.getString("home.cline4"));
        Assert.assertEquals(homePage.getElementTextByXPath("//li[5]/p"), resources.getString("home.cline5"));
        Assert.assertEquals(homePage.getElementTextByXPath("//li[6]/p"), resources.getString("home.cline6"));
        Assert.assertEquals(homePage.getElementTextByXPath("//li[7]/p"), resources.getString("home.cline7"));
        //HomeRight
        Assert.assertEquals(homePage.getElementTextByXPath("//h2"), resources.getString("home.rheading2"));
        Assert.assertEquals(homePage.getElementTextByXPath("//div[3]/div/ul/li"), resources.getString("home.rline1"));
        Assert.assertEquals(homePage.getElementTextByXPath("//div[3]/div/ul/li[2]"), resources.getString("home.rline2"));
        Assert.assertEquals(homePage.getElementTextByXPath("//div[3]/div/ul/li[3]"), resources.getString("home.rline3"));
        Assert.assertEquals(homePage.getElementTextByXPath("//div[3]/div/ul/li[4]"), resources.getString("home.rline4"));
        Assert.assertEquals(homePage.getElementTextByXPath("//div[3]/div/ul/li[5]"), resources.getString("home.rline5"));
        Assert.assertEquals(homePage.getElementTextByXPath("//div[3]/div/ul/li[6]"), resources.getString("home.rline6"));
        
    }

    @Test
    public void testHomeLeftScrollbar()
    {
        Assert.assertEquals(homePage.getElementTextByXPath("//div[2]/div/div/div/p"), resources.getString("home.scrollbar1"));
        Assert.assertEquals(homePage.getElementTextByXPath("//div[2]/p"), resources.getString("home.scrollbar2"));
        Assert.assertEquals(homePage.getElementTextByXPath("//div[3]/p"), resources.getString("home.scrollbar3"));
        Assert.assertEquals(homePage.getElementTextByXPath("//div[4]/p"), resources.getString("home.scrollbar4"));
        Assert.assertEquals(homePage.getElementTextByXPath("//div[5]/p"), resources.getString("home.scrollbar5"));
        Assert.assertEquals(homePage.getElementTextByXPath("//div[6]/p"), resources.getString("home.scrollbar6"));
        //Assert.assertEquals(homePage.getElementTextByXPath("//div[@id='scrollbar1']/div[2]/div/div/div[7]/p"), resources.getString("home.scrollbar7"));
        //Assert.assertEquals(homePage.getElementTextByXPath("//div[@id='scrollbar1']/div[2]/div/div/div[8]/p"), resources.getString("home.scrollbar8"));
        //Assert.assertEquals(homePage.getElementTextByXPath("//div[@id='scrollbar1']/div[2]/div/div/div[9]/p"), resources.getString("home.scrollbar9"));
        //Assert.assertEquals(homePage.getElementTextByXPath("//div[@id='scrollbar1']/div[2]/div/div/div[10]/p"), resources.getString("home.scrollbar10"));
        //Assert.assertEquals(homePage.getElementTextByXPath("//div[@id='scrollbar1']/div[2]/div/div/div[11]/p"), resources.getString("home.scrollbar11"));
        //Assert.assertEquals(homePage.getElementTextByXPath("//div[@id='scrollbar1']/div[2]/div/div/div[12]/p"), resources.getString("home.scrollbar12"));
    }

    @Test
    public void testHomeSocialLinks()
    {
        Assert.assertEquals(homePage.getElementTextByXPath("//div[2]/div/b"), resources.getString("home.social"));
        Assert.assertEquals(homePage.getAttributeByCss("a.social.fcbk", "HREF"), resources.getString("home.hreffacebook"));
        Assert.assertEquals(homePage.getAttributeByCss("a.social.twitter", "HREF"), resources.getString("home.hreftwitter"));
        Assert.assertEquals(homePage.getAttributeByCss("a.social.youtube", "HREF"), resources.getString("home.hrefyoutube"));
        Assert.assertEquals(homePage.getAttributeByCss("a.social.pinterest", "HREF"), resources.getString("home.hrefpinterest"));
        Assert.assertEquals(homePage.getAttributeByCss("a.social.linkedin", "HREF"), resources.getString("home.hreflinkedin"));
    }

    @Test
    public void testTellFriendPopUp()
    {
        CareFlashTellAFriendPopup TellAFriendPopUp = homePage.clickTellFriendPopUpHome();
        Assert.assertTrue(TellAFriendPopUp.verifyContentPresent());
        TellAFriendPopUp.clickCancelButton();
    }

    @Test
    public void testNewCareCommunityLink()
    {
        CareFlashSignInPage signInPage = homePage.clickNewCareCommunityLink();
        //Assert.assertTrue(signInPage.verifyContent());
        signInPage.clickHome();
    }

    @Test
    public void testNewToCareFlashLink()
    {
        CareFlashRegistrationPage joinPage = homePage.clickNewToCareFlashLink();
        //Assert.assertTrue(joinPage.verifyContent());
        joinPage.clickHome();
    }

    @Test
    public void testForgotPassPopUp()
    {
        homePage.clickForgotPassword();
        homePage.clickCancelButton();
    }

    @Test
    public void testorgotPass()
    {
        homePage.clickForgotPassword();
        homePage.setusernameoremail("testcareflash");
    }
    @Test
    public void testSearchLabel()
    {
        CareFlashSearchPage searchPage = homePage.clickSearchLink();
        //Assert.assertTrue(searchPage.verifyContent());
        searchPage.clickHome();
    }

    @Test
    public void testSampleLink()
    {
        CareFlashHealthVideosPage healthVideoPage = homePage.clickSampleLink();
        //Assert.assertTrue(healthVideoPage.verifyContent());
        healthVideoPage.clickHome();
    }

    @Test(dependsOnMethods = { "testHomeText", "testHomeLeftScrollbar", "testHomeSocialLinks", "testTellFriendPopUp", "testNewCareCommunityLink", "testNewToCareFlashLink", "testForgotPassPopUp", "testSearchLabel", "testSampleLink",})
    public void testMoreInfoLink()
    {
        CareFlashSocialMarketingPage socialMareketingPage = homePage.clickMoreInfoLink();
        Assert.assertTrue(socialMareketingPage.verifyContent());
        socialMareketingPage.clickHome();
    }

}
