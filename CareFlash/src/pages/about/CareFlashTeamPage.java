package pages.about;

import org.openqa.selenium.By;

/**
 * The Class CareFlashTeamPage.
 */
public class CareFlashTeamPage extends AboutPage
{
    public CareFlashTeamPage()
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
