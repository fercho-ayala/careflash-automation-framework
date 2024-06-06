package pages.about;

import org.openqa.selenium.By;

/**
 * The Class CareFlashAboutPage.
 */
public class CareFlashAboutPage extends AboutPage
{
    /**
     * Instantiates a new care flash about page.
     */
    public CareFlashAboutPage() 
    {
        super();
    }
    
    public String getHeading()
    {
        return getElementText(By.cssSelector("h2.center"));
    }
    
    public String getParagraph()
    {
        return getElementText(By.cssSelector("p"));
    }
}
