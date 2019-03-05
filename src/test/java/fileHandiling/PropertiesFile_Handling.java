package fileHandiling;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesFile_Handling {
    // step one: make the file readable in javae
    public static void main(String[] args)throws Exception {

            // Step One:  make the file readable in java.

            // Step One:  make the file readable in java.
            FileInputStream file = new FileInputStream("info.properties");

            // Step Two:
            Properties myproFile = new Properties();
            myproFile.load(file);

            String myName = myproFile.getProperty("Name");
            System.out.println(myName);
            //  Verify process:
            String exceptedresult = "Muhtar";
            Assert.assertTrue(myName.equals(exceptedresult));
            // assertTrue expects true  boolean expression inside the ().

            Assert.assertFalse(!myName.equals(exceptedresult));
            // assertFalse expects false boolean expression inside ().
            Assert.assertFalse(false);
            Assert.assertTrue(true);

            // another verification: SoftAssert:
            SoftAssert ast = new SoftAssert();
            ast.assertTrue(false);

            System.out.println("Test finished");

            String actualresult = myproFile.getProperty("Gender");
            Assert.assertEquals("Male", actualresult);
            System.out.println(actualresult);

            String AA = myproFile.getProperty("UserName");
            System.out.println(AA);

        }
    }
