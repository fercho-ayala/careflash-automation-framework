package pages.search;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.Page;

public class CareFlashSearchPage extends Page
{
    public CareFlashSearchPage()
    {
        super();
        super.loadResources("resources/pages/search/ContentsBundle");
    }

    public boolean verifyContent()
    {
        boolean isPresent = false;
        String heading = resources.getString("search.heading4");
        String paragraph1 = resources.getString("search.paragraph");
        isPresent = isTitlePresent(heading) && isParagraphPresent(paragraph1);
        return isPresent;
    }

    public void clickCloseButton()
    {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("cboxClose")));
        element.click();
    }

    public void clickSearhButton()
    {
        driver.findElement(By.cssSelector("input.forumButton")).click();
    }
    
    public void setrequestsearch(String requestsearch)
    {
        driver.findElement(By.id("searchID")).clear();
        driver.findElement(By.id("searchID")).sendKeys(requestsearch);
    }

    public void clickLoginRequestLink()
    {
        driver.findElement(By.id("login_request_link")).click();
    }
}
