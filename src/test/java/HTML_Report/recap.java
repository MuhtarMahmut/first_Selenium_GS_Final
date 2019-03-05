package HTML_Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class recap {


        public static void main(String[] args) {

            ExtentReports reportdocument = new ExtentReports();//  create document first
            // file ni html ning ichige qoyimiz
            ExtentHtmlReporter htmlFile = new ExtentHtmlReporter("test-output/Kuddus.html");

            reportdocument.attachReporter(htmlFile);
            // extent report only reports extent test.
            ExtentTest Tests = reportdocument.createTest("Testing the log in functionality");

            Tests.info("open browser, go to website");
            System.out.println("Go to Web");

            Tests.log(Status.INFO, "Logging in");
            System.out.println("Log in");

            Tests.log(Status.INFO, "Logging out");
            System.out.println("Log out");

            Tests.info("Quite the browser");
            System.out.println("Close the browser");

            reportdocument.setSystemInfo("Website", "www.facebook.com");
            reportdocument.setSystemInfo("UserName", "Tester");
            reportdocument.setSystemInfo("PassWord", "Admin");

            htmlFile.config().setDocumentTitle("Facebook LogIn");//same as user story
            htmlFile.config().setReportName("Mirzat GOAT");// tester name
            htmlFile.config().setTheme(Theme.DARK);// chngethe color

            reportdocument.flush();// create report
        }
    }
