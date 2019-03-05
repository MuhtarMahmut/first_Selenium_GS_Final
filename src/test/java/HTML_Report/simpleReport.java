package HTML_Report;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class simpleReport {

    public static void main(String[] args) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("Reports/Report1.html");
        //As soon as u create the class object of HTML reporter, u need to provide the file location and file name
        //only works for extant report file
        ExtentReports myreports = new ExtentReports();
        //its the one it generates the reposrt, html is only file.
        //extend reposrt only reposrts the extant test

        myreports.attachReporter(htmlReporter);

        ExtentTest mytest1 = myreports.createTest("Print My name on the console");
        //in this step, in myreportthe tests will be created

        mytest1.log(Status.INFO, "Using sysoutto print my name ");
        mytest1.log(Status.FAIL,"Invaled Info ");
        //this will shpw the how it looks after the test is faild
        mytest1.log(Status.SKIP,"Privious test failed");
        mytest1.log(Status.ERROR,"There has been error");
        mytest1.log(Status.PASS,"This test will pass ");

        System.out.println("Zuhra Jawdat");
                //it indicates the test steps

        myreports.setSystemInfo("Browser","www.com");
        myreports.setSystemInfo("UserName","Tester");
        myreports.setSystemInfo("Password","Zuhra");
        myreports.setSystemInfo("Address","verginia");
        myreports.flush();  // we must referesh the reports


        ExtentTest mytest2 = myreports.createTest("Log off functionality ");
        mytest2.log(Status.INFO,"Loging In");
        System.out.println("Loged in");
        mytest2.log(Status.INFO,"loging Out");
        System.out.println("Loged out");
        mytest2.log(Status.INFO,"Quite the Browser");
        System.out.println("Close the Browser");


        myreports.setSystemInfo("Website","Facebook.com");
        myreports.setSystemInfo("Facebook UserName", "Tester");
        myreports.setSystemInfo("Gender","Femaile");
     //   mytest2.createNode("Can you check this part of the code ");
        //this will give note to the developer to give the message
        myreports.flush();







    }
}
