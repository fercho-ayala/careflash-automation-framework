package pages.about;

import org.openqa.selenium.By;

/**
 * The Class CareFlashFAQsPage.
 */
public class CareFlashFAQsPage extends AboutPage
{
    /**
     * Instantiates a new care flash fa qs pages.
     */
    public CareFlashFAQsPage()
    {
        super();
    }

    public String getHeading(String name)
    {
        return getElementText(By.cssSelector(name));
    }
    
    public String getParagraph(String name)
    {
        return getElementText(By.cssSelector(name));
    }
}
