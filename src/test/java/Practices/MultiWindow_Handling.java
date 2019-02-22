package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.*;

public class MultiWindow_Handling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");

        // New Tab:
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.open()");

        Mylibrary.sleep(5);
        // Switch between tabs:
        Collection<String> allwindows= driver.getWindowHandles() ;
        Iterator<String> it=allwindows.iterator();
         String window1=it.next();
         String window2=it.next();
            driver.switchTo().window(window2);
        driver.navigate().to("https://www.facebook.com");

        driver.switchTo().window(window1);
        Mylibrary.sleep(3);
        driver.switchTo().window(window2);


        // bestbuy, amazon, ebay.
            // search your favorite item on all of them .
        // take screen shot.  ( DO Not Use the custome method in Mylibrary).


    }
}