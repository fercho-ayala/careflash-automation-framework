package pages.privacy;


/**
 * The Class CareFlashPrivacyModeratorPolicePage.
 */
public class CareFlashPrivacyModeratorPolicePage extends Coorporate
{

    /**
     * Instantiates a new care flash privacy moderator police pages.
     */
    public CareFlashPrivacyModeratorPolicePage()
    {
        super();
    }

    /**
     * Click privacy link.
     * 
     * @return the care flash privacy pages
     */
    public CareFlashPrivacyPage clickPrivacyLink()
    {
        return super.getFooter().clickPrivacyLink();
    }

    /**
     * Click moderator police tab.
     * 
     * @return the care flash privacy moderator police pages
     */
    public CareFlashPrivacyModeratorPolicePage clickModeratorPoliceTab()
    {
        return super.getCoorporateTabs().clickModeratorPolicyTab();
    }
}