package HTML_Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.apache.xmlbeans.impl.schema.StscChecker;

public class simpleReport {
    public static void main(String[] args) {
        ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("Reports/report1.html");

        ExtentReports myreports =new ExtentReports();

        myreports.attachReporter(htmlreport);

        ExtentTest mytest1=myreports.createTest("LogIn Functionality");

        mytest1.log(Status.INFO, "Using sysout to print my name");
        System.out.println("Muhtar Mahmut");
//        mytest1.log(Status.FAIL,"Invalid Website");
//        mytest1.log(Status.SKIP,"Prvious test failed");
//        mytest1.log(Status.ERROR,"There Has been erros");
//        mytest1.log(Status.PASS,"Test Passed");
   //



        myreports.setSystemInfo("Browser","https://www.yahoo.com");
        myreports.setSystemInfo("UserName:","Tester");
        myreports.setSystemInfo("Password","Admin");
        myreports.setSystemInfo("Address","Virginia");
        myreports.flush();    // WE MUST!!


        ExtentTest mytest2=myreports.createTest("Logg Off Functionality");

        mytest2.log(Status.INFO,"Logging in");
    //    System.out.println("loged in");

        mytest2.log(Status.INFO,"Logging Out");
     //   System.out.println("Loged out");

        mytest2.log(Status.INFO,"Quite The Browser");
  //      System.out.println("Close the browser");

        myreports.setSystemInfo("website for test2","facebook.com");
        myreports.setSystemInfo("Facebook User name","Tester");
        myreports.setSystemInfo("FaceBook PassWord","Admin");

     //   mytest2.createNode("Can You take a look at your self.");
        myreports.flush();


    }

}
