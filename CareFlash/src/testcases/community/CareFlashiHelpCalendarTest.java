package testcases.community;

import libraries.TestCase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.community.CareFlashCalendarEntry;
import pages.community.CareFlashCommnunityPlace;
import pages.community.CareFlashiHelpCalendarPage;
import pages.homepage.CareFlashHomePage;
import pages.homepage.CareFlashTodayPage;

public class CareFlashiHelpCalendarTest extends TestCase
{
    private CareFlashHomePage homePage;
    private CareFlashTodayPage todayPage;
    private CareFlashCommnunityPlace comunityPlacePage;
    private CareFlashiHelpCalendarPage calendarPage;

    @BeforeTest
    public void setUp()
    {
        //super.loadResources("resources/pages/carecommunity/ContentsBundle");
        homePage = new CareFlashHomePage();
        homePage.homePage();
        todayPage = homePage.login("prodcareflash", "1234");
        //Assert.assertEquals(todayPage.getElementTextByXPath("//p"), resources.getString("login.welcome"));
        comunityPlacePage = todayPage.placeLink("Calendar");
        calendarPage = comunityPlacePage.clickiHelpCalendar();
    }

    @Override
    public void doTest()
    {

    }

    @Test
    public void newRequestEventTest()
    {
        CareFlashCalendarEntry calendarEntry = calendarPage.clickNewRequest();
        calendarEntry.selectCategory("Social");
        calendarEntry.setEventTitle("Bowling Training");
        calendarEntry.clickContinue();
        calendarEntry.setDate("09/07/2014");
        calendarEntry.setStarTime("12","00","PM");
        calendarEntry.setStarTime("12","30","PM");
        calendarEntry.clickContinue();
        calendarEntry.setHelpersNeeded(5);
        calendarEntry.clickNotifyFriend("Yes");
        calendarEntry.clickSubmitEvent("Yes");

        /*
        assertEquals("Go School", driver.findElement(By.id("cal_event_tt3797_8")).getText());
        assertEquals("Go School", driver.findElement(By.linkText("Go School")).getText());
        assertEquals("September 08, 2014", driver.findElement(By.xpath("//div[2]/div[2]/div[2]/div[3]")).getText());
        assertEquals("11:00 - 11:30 pm", driver.findElement(By.xpath("//div[2]/div[2]/div[2]/div[4]")).getText());
        assertEquals("Mon, 09/08", driver.findElement(By.xpath("(//a[contains(text(),'Mon, 09/08')])[2]")).getText());
        assertEquals("5", driver.findElement(By.xpath("//div[2]/div[2]/div[3]/div/div[2]")).getText());
        */
    }
}
