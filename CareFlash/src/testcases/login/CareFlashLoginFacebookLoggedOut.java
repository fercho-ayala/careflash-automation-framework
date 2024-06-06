package testcases.login;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.homepage.CareFlashHomePage;
import pages.homepage.CareFlashTodayPage;

/**
 * The Class CareFlashLoginFacebookLoggedOut.
 */
public class CareFlashLoginFacebookLoggedOut extends TestCase
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
        CareFlashTodayPage todayPage = homePage.loginFacebook("test.careflash@gmail.com", "Control123");
        Assert.assertEquals(todayPage.getElementTextByXPath("//p"), resources.getString("login.welcome"));
        todayPage.logout();
    }

    /**
     * Test care flash login Facebook logged out.
     */
    @Test
    public void testCareFlashLoginFacebookLoggedOut()
    {
        TestCase.quickRun(CareFlashLoginFacebookLoggedOut.class, "");
    }

}
