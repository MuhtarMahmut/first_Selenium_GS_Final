package HTML_Report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import sun.jvmstat.perfdata.monitor.PerfStringVariableMonitor;

public class simpleReport {
    public static void main(String[] args) {// java application de qilduq
        ExtentHtmlReporter htmlreport = new ExtentHtmlReporter("Reportes/simpleReport.html");//
        /*
        //as soon as we create a html reporter we will need to write file location and file name,
        //report1 file will automatically create after executing the code
         */

        ExtentReports myreports = new ExtentReports();// only reports extent tests

        //we are creating a report document and we are attaching the file to it
        myreports.attachReporter(htmlreport);

        ExtentTest mytest1 = myreports.createTest("Print My Name on the console");

            // extent test only report extend
            //each test need to reported
        mytest1.log(Status.INFO,"Using sysout to print my name");// each step we need wright

        mytest1.log(Status.FAIL,"Invalid Website");
        mytest1.log(Status.SKIP,"Privous test faild");
        mytest1.log(Status.ERROR,"There has been Error");
        mytest1.log(Status.PASS,"Test Passed");


        System.out.println("Muhtar Mahmut");

        // setSystemInf => it allows as to give the infor mation to the dash board
        myreports.setSystemInfo("Browser","www.yahoo.com");
        myreports.setSystemInfo("UserName", "Tester");
        myreports.setSystemInfo("password","admin");
        myreports.setSystemInfo("Address","Virginia");

      //  mytest1.log(Status.INFO,"go to URL"); first test case diki each step

        myreports.flush();   // we must!



        // create test in report

        ExtentTest mytest2 = myreports.createTest("log Off Functionality");
        mytest2.log(Status.INFO,"Loggin in");
        System.out.println("loggin in");

        mytest2.log(Status.INFO,"Logging out");
        System.out.println("logging out");


        mytest2.log(Status.INFO,"Quite the Browser");
        System.out.println("Close the browser");

        myreports.setSystemInfo("FaceBook User name","Tester");
        myreports.setSystemInfo("FaceBook Password","admin");

       // mytest2.createNode("could you take look at your self");

        myreports.flush();




    }
}