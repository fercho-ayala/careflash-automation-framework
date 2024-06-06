package testcases.partners;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.homepage.CareFlashHomePage;
import pages.partners.CareFlashAlliancesPage;
import pages.partners.CareFlashPartnerPage;

public class CareFlashPartnersTest extends TestCase
{
    private CareFlashHomePage homePage;
    private CareFlashAlliancesPage alliancesPage;

    @BeforeTest
    public void setUp()
    {
        super.loadResources("resources/pages/partners/ContentsBundle");
        homePage = new CareFlashHomePage();
        homePage.homePage();
        alliancesPage = homePage.clickPartners();
    }

    @Override
    public void doTest()
    {

    }

    @Test
    public void testParnerAbcHospice()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("abcHospice");
        // Assert.assertEquals(partnerPage.getElementTextByCss("img[alt=\"ABC Hospice and Eldercare\"]"),resources.getString("abcHospice.img.title"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Learn about us"),
                resources.getString("abcHospice.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Get involved with us"),
                resources.getString("abcHospice.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Give and help us do more"),
                resources.getString("abcHospice.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.care2.com"),
                resources.getString("abcHospice.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("abcHospice.heading3"));
    }

    @Test
    public void testAgeinplace()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("ageinplace");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Aging at Home"),
                resources.getString("ageinplace.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Aging in Place Basics"),
                resources.getString("ageinplace.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Caregiving"), resources.getString("ageinplace.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://ageinplace.com/"),
                resources.getString("ageinplace.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("ageinplace.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("ageinplace.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("ageinplace.paragraph2"));
    }

    public void testAgrace()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("agrace");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Agrace HospiceCare"),
                resources.getString("agrace.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Palliative Care"),
                resources.getString("agrace.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Agrace\u2019s Educational Institute"), resources.getString("agrace.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://ageinplace.com/"),
                resources.getString("ageinplace.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("agrace.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("agrace.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("agrace.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"), resources.getString("agrace.paragraph3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("agrace.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[4]/a"), resources.getString("agrace.link4"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[5]/a"), resources.getString("agrace.link5"));
    }

    @Test
    public void testAmericanMedicalRiskCompany()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("amrinco");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("About us"), resources.getString("amrinco.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Partners"), resources.getString("amrinco.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Contact us"), resources.getString("amrinco.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.amrinco.com/"),
                resources.getString("amrinco.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("amrinco.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("amrinco.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("amrinco.paragraph2"));
    }

    @Test
    public void testAnyLength()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("anylength");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Daily life"), resources.getString("anylength.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Take a tour"), resources.getString("anylength.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Connect with us"), resources.getString("anylength.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://anylength.net/"),
                resources.getString("anylength.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("anylength.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h2"), resources.getString("anylength.heading2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("anylength.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("anylength.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"), resources.getString("anylength.paragraph3"));
    }

    @Test
    public void testAustinRecovery()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("austinrecovery");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Family Experience"),
                resources.getString("austinrecovery.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Family Education"),
                resources.getString("austinrecovery.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Recovery Resources"),
                resources.getString("austinrecovery.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.austinrecovery.org"),
                resources.getString("austinrecovery.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("austinrecovery.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("austinrecovery.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"),
                resources.getString("austinrecovery.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"),
                resources.getString("austinrecovery.paragraph2"));
    }

    @Test
    public void testCamelotBrookside()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("camelotbrookside");
        Assert.assertEquals(
                partnerPage.getElementTextByLinkText("http://www.centralcontrolmgmt.com/camelot-brookside.html"),
                resources.getString("camelotbrookside.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("camelotbrookside.heading3"));
        alliancesPage.switchToAlliancesPage();
    }

    @Test
    public void testChapelofChimesHayward()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("chapelofthechimeshayward");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("We are here to help"),
                resources.getString("chapelofthechimeshayward.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Our locations"),
                resources.getString("chapelofthechimeshayward.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Contact us"),
                resources.getString("chapelofthechimeshayward.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://hayward.chapelofthechimes.com/"),
                resources.getString("chapelofthechimeshayward.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"),
                resources.getString("chapelofthechimeshayward.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"),
                resources.getString("chapelofthechimeshayward.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"),
                resources.getString("chapelofthechimeshayward.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"),
                resources.getString("chapelofthechimeshayward.paragraph3"));
        alliancesPage.switchToAlliancesPage();
    }

    @Test
    public void testChapelofChimesOackland()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("chapelofthechimesoakland");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("We are here to help"),
                resources.getString("chapelofthechimesoakland.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Our locations"),
                resources.getString("chapelofthechimesoakland.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Contact us"),
                resources.getString("chapelofthechimesoakland.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://oakland.chapelofthechimes.com/"),
                resources.getString("chapelofthechimesoakland.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"),
                resources.getString("chapelofthechimesoakland.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"),
                resources.getString("chapelofthechimesoakland.paragraph"));
    }

    @Test
    public void testCommunityHospiceofTexas()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("chot");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("The earlier you call, the more we can help"),
                resources.getString("chot.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("See the areas we serve"),
                resources.getString("chot.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("We would be honored to receive your contribution"),
                resources.getString("chot.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.chot.org/"),
                resources.getString("chot.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("chot.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("chot.paragraph"));
    }

    @Test
    public void testDostalBokasFuneralServices()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("dostalfuneralservices");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("About us"),
                resources.getString("dostalfuneralservices.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Our locations"),
                resources.getString("dostalfuneralservices.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Contact us"),
                resources.getString("dostalfuneralservices.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.dostalfuneralservices.com/"),
                resources.getString("dostalfuneralservices.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"),
                resources.getString("dostalfuneralservices.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"),
                resources.getString("dostalfuneralservices.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"),
                resources.getString("dostalfuneralservices.paragraph2"));
    }

