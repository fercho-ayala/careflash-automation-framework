package pages.about;

import pages.Page;

public class AboutPage extends Page
{
    protected AboutSubNavBar subnavbar;

    public AboutPage() 
    {
        super();
        subnavbar = new AboutSubNavBar(super.driver, LANGUAGE);
    }
    
    /**
     * Click inspiration tab.
     * 
     * @return the care flash inspiration pages
     */
    public CareFlashAboutPage clickAboutTab()
    {
        return subnavbar.clickAboutTab();
    }

    /**
     * Click faqs tab.
     * 
     * @return the care flash fa qs pages
     */
    public CareFlashFAQsPage clickFAQsTab()
    {
        return subnavbar.clickFAQsTab();
    }

    /**
     * Click team tab.
     * 
     * @return the care flash team pages
     */
    public CareFlashTeamPage clickTeamTab()
    {
        return subnavbar.clickTeamTab();
    }

    /**
     * Click contact tab.
     * 
     * @return the care flash contact pages
     */
    public CareFlashContactPage clickContactUsTab()
    {
        return subnavbar.clickContactUsTab();
    }
}

