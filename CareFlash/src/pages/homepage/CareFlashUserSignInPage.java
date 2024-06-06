package pages.homepage;

import org.openqa.selenium.By;

import pages.Page;

/**
 * The Class CareFlashUserSignInPage.
 */
public class CareFlashUserSignInPage extends Page
{

    /** The Constant USER. */
    private static final String USER = "loginName";

    /** The Constant PWD. */
    private static final String PWD = "password";

    /**
     * Instantiates a new care flash signin pages.
     */
    public CareFlashUserSignInPage()
    {
        super();
    }

    /**
     * Sets the login.
     * 
     * @param loginName
     *            the new login
     */
    public void setLogin(String loginName)
    {
        driver.findElement(By.name(USER)).clear();
        driver.findElement(By.name(USER)).sendKeys(loginName);
    }

    /**
     * Sets the password.
     * 
     * @param password
     *            the new password
     */
    public void setPassword(String password)
    {
        driver.findElement(By.name(PWD)).clear();
        driver.findElement(By.name(PWD)).sendKeys(password);
    }

    /**
     * Click login button.
     * 
     * @return the care flash today pages
     */
    public CareFlashTodayPage clickLoginButton()
    {
        driver.findElement(By.cssSelector("input.button")).click();
        return new CareFlashTodayPage();
    }
}
