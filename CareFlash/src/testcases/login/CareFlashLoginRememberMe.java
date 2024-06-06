package testcases.login;

import libraries.TestCase;
import libraries.WebDriverManager;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.homepage.CareFlashHomePage;
import pages.homepage.CareFlashTodayPage;

/**
 * The Class CareFlashLoginRememberMe.
 */
public class CareFlashLoginRememberMe extends TestCase
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
        homePage.clickRememberMe();
        CareFlashTodayPage todayPage = homePage.login("prod.careflash@gmail.com", "1234");
        Assert.assertEquals(todayPage.getElementTextByXPath("//p"), resources.getString("login.welcome"));

        WebDriver driver = WebDriverManager.getDriverInstance();
        Cookie cfAuthCookie = driver.manage().getCookieNamed("CFAuth");
        WebDriverManager.stopDriver();

        WebDriverManager.openBrowser();

        WebDriver driver2 = WebDriverManager.getDriverInstance();
        driver2.manage().addCookie(cfAuthCookie);

        driver2.navigate().refresh();

        todayPage = new CareFlashTodayPage();
        Assert.assertEquals(todayPage.getElementTextByXPath("//p"), resources.getString("login.welcome"));
    }

    /**
     * Test care flash login remember me.
     */
    @Test
    public void testCareFlashLoginRememberMe()
    {
        TestCase.quickRun(CareFlashLoginRememberMe.class, "");
    }

}
