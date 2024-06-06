package testcases.quicklinks;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.createcommunity.CareFlashSignInPage;
import pages.homepage.CareFlashHomePage;

/**
 * The Class CareFlashQuickLinkCreateCommunity.
 */
public class CareFlashQuickLinkCreateCommunity extends TestCase
{
/*
    @BeforeTest  
    public void setUp() throws Exception
    {
        resources = ResourceBundle.getBundle("resources/pages/createcommunity/ContentsBundle", currentLocale);
    }
*/
    /**
     * Do test.
     */
    @Override
    public void doTest()
    {
        super.loadResources("resources/pages/createcommunity/ContentsBundle");
        CareFlashHomePage homePage = new CareFlashHomePage();
        homePage.homePage();
        CareFlashSignInPage signInPage = homePage.clickCreateaNewCareCommunityQuickLink();
        Assert.assertEquals(signInPage.getElementTextByCss("h4.center"),resources.getString("signin.heading4"));
        Assert.assertEquals(signInPage.getElementTextByCss("p"),resources.getString("signin.paragraph1"));
    }

    /**
     * Test care flash quick link create community.
     */
    @Test
    public void testCareFlashQuickLinkCreateCommunity()
    {
        TestCase.quickRun(CareFlashQuickLinkCreateCommunity.class, "Create Community");
    }
}
