package File_Handilings;


import org.apache.http.util.Asserts;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.util.Properties;

public class propertiesFile_handilings {

        public static void main(String[] args) {
    try {
        //Step One: make the file readable in java
        FileInputStream file = new FileInputStream("info.properties");
        //Step Two: Store the file in to it's java file
        Properties myProFile = new Properties();
        myProFile.load(file);
       String myName =  myProFile.getProperty("Name");
       //the data that im providing is String so i can isigned to Sring
        System.out.println(myName);
        String exceptedresult = "Muhtar";
        Assert.assertTrue(myName.equals(exceptedresult));
        //assertTrue excepts true boolean expression inside the ()
        Assert.assertFalse(!myName.equals(exceptedresult));
        //assertFalse expects false boolean expression inside ()
        Assert.assertFalse(false);
        Assert.assertTrue(true);
        System.out.println("Test finished");

        //another verification: SoftAssert
        SoftAssert ast = new SoftAssert();
        ast.assertTrue(false);
        //it will ignore it and just contues it
        //its contuniese statement
        System.out.println(false);

        String actualresult = myProFile.getProperty("Gender");
        Assert.assertEquals("Male",actualresult);
        System.out.println(actualresult);

        String AA = myProFile.getProperty("UserName");
        System.out.println(AA);

        }catch (Exception e){


    }
    }
    }