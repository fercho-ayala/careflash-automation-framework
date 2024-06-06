package testcases.login;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.homepage.CareFlashHomePage;
import pages.homepage.CareFlashUserSignInPage;

/**
 * The Class CareFlashLoginBlank.
 */
public class CareFlashLoginBlank extends TestCase
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
        homePage.login("", "");
        CareFlashUserSignInPage signinPage = new CareFlashUserSignInPage();
        Assert.assertEquals(signinPage.getElementTextByXPath("//h3"), resources.getString("user.signin.heading3"));
        Assert.assertEquals(signinPage.getElementTextByXPath("//strong"), resources.getString("user.signin.paragraph"));
    }

    /**
     * Test care flash login blank.
     */
    @Test
    public void testCareFlashLoginBlank()
    {
        TestCase.quickRun(CareFlashLoginBlank.class, "");
    }

}
