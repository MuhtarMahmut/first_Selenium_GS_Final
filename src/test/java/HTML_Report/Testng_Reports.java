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
import org.testng.annotations.Test;

public class Testng_Reports {

    static WebDriver driver;
    static ExtentReports myreport;
    static ExtentTest mytest1;
    static ExtentHtmlReporter htmlfile;

    @BeforeMethod
    public void setup1(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

    //i created object of the extent report in the before method
        myreport=new ExtentReports();

        // and i created extenthtml report inj the before method
        htmlfile=new ExtentHtmlReporter("Reports/facebookreport.html");

        //i addresss where the html file will be saved
        // html file created outomaticly when its run every time
        myreport.attachReporter(htmlfile);

        // then we attached html file to extent report
    }

    @AfterMethod
    public void theEnd(ITestResult result){

        //ITestResult =>result consule provide
        // benefit of ITestResult it will provide report while test is field

        if(ITestResult.FAILURE !=0) {

            mytest1.log(Status.FAIL,result.getName());
            // log is step definition
            Mylibrary.TakeScreenshotsplease(driver,"Muhtar");
            Mylibrary.sleep(3);

            mytest1.addScreenCaptureFromBase64String("src/test/captures/Muhtar.jpg");

            mytest1.log(Status.FAIL,result.getThrowable());
            // getThrowable() is showing the console // //getThrowable
            // used to report error and exception both on the report page
            mytest1.createNode("Hey Nigga, check it and fix for me, other wise you kno what happens");
            // commit to section
            System.out.println("\t\t\t Your Test is Failed,\n Please Re-check \n");
        }
        // setSystemInfo => this is for pre condition

        myreport.setSystemInfo("Website","www.facebook.com");
        // setSystemInfo those data we esed for system  attach to them html report file
        myreport.flush();

        Mylibrary.sleep(5);
        driver.quit();
    }

    @Test
    public void Test1(){
        // we create extent test from extent report
        mytest1=myreport.createTest("access to the facebook");
    // log is step definition
        mytest1.log(Status.INFO,"access to the facebook");
        driver.get("https://www.facebook.com");

        mytest1.log(Status.INFO,"Verify the title");
        String AA=driver.getTitle().toLowerCase();

        Assert.assertTrue(AA.contains("Faceboo"));

    }


}
