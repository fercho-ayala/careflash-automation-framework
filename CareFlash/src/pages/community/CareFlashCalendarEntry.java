package pages.community;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import pages.Page;

public class CareFlashCalendarEntry extends Page
{
    public CareFlashCalendarEntry()
    {
        super();
        //loadResources("resources/pages/community/ContentsBundle");
    }

    public void selectCategory(String string)
    {
        driver.findElement(By.id("14")).click();
    }

    public void setEventTitle(String title)
    {
        driver.findElement(By.id("eventTitle")).clear();
        driver.findElement(By.id("eventTitle")).sendKeys(title);
    }

    public void clickContinue()
    {
        driver.findElement(By.cssSelector("input.blue-btn")).click();
        //driver.findElement(By.xpath("(//input[@value='Continue'])[2]")).click();
    }

    public void setDate(String date)
    {
        //driver.findElement(By.id("idStartDate")).click();
        //driver.findElement(By.linkText("10")).click();
        driver.findElement(By.id("idStartDate")).sendKeys(date);
    }

    public void setStarTime(String hours, String minutes, String sufix)
    {
        new Select(driver.findElement(By.id("endHourTime"))).selectByVisibleText(hours);
        new Select(driver.findElement(By.id("endMinuteTime"))).selectByVisibleText(minutes);
        new Select(driver.findElement(By.id("startSufixTime"))).selectByVisibleText(sufix);
    }

    public void setHelpersNeeded(int number)
    {
        driver.findElement(By.id("friendHelpNum")).clear();
        driver.findElement(By.id("friendHelpNum")).sendKeys(Integer.toString(number));
    }

    public void clickNotifyFriend(String b)
    {
        driver.findElement(By.id("friendNotify")).click();
    }

    public void clickSubmitEvent(String string)
    {
        driver.findElement(By.id("submit_ihelp")).click();
    }

}
