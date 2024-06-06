package pages.community;

import pages.Page;

public class CareFlashHealthVideosPage extends Page
{
    public CareFlashHealthVideosPage()
    {
        super();
        super.loadResources("resources/pages/carecommunity/ContentsBundle");
    }
    public boolean verifyContent()
    {
        boolean isPresent = false;
        String heading = resources.getString("health.heading4");
        String paragraph1 = resources.getString("health.paragraph");
        isPresent = isTitlePresent(heading) && isParagraphPresent(paragraph1);
        return isPresent;
    }
}
