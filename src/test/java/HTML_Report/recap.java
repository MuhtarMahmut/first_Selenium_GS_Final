package HTML_Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class recap {

    public static void main(String[] args) {
        ExtentReports reportdocument=new ExtentReports();
        ExtentHtmlReporter htmlFile=new ExtentHtmlReporter("test-output/Kuddus.html");
        reportdocument.attachReporter(htmlFile);

        ExtentTest Tests = reportdocument.createTest("Testing the log in functionality");

        Tests.info("open browser, go to website");
        System.out.println("Go to Web");

        Tests.log(Status.INFO,"Logging in");
        System.out.println("Log in");

        Tests.log(Status.INFO,"Logging out");
        System.out.println("Log out");

        Tests.info("Quite the browser");
        System.out.println("Close the browser");

        reportdocument.setSystemInfo("Website","www.facebook.com");
        reportdocument.setSystemInfo("UserName","Tester");
        reportdocument.setSystemInfo("PassWord","Admin");

        htmlFile.config().setDocumentTitle("Facebook LogIn");//this will give the name for the web
        htmlFile.config().setReportName("Mirzat GOAT");
        htmlFile.config().setTheme(Theme.DARK);  // this part will chnage the color


        reportdocument.flush();
    }
}

