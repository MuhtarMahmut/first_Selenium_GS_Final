package HTML_Report;

import Utilities.Mylibrary;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestNG_Reports {
    ExtentReports reportDoc;
    ExtentHtmlReporter file;
    ExtentTest Test;
    WebDriver driver;

    @AfterMethod
    public void AA(ITestResult result){
        // ITestResult:

        if(result.getStatus() ==ITestResult.SUCCESS){
            System.out.println("Your Test is Passed");
            Test.log(Status.PASS,"Successfully passed");

        }  else if(result.getStatus() == ITestResult.FAILURE){
            System.out.println("Nigga, Your Test is failed, please read the reports");
            Test.log(Status.FAIL,"Your Test is failed");
            Test.log(Status.FAIL,result.getThrowable());
            Mylibrary.TakeScreenshotsplease(driver,result.getName());
            Test.addScreenCaptureFromBase64String("src/test/captures/"+result.getName()+".jpg");


        } else if(result.getStatus() == ITestResult.SKIP){
            System.out.println("Some Tests Has been skipped");
            Test.log(Status.SKIP,"Your Test is Skipped");
        }



    }

    @BeforeTest
    public void BC(){
        reportDoc=new ExtentReports();
        file=new ExtentHtmlReporter("Reports/FaceBooks.html");
        reportDoc.attachReporter(file);
    }

    @AfterTest
    public void AF(){
        file.config().setDocumentTitle("FaceBook Report");
        file.config().setReportName("Tester: Muhtar");
        file.config().setTheme(Theme.DARK);

        reportDoc.setSystemInfo("Website","Faceebook");
        reportDoc.setSystemInfo("UserName","Tester");
        reportDoc.setSystemInfo("PassWord","Admin");
        reportDoc.flush();
    }

    @Test
    public void VerifyFaceBook(){
         Test=reportDoc.createTest("Verify FaceBook Page");

        Test.log(Status.INFO,"Set Up chrome Driver");
        WebDriverManager.chromedriver().setup();

        Test.info("Create Webdriver");
         driver=new ChromeDriver();

        Test.info("Open URL");
        driver.navigate().to("https://www.facebook.com");
        reportDoc.flush();

    }

    @Test
    public void Test2(){

        Test=reportDoc.createTest("Test 2");

        Test.log(Status.INFO,"Seeting up environemnt");
        WebDriverManager.chromedriver().setup();

        Test.info("web-driver");
         driver=new ChromeDriver();

        Test.info("go to URL");
        driver.navigate().to("www.facebook.com");

    }








}
