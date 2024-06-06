package testcases.community;

import libraries.TestCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.community.CareFlashCareCommunityPage;
import pages.community.CareFlashCommnunityPlace;
import pages.homepage.CareFlashHomePage;
import pages.homepage.CareFlashTodayPage;

public class CareFlashNewCareCommunityTest extends TestCase
{
    //private CareFlashHomePage homePage;
    private CareFlashCommnunityPlace communityPlace;
    private CareFlashTodayPage todayPage;
    private CareFlashCareCommunityPage communityPage;

    @BeforeClass
    public void setUp()
    {
        super.loadResources("resources/pages/carecommunity/ContentsBundle");
        CareFlashHomePage homePage = new CareFlashHomePage();
        homePage.homePage();
        todayPage = homePage.login("prodcareflash", "1234");
    }

    @Override
    public void doTest()
    {
    }

    @Test
    public void createCareCommunityTest()
    {
        communityPage = todayPage.clickNewCareCommunity();
        communityPage.setcommunitynamel("Jalasoft Team");
        communityPage.clickSomeOneElse();
        communityPage.setFirstName("Jalasoft");
        communityPage.setLastName("Team");
        communityPage.clickSettingsTab();
        communityPage.clickCreateCommunityButton();
        
        communityPlace = communityPage.clickSendInvitationButton();
        //TODO
        //Asserts
    }

    @Test(dependsOnMethods = { "createCareCommunityTest" })
    public void deleteCareCommunityTest()
    {
        communityPage = communityPlace.clickEditCommunity();
        todayPage = communityPage.clickDeleteCommunity();
        //TODO
        //Asserts
    }
}
