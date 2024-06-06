package pages.homepage;

import pages.Page;

public class CareFlashSocialMarketingPage extends Page
{
    public CareFlashSocialMarketingPage()
    {
        super();
        super.loadResources("resources/pages/createcommunity/ContentsBundle");
    }
    
    public boolean verifyContent()
    {
        boolean isPresent = false;
        String heading = resources.getString("marketing.heading4");
        String paragraph1 = resources.getString("marketing.paragraph");
        isPresent = isTitlePresent(heading) && isParagraphPresent(paragraph1);
        return isPresent;
    }
}
