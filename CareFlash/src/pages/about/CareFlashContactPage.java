package pages.about;

import org.openqa.selenium.By;

public class CareFlashContactPage extends AboutPage
{

    public CareFlashContactPage()
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