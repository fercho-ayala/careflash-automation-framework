package testcases.login;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.homepage.CareFlashHomePage;
import pages.homepage.CareFlashTodayPage;

/**
 * The Class CareFlashLoginFacebookLoggedIn.
 */
public class CareFlashLoginFacebookLoggedIn extends TestCase
{

    /*
     * (non-Javadoc)
     * 
     * @see libraries.TestCase#doTest()
     */
    @Override
    public void doTest()
    {
        super.loadResources("resources/pages/components/ContentsBundle");
        CareFlashHomePage homePage = new CareFlashHomePage();
        homePage.homePage();
        CareFlashTodayPage todayPage = homePage.loginFacebookLoggedIn();
        Assert.assertEquals(todayPage.getElementTextByXPath("//p"), resources.getString("login.welcome"));
        todayPage.logout();
    }

    /**
     * Test care flash login facebook logged in.
     */
    @Test
    public void testCareFlashLoginFacebookLoggedIn()
    {
        TestCase.quickRun(CareFlashLoginFacebookLoggedIn.class, "");
    }

}
