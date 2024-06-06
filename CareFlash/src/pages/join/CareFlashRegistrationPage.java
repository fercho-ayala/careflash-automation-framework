package pages.join;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import pages.Page;
import pages.privacy.CareFlashTermOfUsePage;
import pages.usermessages.CareFlashUserActivateAccountPage;

public class CareFlashRegistrationPage extends Page 
{
    public CareFlashRegistrationPage()
    {
        super();
    }

    public CareFlashTermOfUsePage clickTerms()
    {
        String element = resources.getString("registration.terms");
        driver.findElement(By.linkText(element)).click();
        return new CareFlashTermOfUsePage();
    }

    public void clickRegisterNow()
    {
        driver.findElement(By.id("submit_register")).click();
    }

    public void clickReactivate()
    {
        driver.findElement(By.id("activate_account")).click();
    }

    public void setusernameoremail(String usernameoremail)
    {
        driver.findElement(By.id("loginNameEmailVal")).clear();
        driver.findElement(By.id("loginNameEmailVal")).sendKeys(usernameoremail);
    }

    public CareFlashUserActivateAccountPage clickActivateAccount()
    {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.button")));
        element.click();
        return new CareFlashUserActivateAccountPage();
    }

    public void clickCancelButton()
    {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("cancelReactivateAccount")));
        element.click();
    }

    public void clickCloseReactivate()
    {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("cboxClose")));
        element.click();
    }

    public void clickOutOfWindow()
    {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("cboxOverlay")));
        element.click();
    }
    public void clickInstructions()
    {
        driver.findElement(By.cssSelector("b")).click();
    }
}
