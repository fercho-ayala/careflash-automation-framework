package testcases.join;

import libraries.TestCase;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.homepage.CareFlashHomePage;
import pages.join.CareFlashRegistrationPage;

public class CareFlashJoinTest extends TestCase
{
    private CareFlashHomePage homePage;
    private CareFlashRegistrationPage registrationPage;

    @BeforeTest
    public void setUp()
    {
        super.loadResources("resources/pages/registration/ContentsBundle");
        homePage = new CareFlashHomePage();
        
        homePage.homePage();
        registrationPage = homePage.clickJoin();
    }
    
    public void doTest()
    {

    }

    @Test
    public void testRegistrationText()
    {
        Assert.assertEquals(registrationPage.getElementTextByCss("span"), resources.getString("registration.span"));
        Assert.assertEquals(registrationPage.getElementTextById("text1"), resources.getString("registration.text1"));
        Assert.assertEquals(registrationPage.getElementTextByXPath("//table[2]/tbody/tr/td/span"), resources.getString("registration.span2"));
        Assert.assertEquals(registrationPage.getElementTextByCss("em"), resources.getString("registration.em"));
        Assert.assertEquals(registrationPage.getElementTextByXPath("//form/div/table/tbody/tr/td/div"), resources.getString("registration.required"));
        Assert.assertEquals(registrationPage.getElementTextById("labelprefix"), resources.getString("registration.prefix"));
        Assert.assertEquals(registrationPage.getElementTextById("labelfirstname"), resources.getString("registration.firstname"));
        Assert.assertEquals(registrationPage.getElementTextById("labellastname"), resources.getString("registration.lastname"));
        Assert.assertEquals(registrationPage.getElementTextById("labelsuffix"), resources.getString("registration.suffix"));
        Assert.assertEquals(registrationPage.getElementTextById("labelemail"), resources.getString("registration.email"));
        Assert.assertEquals(registrationPage.getElementTextById("labelconfirmemail"), resources.getString("registration.confirmemail"));
        Assert.assertEquals(registrationPage.getElementTextById("labelzip"), resources.getString("registration.zip"));
        Assert.assertEquals(registrationPage.getElementTextByXPath("//tr[9]/td/div"), resources.getString("registration.language"));
        Assert.assertEquals(registrationPage.getElementTextByXPath("//tr[9]/td[3]/div"), resources.getString("registration.year"));
        Assert.assertEquals(registrationPage.getElementTextById("labelnewloginName"), resources.getString("registration.newloginName"));
        Assert.assertEquals(registrationPage.getElementTextById("labelconfirm"), resources.getString("registration.confirm"));
        Assert.assertEquals(registrationPage.getElementTextByCss("span.label"), resources.getString("registration.tou"));
        //Assert.assertEquals(registrationPage.getElementTextById("formcontent"), resources.getString("registration.formcontent"));
        Assert.assertEquals(registrationPage.getElementTextById("passwordValidation"), resources.getString("registration.passwordValidation"));
        Assert.assertEquals(registrationPage.getElementTextByCss("b"), resources.getString("registration.bold"));
    }

    @Test
    public void testReactivateAccountPopUp()
    {
        registrationPage.clickReactivate();
        //Assert.assertEquals(registrationPage.getElementTextByCss("h2"), resources.getString("registration.heading2"));
        //Assert.assertEquals(registrationPage.getElementTextByCss("#reactivateAccountForm > div"), resources.getString("registration.paragraph"));
        registrationPage.clickCloseReactivate();
    }

    @Test
    public void testRegisterNow()
    {
        registrationPage.clickRegisterNow();
        //Assert.assertTrue(CareFlashResetPassPopup.verifyContentPresent());
    }

    @Test
    public void testInstructionsLink()
    {
        registrationPage.clickInstructions();
        //Assert.assertTrue(CareFlashResetPassPopup.verifyContentPresent());
    }

}
