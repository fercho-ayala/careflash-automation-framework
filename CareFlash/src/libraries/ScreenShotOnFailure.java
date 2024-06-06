package libraries;

import org.testng.TestListenerAdapter;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
 
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ScreenShotOnFailure extends TestListenerAdapter
{
    @Override
    public void onTestFailure(ITestResult tr) {
        System.out.println("===========TEST FAILURE=========");
        WebDriver driver = WebDriverManager.getDriverInstance();
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        DateFormat dateFormat = new SimpleDateFormat("dd_MMM_yyyy__hh_mm_ssaa");
        String destDir = "target/surefire-reports/screenshots";
        new File(destDir).mkdirs();
        String destFile = dateFormat.format(new Date()) + ".png";
 
        try {
            FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Reporter.setEscapeHtml(false);
        Reporter.log("Saved <a href=../screenshots/" + destFile + ">Screenshot</a>");
    }
}
