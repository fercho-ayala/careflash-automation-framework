package testcases.search;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.homepage.CareFlashHomePage;
import pages.search.CareFlashSearchPage;

public class CareFlashSearchTest extends TestCase
{
    private CareFlashHomePage homePage;
    private CareFlashSearchPage searchPage;
    
    @BeforeTest
    public void setUp()
    {
        super.loadResources("resources/pages/search/ContentsBundle");
        homePage = new CareFlashHomePage();
        homePage.homePage();
        searchPage = homePage.clickSearchLink();
    }

    @Override
    public void doTest()
    {

    }

    @Test
    public void testSearchContent()
    {
        Assert.assertEquals(searchPage.getElementTextByCss("td > h2"), resources.getString("search.2heading2"));
        Assert.assertEquals(searchPage.getElementTextByXPath("//td[3]/div/table/tbody/tr/td/div[2]"), resources.getString("search.notes"));
        Assert.assertEquals(searchPage.getElementTextById("searchOpts"), resources.getString("search.searchOpts"));
        Assert.assertEquals(searchPage.getElementTextByXPath("//span[2]"), resources.getString("search.span2"));
        Assert.assertEquals(searchPage.getElementTextByCss("h3"), resources.getString("search.heading3"));
        Assert.assertEquals(searchPage.getElementTextByXPath("//tr[3]/td/div/table/tbody/tr/td"), resources.getString("search.text1"));
        Assert.assertEquals(searchPage.getElementTextByXPath("//tr[5]/td/div/h3"), resources.getString("search.2heading3"));
        Assert.assertEquals(searchPage.getElementTextByXPath("//tr[5]/td/div/table/tbody/tr/td"), resources.getString("search.text2"));
        //LeftContent
        Assert.assertEquals(searchPage.getElementTextByCss("h2"), resources.getString("search.heading2"));
        Assert.assertEquals(searchPage.getElementTextByCss("span"), resources.getString("search.text"));
    }

    @Test(dependsOnMethods = { "testSearchContent" })
    public void testSearchLink()
    {
        searchPage.setrequestsearch("Trust");
        searchPage.clickSearhButton();
        Assert.assertEquals(searchPage.getElementTextById("login_request_link"), resources.getString("search.login_request_link"));
        searchPage.clickLoginRequestLink();
        //Assert.assertEquals(searchPage.getElementTextById("login_request_box"), resources.getString("search.login_request_box"));
        searchPage.clickCloseButton();
    }
}