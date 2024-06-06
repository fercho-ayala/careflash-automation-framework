package pages.community;

import org.openqa.selenium.By;

import pages.Page;

public class CareFlashMyAccountPage extends Page
{
        public CareFlashMyAccountPage()
        {
            super();
            loadResources("resources/pages/carecommunity/ContentsBundle");
            verifyContentPresent();
        }

        public boolean verifyContentPresent()
        {
            boolean isPresent = false;
            String imageLearnMore = resources.getString("partner.img1.alt");
            String imageCreateCoomunity= resources.getString("partner.img2.alt");
                        
            isPresent = isElementPresent(By.cssSelector("em")) && 
            isElementPresent(By.cssSelector("img[alt=\"" + imageLearnMore + "\"]")) &&
            isElementPresent(By.cssSelector("img[alt=\"" + imageCreateCoomunity + "\"]"));
            return isPresent;
        }

        public String getImageTitle(String title)
        {
            return getElementTextByCss("img[alt=\""+title+"\"]");
        }
}