    @Test
    public void testFloralHaven()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("floralhaven");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("We are here to help"),
                resources.getString("floralhaven.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Our locations"),
                resources.getString("floralhaven.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Contact us"),
                resources.getString("floralhaven.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.floralhaven.com/"),
                resources.getString("floralhaven.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("floralhaven.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("floralhaven.paragraph"));
    }

    @Test
    public void testGeoHLewisSons()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("geohlewis");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("About us"), resources.getString("geohlewis.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Family support"),
                resources.getString("geohlewis.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("We value our community"),
                resources.getString("geohlewis.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.geohlewis.com"),
                resources.getString("geohlewis.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("geohlewis.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("geohlewis.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("geohlewis.paragraph2"));
    }

    @Test
    public void testHalcyonHospice()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("halcyonhospice");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("What is hospice?"),
                resources.getString("halcyonhospice.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Who is Halcyon?"),
                resources.getString("halcyonhospice.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Timely, compassionate care"),
                resources.getString("halcyonhospice.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.excellenceinhospice.com"),
                resources.getString("halcyonhospice.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("halcyonhospice.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"),
                resources.getString("halcyonhospice.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"),
                resources.getString("halcyonhospice.paragraph2"));
    }

    @Test
    public void testHandtoHold()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("handToHold");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Learn more about us"),
                resources.getString("handToHold.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Volunteer and get involved"),
                resources.getString("handToHold.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Your donation helps us do more"),
                resources.getString("handToHold.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://handtohold.org"),
                resources.getString("handToHold.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("handToHold.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("handToHold.paragraph"));
    }

    @Test
    public void testHealthSaaS()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("HSaaS");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Learn more about us"),
                resources.getString("HSaaS.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Contact us"), resources.getString("HSaaS.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.healthsaas.net"),
                resources.getString("HSaaS.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("HSaaS.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("HSaaS.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("HSaaS.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"), resources.getString("HSaaS.paragraph3"));
    }

    @Test
    public void testHopeHealthCareServices()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("hopehcs");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Ways we help"), resources.getString("hopehcs.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("We would like to get to know you"),
                resources.getString("hopehcs.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Service areas"), resources.getString("hopehcs.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://hopehcs.org/"),
                resources.getString("hopehcs.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("hopehcs.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h1"), resources.getString("hopehcs.heading1"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("hopehcs.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("hopehcs.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"), resources.getString("hopehcs.paragraph3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[4]"), resources.getString("hopehcs.paragraph4"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//table[2]/tbody/tr/td/div/a"),
                resources.getString("hopehcs.link4"));
    }

    @Test
    public void testHopeWest()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("hopewest");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("How HopeWest helps"),
                resources.getString("hopewest.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("We're an important part of the community"),
                resources.getString("hopewest.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Please get to know us"),
                resources.getString("hopewest.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.hopewestco.org/"),
                resources.getString("hopewest.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("hopewest.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h2"), resources.getString("hopewest.heading2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li"),
                resources.getString("hopewest.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li[2]"),
                resources.getString("hopewest.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li[3]"),
                resources.getString("hopewest.paragraph3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p/a"), resources.getString("hopewest.link4"));
    }

    @Test
    public void testHospiceAdvantage()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("hospiceadvantage");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("How we help families"),
                resources.getString("hospiceadvantage.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Donate to our Hospice Services Foundation"),
                resources.getString("hospiceadvantage.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Real Stories from families"),
                resources.getString("hospiceadvantage.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.hospiceadvantage.net/"),
                resources.getString("hospiceadvantage.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("hospiceadvantage.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/h3"),
                resources.getString("hospiceadvantage.div.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"),
                resources.getString("hospiceadvantage.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"),
                resources.getString("hospiceadvantage.paragraph2"));
    }

    @Test
    public void testHospiceBrazosValley()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("hospicebrazosvalley");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("What is Hospice Care"),
                resources.getString("hospicebrazosvalley.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Our mission"),
                resources.getString("hospicebrazosvalley.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Areas we serve"),
                resources.getString("hospicebrazosvalley.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.hospicebrazosvalley.org"),
                resources.getString("hospicebrazosvalley.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("hospicebrazosvalley.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"),
                resources.getString("hospicebrazosvalley.paragraph"));
    }

    @Test
    public void testHospiceofChattanooga()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("hospiceofchattanooga");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("What we do"),
                resources.getString("hospiceofchattanooga.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("We're always helping"),
                resources.getString("hospiceofchattanooga.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Connect with us"),
                resources.getString("hospiceofchattanooga.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.hospiceofchattanooga.org"),
                resources.getString("hospiceofchattanooga.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("hospiceofchattanooga.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"),
                resources.getString("hospiceofchattanooga.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"),
                resources.getString("hospiceofchattanooga.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"),
                resources.getString("hospiceofchattanooga.paragraph3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[4]"),
                resources.getString("hospiceofchattanooga.paragraph4"));
    }

    @Test
    public void testHoustonHospice()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("houstonhospice");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Get involved with us"),
                resources.getString("houstonhospice.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Patient and family services"),
                resources.getString("houstonhospice.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Your contribution is vital to us"),
                resources.getString("houstonhospice.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.houstonhospice.org"),
                resources.getString("houstonhospice.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("houstonhospice.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"),
                resources.getString("houstonhospice.paragraph"));
    }

    @Test
    public void testJewishFamilyService()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("JewishFamilyService");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Learn more about us"),
                resources.getString("JewishFamilyService.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Volunteer Opportunities"),
                resources.getString("JewishFamilyService.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Contact us"),
                resources.getString("JewishFamilyService.link3"));
        Assert.assertEquals(
                partnerPage.getElementTextByLinkText("http://www.jfshouston.org/jewishchaplaincyprogram.php"),
                resources.getString("JewishFamilyService.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("JewishFamilyService.heading3"));
        // Assert.assertEquals(partnerPage.getElementTextByXPath("//table[2]/tbody/tr/td/div"),resources.getString("JewishFamilyService.paragraph0"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"),
                resources.getString("JewishFamilyService.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"),
                resources.getString("JewishFamilyService.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"),
                resources.getString("JewishFamilyService.paragraph3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[4]"),
                resources.getString("JewishFamilyService.paragraph4"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[5]"),
                resources.getString("JewishFamilyService.paragraph5"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[6]"),
                resources.getString("JewishFamilyService.paragraph6"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[7]"),
                resources.getString("JewishFamilyService.paragraph7"));
    }

    @Test
    public void testLHCGroup()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("lhcgroup");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("For patients and families"),
                resources.getString("lhcgroup.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("About LHC Group"),
                resources.getString("lhcgroup.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Contact us"), resources.getString("lhcgroup.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://lhcgroup.com/"),
                resources.getString("lhcgroup.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("lhcgroup.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"), resources.getString("lhcgroup.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("lhcgroup.paragraph2"));
    }

    @Test
    public void testNathanAdelsonHospice()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("adelson");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("How to start services"),
                resources.getString("adelson.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Center for Compassionate Care"),
                resources.getString("adelson.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Get involved with us"),
                resources.getString("adelson.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.nah.org/"),
                resources.getString("adelson.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("adelson.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("adelson.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("adelson.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"), resources.getString("adelson.paragraph3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//h1"), resources.getString("adelson.1heading1"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//i"), resources.getString("adelson.subparagraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//i[2]"), resources.getString("adelson.subparagraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//i[3]"), resources.getString("adelson.subparagraph3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li/a"),
                resources.getString("adelson.subparagraph4"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[2]/h1"), resources.getString("adelson.2heading1"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[2]/i"),
                resources.getString("adelson.subparagraph5"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[2]/i[2]"),
                resources.getString("adelson.subparagraph6"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[2]/i[3]"),
                resources.getString("adelson.subparagraph7"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li[2]/a"),
                resources.getString("adelson.subparagraph8"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[3]/h1"), resources.getString("adelson.3heading1"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[3]/i"),
                resources.getString("adelson.subparagraph9"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[3]/i[2]"),
                resources.getString("adelson.subparagraph10"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[3]/i[3]"),
                resources.getString("adelson.subparagraph11"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li[3]/a"),
                resources.getString("adelson.subparagraph12"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[4]/h1"), resources.getString("adelson.4heading1"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[4]/i"),
                resources.getString("adelson.subparagraph13"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[4]/i[2]"),
                resources.getString("adelson.subparagraph14"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//li[4]/i[3]"),
                resources.getString("adelson.subparagraph15"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li[4]/a"),
                resources.getString("adelson.subparagraph16"));
    }

    @Test
    public void testNxStage()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("nxstage");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("When people feel better, they live better"),
                resources.getString("nxstage.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Hemodialysis in the comfort of your home"),
                resources.getString("nxstage.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("People like you do home hemodialysis"),
                resources.getString("nxstage.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.nxstage.com/"),
                resources.getString("nxstage.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("nxstage.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h1"), resources.getString("nxstage.heading1"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//b"), resources.getString("nxstage.bold"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"), resources.getString("nxstage.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("nxstage.paragraph2"));
    }

    @Test
    public void testPhysicianSpring()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("physicianspring");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Who we are"),
                resources.getString("physicianspring.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("What we do"),
                resources.getString("physicianspring.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Speak with us"),
                resources.getString("physicianspring.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.physicianspring.com/"),
                resources.getString("physicianspring.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("physicianspring.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"),
                resources.getString("physicianspring.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li"),
                resources.getString("physicianspring.line"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li[2]"),
                resources.getString("physicianspring.line2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li[3]"),
                resources.getString("physicianspring.line3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"),
                resources.getString("physicianspring.paragraph2"));
    }

    @Test
    public void testPlaynormous()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("Playnormous");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Learn more about us"),
                resources.getString("Playnormous.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Contact us"),
                resources.getString("Playnormous.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.playnormous.com/"),
                resources.getString("Playnormous.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("Playnormous.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"),
                resources.getString("Playnormous.paragraph"));
    }

    @Test
    public void testProvidenceHospice()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("providencehospice");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("The earlier you call, the more we can help"),
                resources.getString("providencehospice.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("See the areas we serve"),
                resources.getString("providencehospice.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("We would be honored to receive your contribution"),
                resources.getString("providencehospice.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.providencehospice.org/"),
                resources.getString("providencehospice.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("providencehospice.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"),
                resources.getString("providencehospice.paragraph"));
    }

    @Test
    public void testRJGarcia()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("rjgcounseling");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("How we help"),
                resources.getString("rjgcounseling.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("The essence of therapy"),
                resources.getString("rjgcounseling.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("When is it time?"),
                resources.getString("rjgcounseling.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://rjgcounseling.com/"),
                resources.getString("rjgcounseling.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("rjgcounseling.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"),
                resources.getString("rjgcounseling.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"),
                resources.getString("rjgcounseling.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"),
                resources.getString("rjgcounseling.paragraph3"));
    }

    @Test
    public void testRonaldMcDonald()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("RMHCaustin");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("See how we help"),
                resources.getString("RMHCaustin.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Get involved"),
                resources.getString("RMHCaustin.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Give and help us do more"),
                resources.getString("RMHCaustin.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.rmhc-austin.org/"),
                resources.getString("RMHCaustin.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("RMHCaustin.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"),
                resources.getString("RMHCaustin.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("RMHCaustin.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"), resources.getString("RMHCaustin.paragraph3"));
    }

    @Test
    public void testSeasonsHospice()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("seasonshospice");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Ways that we help"),
                resources.getString("seasonshospice.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Memorials"),
                resources.getString("seasonshospice.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Give and help us do more"),
                resources.getString("seasonshospice.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.seasonsfoundation.org/"),
                resources.getString("seasonshospice.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("seasonshospice.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/h3"),
                resources.getString("seasonshospice.divheading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"),
                resources.getString("seasonshospice.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"),
                resources.getString("seasonshospice.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"),
                resources.getString("seasonshospice.paragraph3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[4]"),
                resources.getString("seasonshospice.paragraph4"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[5]"),
                resources.getString("seasonshospice.paragraph5"));
    }

    @Test
    public void testSeasonBapttistChurch()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("SecondBaptistChurch");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Plan my visit"),
                resources.getString("SecondBaptistChurch.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Featured events"),
                resources.getString("SecondBaptistChurch.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Give to Second"),
                resources.getString("SecondBaptistChurch.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.second.org"),
                resources.getString("SecondBaptistChurch.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("SecondBaptistChurch.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"),
                resources.getString("SecondBaptistChurch.paragraph"));
    }

    @Test
    public void testSIMSFoundation()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("sims");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Get help"), resources.getString("sims.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Give help"), resources.getString("sims.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Give and help us do more"),
                resources.getString("sims.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.simsfoundation.org/"),
                resources.getString("sims.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("sims.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//h2"), resources.getString("sims.1heading2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"), resources.getString("sims.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//h2[2]"), resources.getString("sims.2heading2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("sims.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//h2[3]"), resources.getString("sims.3heading2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"), resources.getString("sims.paragraph3"));
    }

    @Test
    public void testSoberSafeguard()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("sobersafeguard");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("What we do is important"),
                resources.getString("sobersafeguard.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("How we help"),
                resources.getString("sobersafeguard.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Let us help"),
                resources.getString("sobersafeguard.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.sobersafeguard.com"),
                resources.getString("sobersafeguard.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("sobersafeguard.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//h1"), resources.getString("sobersafeguard.1heading1"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"),
                resources.getString("sobersafeguard.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//h1[2]"),
                resources.getString("sobersafeguard.2heading1"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"),
                resources.getString("sobersafeguard.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//h1[3]"),
                resources.getString("sobersafeguard.3heading1"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"),
                resources.getString("sobersafeguard.paragraph3"));

    }

    @Test
    public void testSprintHill()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("springhill");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("We are here to help"),
                resources.getString("springhill.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Where we are"),
                resources.getString("springhill.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Reach out to us"), resources.getString("springhill.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.springhillfh.com/"),
                resources.getString("springhill.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("springhill.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//div/p"), resources.getString("springhill.paragraph"));
    }

    @Test
    public void testSoberaustin()
    {
        alliancesPage.switchToAlliancesPage();
        CareFlashPartnerPage partnerPage = alliancesPage.clickPartnerLink("soberaustin");
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Addiction"), resources.getString("soberaustin.link1"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Recovery"), resources.getString("soberaustin.link2"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("Resources"), resources.getString("soberaustin.link3"));
        Assert.assertEquals(partnerPage.getElementTextByLinkText("http://www.soberaustin.com"),
                resources.getString("soberaustin.link"));
        Assert.assertEquals(partnerPage.getElementTextByCss("h3"), resources.getString("soberaustin.heading3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/p"),
                resources.getString("soberaustin.paragraph"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li"),
                resources.getString("soberaustin.paragraph2"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li[2]"),
                resources.getString("soberaustin.paragraph3"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li[3]"),
                resources.getString("soberaustin.paragraph4"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//td/div/ul/li[4]"),
                resources.getString("soberaustin.paragraph5"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[2]"), resources.getString("soberaustin.paragraph6"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[3]"), resources.getString("soberaustin.paragraph7"));
        Assert.assertEquals(partnerPage.getElementTextByXPath("//p[4]"), resources.getString("soberaustin.paragraph8"));
    }
}