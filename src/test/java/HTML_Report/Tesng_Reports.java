package HTML_Report;

import Utilities.Mylibrary;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Tesng_Reports {
    static WebDriver driver;
    static ExtentReports myreport;
    static ExtentTest mytest1;
    static ExtentHtmlReporter htmlfile;

    @BeforeMethod
    public void setup1(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        myreport=new ExtentReports();
        htmlfile=new ExtentHtmlReporter("Reports/facebookreport.html");
        myreport.attachReporter(htmlfile);
    }

    @AfterMethod
    public void theEnd(ITestResult result)throws IOException{
     //   result.getStatus() ==ITestResult.FAILURE
        if(ITestResult.FAILURE !=0) {
            mytest1.log(Status.FAIL,result.getName());
           Mylibrary.TakeScreenshotsplease(driver,"MuhtarJan2");

           mytest1.addScreenCaptureFromPath("src/test/captures/MuhtarJan2.png");

            mytest1.log(Status.FAIL,result.getThrowable());
            mytest1.createNode("Hey Nigga, check it and fix for me, other wise you kno what happens");
            System.out.println("\t\t\t Your Test is Failed,\n Please Re-check \n");
            myreport.flush();
        }
        myreport.setSystemInfo("Website","www.facebook.com");
        myreport.setSystemInfo("Username","user");
        myreport.setSystemInfo("Password","pass");
        myreport.setSystemInfo("Browser","Chrome");
        myreport.flush();

        Mylibrary.sleep(5);
        driver.quit();
    }

    @Test
    public void Test1(){
        mytest1=myreport.createTest("access to the facebook");

        mytest1.log(Status.INFO,"access to the facebook");
        driver.get("https://www.facebook.com");

        mytest1.log(Status.INFO,"Verify the title");
        String AA=driver.getTitle().toLowerCase();
        Assert.assertTrue(AA.contains("Faceboo"));

    }


}
