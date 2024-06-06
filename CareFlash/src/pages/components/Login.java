/*
 * 
 */
package pages.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import pages.homepage.CareFlashTodayPage;

public class Login
{
    private static final String USER = "loginName";
    private static final String PWD = "password";
    private static final String EMAIL = "email";
    private final WebDriver driver;

    public Login(WebDriver driver)
    {
        this.driver = driver;
    }

    public CareFlashTodayPage login(String loginName, String password)
    {
        setLogin(loginName);
        setPassword(password);
        return clickLoginButton();
    }

    public CareFlashTodayPage loginFacebookLoggedOut(String emailFacebook, String pass)
    {
        clickFacebookLoginButton();
        setEmail(emailFacebook);
        setPass(pass);
        return clickLoginFacebookButton();
    }

    public CareFlashTodayPage loginFacebookLoggedIn()
    {
        clickFacebookLoginButton();
        return new CareFlashTodayPage();
    }

    public void setLogin(String loginName)
    {
        driver.findElement(By.name(USER)).clear();
        driver.findElement(By.name(USER)).sendKeys(loginName);
    }

    public void setPassword(String password)
    {
        driver.findElement(By.name(PWD)).clear();
        driver.findElement(By.name(PWD)).sendKeys(password);
    }

    public CareFlashTodayPage clickLoginButton()
    {
        driver.findElement(By.cssSelector("input.button")).click();
        return new CareFlashTodayPage();
    }

    public CareFlashTodayPage clickFacebookLoginButton()
    {
        driver.findElement(By.cssSelector("div.fb > a > img")).click();
        return new CareFlashTodayPage();
    }

    public void setEmail(String emailFacebook)
    {
        driver.findElement(By.id(EMAIL)).clear();
        driver.findElement(By.id(EMAIL)).sendKeys(emailFacebook);
    }

    public void setPass(String pass)
    {
        driver.findElement(By.id("pass")).clear();
        driver.findElement(By.id("pass")).sendKeys(pass);
    }

    public CareFlashTodayPage clickLoginFacebookButton()
    {
        driver.findElement(By.id("u_0_1")).click();
        return new CareFlashTodayPage();
    }

    public void clickRememberMe()
    {
        driver.findElement(By.id("rememberMe")).click();
    }

}
