package pages.privacy;


/**
 * The Class CareFlashPrivacyAlliancePolicePage.
 */
public class CareFlashPrivacyAlliancePolicePage extends Coorporate
{

    /**
     * Instantiates a new care flash privacy alliance police pages.
     */
    public CareFlashPrivacyAlliancePolicePage()
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
     * Click alliance police tab.
     * 
     * @param community
     *            the community
     * @return the care flash privacy alliance police pages
     */
    public CareFlashPrivacyAlliancePolicePage clickAlliancePoliceTab(String community)
    {
        return super.getCoorporateTabs().clickAlliancePolicyTab();
    }

}
