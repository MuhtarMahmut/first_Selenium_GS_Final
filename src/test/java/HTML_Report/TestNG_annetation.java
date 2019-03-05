package HTML_Report;

import org.testng.annotations.*;

public class TestNG_annetation {

    @BeforeMethod
    public void x1(){
        System.out.println("this is Before Method");
    }

    @BeforeClass
    public void x2(){
        System.out.println("this is Before Class");
    }

    @BeforeTest
    public void x3(){
        System.out.println("This is before Test");
    }

    @BeforeSuite
    public void x4(){
        System.out.println("This is Before Suit");
    }

    @AfterMethod
    public void x5(){
        System.out.println("This is After method");
    }

    @AfterClass
    public void x6(){
        System.out.println("this is after class");
    }

    @AfterTest
    public void X7(){
        System.out.println("This is After Test");
    }

    @AfterSuite
    public void x8(){
        System.out.println("this is after suit");
    }

    @Test
    public void DD(){

    }

    @Test
    public void BB(){

    }
    @Test
    public void zz(){

    }

}