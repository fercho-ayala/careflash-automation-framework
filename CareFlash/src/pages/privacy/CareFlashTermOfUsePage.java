package pages.privacy;

import pages.Page;

/**
 * The Class CareFlashTermOfUsePage.
 */
public class CareFlashTermOfUsePage extends Page
{


    /**
     * Instantiates a new care flash term of use pages.
     */
    public CareFlashTermOfUsePage()
    {
        super();
    }

    /**
     * Click terms of use link.
     * 
     * @return the care flash term of use pages
     */
    public CareFlashTermOfUsePage clickTermsOfUseLink()
    {
        return super.getFooter().clickTermsOfUseLink();
    }
}
