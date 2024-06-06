package pages.usermessages;

import pages.Page;

public class CareFlashUserActivateAccountPage extends Page
{
    public CareFlashUserActivateAccountPage()
    {
        super();
        super.loadResources("resources/pages/useractivateaccount/ContentsBundle");
    }
    public boolean verifyContent()
    {
        boolean isPresent = false;
        String heading = resources.getString("activateaccount.heading4");
        String paragraph1 = resources.getString("activateaccount.paragraph");
        isPresent = isTitlePresent(heading) && isParagraphPresent(paragraph1);
        return isPresent;
    }
}
