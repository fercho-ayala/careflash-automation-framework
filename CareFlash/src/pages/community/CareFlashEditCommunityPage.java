package pages.community;

import static org.testng.AssertJUnit.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import pages.Page;

public class CareFlashEditCommunityPage extends Page
{
    private boolean acceptNextAlert = true;
    
        public CareFlashEditCommunityPage()
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

        public void clickDeleteCommunity()
        {
            driver.findElement(By.xpath("//input[@value='Delete this Community']")).click();
            assertTrue(closeAlertAndGetItsText().matches("^Permanently close this patient site and notify all members[\\s\\S]$"));
            assertTrue(closeAlertAndGetItsText().matches("^Are you absolutely sure you want to close this site[\\s\\S] This cannot be undone!$"));
        }

        private String closeAlertAndGetItsText() {
            try {
              Alert alert = driver.switchTo().alert();
              String alertText = alert.getText();
              if (acceptNextAlert) {
                alert.accept();
              } else {
                alert.dismiss();
              }
              return alertText;
            } finally {
              acceptNextAlert = true;
            }
          }
}
