package pages.privacy;

import pages.Page;

/**
 * The Class Coorporate.
 */
public class Coorporate extends Page
{

    /** The coorporate tabs. */
    private CoorporateTabs coorporateTabs;

    /**
     * Instantiates a new coorporate.
     */
    public Coorporate()
    {
        super();
        coorporateTabs = new CoorporateTabs(driver);
    }

    /**
     * Gets the coorporate tabs.
     * 
     * @return the coorporate tabs
     */
    protected CoorporateTabs getCoorporateTabs()
    {
        return coorporateTabs;
    }
}
