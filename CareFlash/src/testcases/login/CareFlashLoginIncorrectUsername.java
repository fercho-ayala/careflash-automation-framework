package testcases.login;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.homepage.CareFlashHomePage;
import pages.homepage.CareFlashUserSignInPage;

// TODO: Auto-generated Javadoc
/**
 * The Class CareFlashLoginIncorrectUsername.
 */
public class CareFlashLoginIncorrectUsername extends TestCase
{

    /*
     * (non-Javadoc)
     * 
     * @see libraries.TestCase#doTest()
     */
    @Override
    public void doTest()
    {
        super.loadResources("resources/pages/homepage/ContentsBundle");
        CareFlashHomePage homePage = new CareFlashHomePage();
        homePage.homePage();
        homePage.login("InvalidUsername", "1234");
        CareFlashUserSignInPage signinPage = new CareFlashUserSignInPage();
        Assert.assertEquals(signinPage.getElementTextByXPath("//h3"), resources.getString("user.signin.heading3"));
        Assert.assertEquals(signinPage.getElementTextByXPath("//strong"), resources.getString("user.signin.paragraph"));
    }

    /**
     * Test care flash login incorrect username.
     */
    @Test
    public void testCareFlashLoginIncorrectUsername()
    {
        TestCase.quickRun(CareFlashLoginIncorrectUsername.class, "");
    }

}
