package pages.partners;

import org.openqa.selenium.By;

import pages.Page;

public class CareFlashPartnerPage extends Page
{
        public CareFlashPartnerPage()
        {
            super();
            loadResources("resources/pages/partners/ContentsBundle");
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
