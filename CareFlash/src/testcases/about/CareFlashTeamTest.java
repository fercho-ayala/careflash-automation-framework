package testcases.about;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.about.CareFlashAboutPage;
import pages.about.CareFlashTeamPage;
import pages.homepage.CareFlashHomePage;
import libraries.TestCase;

public class CareFlashTeamTest extends TestCase
{
    private CareFlashHomePage homePage;
    private CareFlashAboutPage aboutPage;
    private CareFlashTeamPage teamPage;
    
    @BeforeClass
    public void setUp()
    {
        super.loadResources("resources/pages/about/ContentsBundle");
        homePage = new CareFlashHomePage();
        homePage.homePage();
        aboutPage = homePage.clickAbout();
        teamPage = aboutPage.clickTeamTab();
        System.out.println("SETUP: " + this.getClass().getName());
    }

    @Override
    public void doTest()
    {

    }
    
    @Test
    public void testAdvisoryBoard()
    {
        Assert.assertEquals(teamPage.getElementTextByXPath("//h3"), resources.getString("advisoryboard.heading"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//b"), resources.getString("advisoryboard.bold"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//p[2]"), resources.getString("advisoryboard.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//p[3]"), resources.getString("advisoryboard.paragraph3"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//h3[2]"), resources.getString("advisoryboard.heading2"));
    }
    
    @Test
    public void testJayDrayerAdvisoryBoard()
    {
        Assert.assertEquals("Jay Drayer", teamPage.getElementTextByLinkText("Jay Drayer"));
        Assert.assertEquals("http://www.linkedin.com/in/jaydrayer", teamPage.getAttributeByLinkText("Jay Drayer", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[2]/p"), resources.getString("jaydrayer.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//span"), resources.getString("jaydrayer.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[2]/p[2]"), resources.getString("jaydrayer.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("CareFlash."), resources.getString("jaydrayer.link1"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("CareFlash.", "HREF"), resources.getString("jaydrayer.hreflink1"));
    }
    
    @Test
    public void testSamiraBeckwithAdvisoryBoard()
    {
        Assert.assertEquals("Samira Beckwith", teamPage.getElementTextByLinkText("Samira Beckwith"));
        Assert.assertEquals("http://www.linkedin.com/pub/samira-beckwith/11/b29/753", teamPage.getAttributeByLinkText("Samira Beckwith", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[2]/div/div[2]/p"), resources.getString("samirabeckwith.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[2]/div/div[2]/ul/li/span"), resources.getString("samirabeckwith.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[2]/div/div[2]/p[2]"), resources.getString("samirabeckwith.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("Hope HealthCare Services"), resources.getString("samirabeckwith.link1"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("Hope HealthCare Services", "HREF"), resources.getString("samirabeckwith.hreflink1"));
    }
    
    @Test
    public void testColinBesterAdvisoryBoard()
    {
        Assert.assertEquals("Colin Bester", teamPage.getElementTextByLinkText("Colin Bester"));
        Assert.assertEquals("http://www.linkedin.com/in/colinbester", teamPage.getAttributeByLinkText("Colin Bester", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[3]/div/div[2]/p"), resources.getString("colinbester.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[3]/div/div[2]/ul/li/span"), resources.getString("colinbester.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[3]/div/div[2]/p[2]"), resources.getString("colinbester.paragraph2"));
    }
    
    @Test
    public void testBruceBlausenAdvisoryBoard()
    {
        Assert.assertEquals("Bruce Blausen", teamPage.getElementTextByLinkText("Bruce Blausen"));
        Assert.assertEquals("http://www.linkedin.com/pub/bruce-blausen/0/91/a42", teamPage.getAttributeByLinkText("Bruce Blausen", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[4]/div/div[2]/p"), resources.getString("bruceblausen.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[4]/div/div[2]/ul/li/span"), resources.getString("bruceblausen.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[4]/div/div[2]/p[2]"), resources.getString("bruceblausen.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("Blausen Medical Communications"), resources.getString("bruceblausen.link1"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("Blausen Medical Communications", "HREF"), resources.getString("bruceblausen.hreflink1"));
    }
    
    @Test
    public void testJudyBrizendineAdvisoryBoard()
    {
        Assert.assertEquals("Judy Brizendine", teamPage.getElementTextByLinkText("Judy Brizendine"));
        Assert.assertEquals("https://www.linkedin.com/in/judylbrizendine", teamPage.getAttributeByLinkText("Judy Brizendine", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[5]/div/div[2]/p"), resources.getString("judybrizendine.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[5]/div/div[2]/ul/li/span"), resources.getString("judybrizendine.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[5]/div/div[2]/p[2]"), resources.getString("judybrizendine.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("Stunned by Grief."), resources.getString("judybrizendine.link1"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("Stunned by Grief.", "HREF"), resources.getString("judybrizendine.hreflink1"));
    }
    
    @Test
    public void testDavidLaneBrownAdvisoryBoard()
    {
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[6]/h2"), resources.getString("dlbrown.name"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[6]/div/div[2]/p"), resources.getString("dlbrown.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[6]/div/div[2]/ul/li/span"), resources.getString("dlbrown.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[6]/div/div[2]/p[2]"), resources.getString("dlbrown.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[2]/p[3]"), resources.getString("dlbrown.paragraph3"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//p[4]"), resources.getString("dlbrown.paragraph4"));
    }
    
    @Test
    public void testElaineShoreDorrAdvisoryBoard()
    {
        Assert.assertEquals("Elaine Shore Dorr", teamPage.getElementTextByLinkText("Elaine Shore Dorr"));
        Assert.assertEquals("http://www.linkedin.com/pub/elaine-shore-dorr/7/4b7/734", teamPage.getAttributeByLinkText("Elaine Shore Dorr", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[7]/div/div[2]/p"), resources.getString("esdorr.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[7]/div/div[2]/ul/li/span"), resources.getString("esdorr.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[7]/div/div[2]/p[2]"), resources.getString("esdorr.paragraph2"));
    }
    
    @Test
    public void testCaroleFisherAdvisoryBoard()
    {
        Assert.assertEquals("Carole Fisher", teamPage.getElementTextByLinkText("Carole Fisher"));
        Assert.assertEquals("http://www.linkedin.com/in/carolefisher", teamPage.getAttributeByLinkText("Carole Fisher", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[8]/div/div[2]/p"), resources.getString("carolefisher.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[8]/div/div[2]/ul/li/span"), resources.getString("carolefisher.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[8]/div/div[2]/p[2]"), resources.getString("carolefisher.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("Nathan Adelson Hospice"), resources.getString("carolefisher.link1"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("Nathan Adelson Hospice", "HREF"), resources.getString("carolefisher.hreflink1"));
    }

    @Test
    public void tesGregGrabowskitAdvisoryBoard()
    {
        Assert.assertEquals("Greg Grabowski", teamPage.getElementTextByLinkText("Greg Grabowski"));
        Assert.assertEquals("http://www.linkedin.com/pub/greg-grabowski/7/678/598", teamPage.getAttributeByLinkText("Greg Grabowski", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[9]/div/div[2]/p"), resources.getString("ggrabowski.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[9]/div/div[2]/ul/li/span"), resources.getString("ggrabowski.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[9]/div/div[2]/p[2]"), resources.getString("ggrabowski.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("Seasons Hospice Foundation."), resources.getString("ggrabowski.link1"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("Seasons Hospice Foundation.", "HREF"), resources.getString("ggrabowski.hreflink1"));
    }
    
    @Test
    public void testRalphHassonAdvisoryBoard()
    {
        Assert.assertEquals("Ralph Hasson", teamPage.getElementTextByLinkText("Ralph Hasson"));
        Assert.assertEquals("http://www.linkedin.com/pub/ralph-hasson/3/624/494", teamPage.getAttributeByLinkText("Ralph Hasson", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[10]/div/div[2]/p"), resources.getString("ralphhasson.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[10]/div/div[2]/ul/li/span"), resources.getString("ralphhasson.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[10]/div/div[2]/p[2]"), resources.getString("ralphhasson.paragraph2"));
    }
    
    @Test
    public void testPattiHillAdvisoryBoard()
    {
        Assert.assertEquals("Patti Hill", teamPage.getElementTextByLinkText("Patti Hill"));
        Assert.assertEquals("http://www.linkedin.com/in/pattidhill", teamPage.getAttributeByLinkText("Patti Hill", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[11]/div/div[2]/p"), resources.getString("pattihill.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[11]/div/div[2]/ul/li/span"), resources.getString("pattihill.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[11]/div/div[2]/p[2]"), resources.getString("pattihill.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("Penman PR"), resources.getString("pattihill.link1"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("Penman PR", "HREF"), resources.getString("pattihill.hreflink1"));
    }
    
    @Test
    public void testJohnParkerAdvisoryBoard()
    {
        Assert.assertEquals("John Parker", teamPage.getElementTextByLinkText("John Parker"));
        Assert.assertEquals("http://www.linkedin.com/pub/john-parker/0/2b1/79b", teamPage.getAttributeByLinkText("John Parker", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[12]/div/div[2]/p"), resources.getString("johnparker.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[12]/div/div[2]/ul/li/span"), resources.getString("johnparker.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[12]/div/div[2]/p[2]"), resources.getString("johnparker.paragraph2"));
    }
    
    @Test
    public void testRichardScruggsAdvisoryBoard()
    {
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[13]/h2"), resources.getString("richardscruggs.name"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[13]/div/div[2]/p"), resources.getString("richardscruggs.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[13]/div/div[2]/ul/li/span"), resources.getString("richardscruggs.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[13]/div/div[2]/p[2]"), resources.getString("richardscruggs.paragraph2"));
    }
    
    @Test
    public void testJanSmithAdvisoryBoard()
    {
        Assert.assertEquals("Jan Smith", teamPage.getElementTextByLinkText("Jan Smith"));
        Assert.assertEquals("http://www.linkedin.com/pub/jan-smith-cfsp/19/26b/313", teamPage.getAttributeByLinkText("Jan Smith", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[14]/div/div[2]/p"), resources.getString("jansmith.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[14]/div/div[2]/ul/li/span"), resources.getString("jansmith.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[14]/div/div[2]/p[2]"), resources.getString("jansmith.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("Flanner and Buchanan Funeral Centers"), resources.getString("jansmith.link1"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("Flanner and Buchanan Funeral Centers", "HREF"), resources.getString("jansmith.hreflink1"));
    }
    
    @Test
    public void testAutumnSpenceAdvisoryBoard()
    {
        Assert.assertEquals("Autumn Spence", teamPage.getElementTextByLinkText("Autumn Spence"));
        Assert.assertEquals("http://www.linkedin.com/in/autumnspence", teamPage.getAttributeByLinkText("Autumn Spence", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[15]/div/div[2]/p"), resources.getString("autumnapence.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[15]/div/div[2]/ul/li/span"), resources.getString("autumnapence.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[15]/div/div[2]/p[2]"), resources.getString("autumnapence.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("Hospice Pharmacy Solutions"), resources.getString("autumnapence.link1"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("Hospice Pharmacy Solutions", "HREF"), resources.getString("autumnapence.hreflink1"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("Outcome Resources"), resources.getString("autumnapence.link2"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("Outcome Resources", "HREF"), resources.getString("autumnapence.hreflink2"));
    }
    
    @Test
    public void testCarlosTiradoAdvisoryBoard()
    {
        Assert.assertEquals("Carlos Tirado, M.D., M.P.H., F.A.S.A.M.", teamPage.getElementTextByLinkText("Carlos Tirado, M.D., M.P.H., F.A.S.A.M."));
        Assert.assertEquals("http://www.linkedin.com/pub/tirado-carlos/4/642/b52", teamPage.getAttributeByLinkText("Carlos Tirado, M.D., M.P.H., F.A.S.A.M.", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[16]/div/div[2]/p"), resources.getString("carlostirado.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[16]/div/div[2]/ul/li/span"), resources.getString("carlostirado.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[16]/div/div[2]/p[2]"), resources.getString("carlostirado.paragraph2"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("The Right Step Hill Country"), resources.getString("carlostirado.link1"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("The Right Step Hill Country", "HREF"), resources.getString("carlostirado.hreflink1"));
        Assert.assertEquals(teamPage.getElementTextByLinkText("Sims Foundation"), resources.getString("carlostirado.link2"));
        Assert.assertEquals(teamPage.getAttributeByLinkText("Sims Foundation", "HREF"), resources.getString("carlostirado.hreflink2"));
    }
    
    
    @Test
    public void testChrisWasdenAdvisoryBoard()
    {
        Assert.assertEquals("Chris Wasden", teamPage.getElementTextByLinkText("Chris Wasden"));
        Assert.assertEquals("http://www.linkedin.com/in/chriswasden", teamPage.getAttributeByLinkText("Chris Wasden", "HREF"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[17]/div/div[2]/p"), resources.getString("chriswasden.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[17]/div/div[2]/ul/li/span"), resources.getString("chriswasden.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[17]/div/div[2]/p[2]"), resources.getString("chriswasden.paragraph2"));
    }
    
    @Test
    public void testDanWilfordAdvisoryBoard()
    {
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[18]/h2"), resources.getString("danwilford.name"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[18]/div/div[2]/p"), resources.getString("danwilford.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[18]/div/div[2]/ul/li/span"), resources.getString("danwilford.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[18]/div/div[2]/p[2]"), resources.getString("danwilford.paragraph2"));
    }
    
    @Test
    public void testDavidWoodAdvisoryBoard()
    {
        Assert.assertEquals("David Wood", teamPage.getElementTextByLinkText("David Wood"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[19]/div/div[2]/p"), resources.getString("davidwood.paragraph"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[19]/div/div[2]/ul/li/span"), resources.getString("davidwood.question"));
        Assert.assertEquals(teamPage.getElementTextByXPath("//div[19]/div/div[2]/p[2]"), resources.getString("davidwood.paragraph2"));
    }
}
