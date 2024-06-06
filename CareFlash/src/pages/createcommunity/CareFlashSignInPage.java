package pages.createcommunity;

import org.openqa.selenium.By;

import pages.Page;

/**
 * The Class CareFlashSignInPage.
 */
public class CareFlashSignInPage extends Page
{
    /**
     * Instantiates a new care flash contact pages.
     */
    public CareFlashSignInPage()
    {
        super();
        super.loadResources("resources/pages/createcommunity/ContentsBundle");
    }

    public String getHeading()
    {
        return getElementText(By.cssSelector("h2.center"));
    }
    public String getParagraph()
    {
        return getElementText(By.cssSelector("p"));
    }
    
    public boolean verifyContent()
    {
        boolean isPresent = false;
        //String imageMore = resources.getString("partner.img1.alt");
        String heading = resources.getString("signin.heading4");
        String paragraph1 = resources.getString("signin.paragraph1");
        isPresent = isTitlePresent(heading) && isParagraphPresent(paragraph1);
        return isPresent;
    }
}