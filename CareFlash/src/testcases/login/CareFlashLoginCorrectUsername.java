package testcases.login;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.homepage.CareFlashHomePage;
import pages.homepage.CareFlashTodayPage;

/**
 * The Class CareFlashiHelpCalendarTest.
 */
public class CareFlashLoginCorrectUsername extends TestCase
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
        CareFlashTodayPage todayPage = homePage.login("prodcareflash ", "1234");
        Assert.assertEquals(todayPage.getElementTextByXPath("//p"), resources.getString("login.welcome"));
        todayPage.logout();
    }

    /**
     * Test care flash login correct username.
     */
    @Test
    public void testCareFlashLoginCorrectUsername()
    {
        TestCase.quickRun(CareFlashLoginCorrectUsername.class, "");
    }
}
