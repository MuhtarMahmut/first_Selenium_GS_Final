package HTML_Report;

import Utilities.Mylibrary;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestNG_ReportFull {
    //Instance variable are created here so we can used outside method
    ExtentReports ReportDoc;
    ExtentHtmlReporter File;
    ExtentTest Test;
    WebDriver driver;

    //this is testNG report we are creating html file for failed tests
    @AfterMethod
    public void AA(ITestResult result){//no longer user provide it's concol provide
        //ITestResult indicates the test result for us and looks at the concel
        //if(ITestResult.FAILURE == 0){ html report will give pass but concel will give fail even tho
        //it goes throw to the url. cz getThrowable takes all failed value
        if(result.getStatus()==ITestResult.SUCCESS){
            System.out.println("Your test is passed");
            Test.log(Status.PASS,"Sucessfully passed");
            //we must indicate the info in every single step when we test in order to get the report
            //below is a step definition
        }else if(result.getStatus()==ITestResult.FAILURE){
            System.out.println("Your test is failed, plz read the report");
            Test.log(Status.FAIL,"Your test is failed");
            Test.log(Status.FAIL,result.getThrowable());
            // add the screen shot to the report
            Mylibrary.TakeScreenshotsplease(driver,result.getName());
            Test.addScreenCaptureFromBase64String("src/test/captures/" + result.getName()+".jpg");



        }else if(ITestResult.SKIP !=0){
            System.out.println("Some tests has skipped");            Test.log(Status.SKIP,"Test has been skipped");
        }
        Mylibrary.sleep(3);
        driver.quit();
    }
    @BeforeClass//we can write before suit, test or class cz it only executes once.
    // regards of how many test we have we only need to have one extent test report
    public void BC(){
        ReportDoc = new ExtentReports();
        File = new ExtentHtmlReporter("Reports/Facebooks.html");
        ReportDoc.attachReporter(File);
    }
    @AfterTest
    public void AT(){
        File.config().setDocumentTitle("Facebook LogIn");
        //renaming html file title
        File.config().setReportName("patima");
        File.config().setTheme(Theme.DARK);
        ReportDoc.setSystemInfo("Website","Facebook");
        ReportDoc.setSystemInfo("UserName","Tester");
        ReportDoc.setSystemInfo("Password", "Admin");

        ReportDoc.flush();

    }

    @Test(priority = 1)
    public void varifyFaceBook(){
        //document and html will only creates once in each class
        //in order to generate html report first we need to create extent report, and it represent the document
//        ReportDoc = new ExtentReports();
        //then we need to create html report file
//         File = new ExtentHtmlReporter("Reports/Facebooks.html");
        //then we have to attach reportfile to html
//        ReportDoc.attachReporter(File);

        //since extent report only reports extent test,
        //there for in each we have to create extent test in the report document
        Test = ReportDoc.createTest("Verify Facebook Page");

        //extent test will created once in every test
        //each test steps we have to address in extents test, so it can present in details
        Test.log(Status.INFO,"Set up chrome driver");
        WebDriverManager.chromedriver().setup();
        Test.info("Create Webdriver");
        driver = new ChromeDriver();

        Test.info("Open Html");
        driver.navigate().to("www.facebook.com");
        ReportDoc.flush();
    }
    @Test(priority = 2)
    public void Test2(){
        Test=ReportDoc.createTest("Test 2");

        Test.log(Status.INFO,"Setting up environment");
        WebDriverManager.chromedriver().setup();

        Test.info("web-driver");
        driver=new ChromeDriver();

        Test.info("go to URL");
        driver.navigate().to("https://www.facebook.com");
    }

}
