package pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.Page;
import pages.about.CareFlashAboutPage;
import pages.community.CareFlashHealthVideosPage;
import pages.components.Login;
import pages.components.QuickLinks;
import pages.createcommunity.CareFlashSignInPage;
import pages.join.CareFlashRegistrationPage;
import pages.privacy.CareFlashTellAFriendPopup;
import pages.search.CareFlashSearchPage;

/**
 * The Class CareFlashHomePage.
 */
public class CareFlashHomePage extends Page
{
    /** The Login. */
    protected Login login;
    protected QuickLinks quicklinks;

    /**
     * Instantiates a new care flash home pages.
     */
    public CareFlashHomePage()
    {
        super();
        super.loadResources("resources/pages/homepage/ContentsBundle");
        login = new Login(driver);
        quicklinks = new QuickLinks(driver,LANGUAGE);
    }

    /**
     * Login.
     * 
     * @param loginName
     *            the login name
     * @param password
     *            the password
     * @return the care flash today pages
     */
    public CareFlashTodayPage login(String loginName, String password)
    {
        return login.login(loginName, password);
    }

    /**
     * Login facebook logged out.
     * 
     * @param emailFacebook
     *            the email facebook
     * @param pass
     *            the pass
     * @return the care flash today pages
     */
    public CareFlashTodayPage loginFacebook(String emailFacebook, String pass)
    {

        return login.loginFacebookLoggedOut(emailFacebook, pass);
    }

    /**
     * Login facebook logged in.
     * 
     * @return the care flash today pages
     */
    public CareFlashTodayPage loginFacebookLoggedIn()
    {
        return login.loginFacebookLoggedIn();
    }

    /**
     * Sets the login.
     * 
     * @param loginName
     *            the new login
     */
    public void setLogin(String loginName)
    {
        login.setLogin(loginName);
    }

    /**
     * Sets the password.
     * 
     * @param password
     *            the new password
     */
    public void setPassword(String password)
    {
        login.setPassword(password);
    }

    /**
     * Click login button.
     * 
     * @return the care flash today pages
     */
    public CareFlashTodayPage clickLoginButton()
    {
        return login.clickLoginButton();
    }

    /**
     * Click facebook login button.
     * 
     * @return the care flash facebook pages
     */
    public CareFlashTodayPage clickFacebookLoginButton()
    {
        return login.clickFacebookLoginButton();
    }

    /**
     * Sets the email.
     * 
     * @param emailFacebook
     *            the new email
     */
    public void setEmail(String emailFacebook)
    {
        login.setEmail(emailFacebook);
    }

    /**
     * Sets the pass.
     * 
     * @param pass
     *            the new pass
     */
    public void setPass(String pass)
    {
        login.setPass(pass);
    }

    /**
     * Click login facebook button.
     * 
     * @return the care flash today pages
     */
    public CareFlashTodayPage clickLoginFacebookButton()
    {
        return login.clickLoginFacebookButton();
    }

    /**
     * Click remember me.
     */
    public void clickRememberMe()
    {
        login.clickRememberMe();
    }

    /**
     * Click home pages.
     * 
     * @return the care flash today pages
     */
    public CareFlashTodayPage clickHomePage()
    {
        driver.findElement(By.linkText("HOME")).click();
        return new CareFlashTodayPage();
    }

    /**
     * Click create a new care community quick link.
     * 
     * @return the care flash sign in pages
     */
    public CareFlashSignInPage clickCreateaNewCareCommunityQuickLink()
    {
        return quicklinks.clickCreateaNewCareCommunityQuickLink();
    }

    /**
     * Click about us quick link.
     * 
     * @return the care flash inspiration pages
     */
    public CareFlashAboutPage clickAboutUsQuickLink()
    {
        return quicklinks.clickAboutUsQuickLink();
    }

    public CareFlashTellAFriendPopup clickTellFriendPopUpHome()
    {
        String element = resources.getString("home.tellfriend");
        driver.findElement(By.linkText(element)).click();
        try
        {
            Thread.sleep(5000);
        }
        catch (InterruptedException e)
        {
            logger.info("InterruptedExceptionTellaFriend", e);
        }
        CareFlashTellAFriendPopup tellAFriendPage = new CareFlashTellAFriendPopup();
        driver.switchTo().window(getLastWindow());
        return tellAFriendPage;
    }

    public CareFlashSignInPage clickNewCareCommunityLink()
    {
        String element = resources.getString("home.newcarecommunity");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashSignInPage();
    }

    public CareFlashRegistrationPage clickNewToCareFlashLink()
    {
        String element = resources.getString("home.newcareflash");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashRegistrationPage();
    }

    public void clickForgotPassword()
    {
        driver.findElement(By.id("resetPassPopup")).click();
    }

    public void setusernameoremail(String usernameoremail)
    {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("resetLoginName")));
        element.clear();
        element.sendKeys(usernameoremail);
        
        //driver.findElement(By.id("resetLoginName")).clear();
        //driver.findElement(By.id("resetLoginName")).sendKeys(usernameoremail);
    }

    public void clickResetPasswordForm()
    {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.button")));
        element.click();
    }

    public void clickCloseButton()
    {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("cboxClose")));
        element.click();
    }

    public void clickCancelButton()
    {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("cancelForgotPass")));
        element.click();
    }

    public CareFlashSearchPage clickSearchLink()
    {
        String element = resources.getString("home.searchlabel");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashSearchPage();
    }

    public CareFlashHealthVideosPage clickSampleLink()
    {
        String element = resources.getString("home.sample");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashHealthVideosPage();
    }

    public CareFlashSocialMarketingPage clickMoreInfoLink()
    {
        String element = resources.getString("home.moreinfo");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashSocialMarketingPage();
    }
}
