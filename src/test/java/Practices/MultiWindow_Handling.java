package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MultiWindow_Handling {

        public static void main(String[] args) {
//            WebDriverManager.chromedriver().setup();
//            WebDriver driver=new ChromeDriver();
//            driver.navigate().to("https://www.amazon.com");
//            String window1=driver.getWindowHandle();
//
//            // New Tab:
//            JavascriptExecutor js=(JavascriptExecutor)driver;
//            js.executeScript("window.open()");
//            Mylibrary.sleep(5);
//
//            // Switch between tabs:
//            Collection<String> allwindows= driver.getWindowHandles() ;
//            Iterator<String> it=allwindows.iterator();
//
//             window1=it.next();
//            String window2=it.next();
//
//            driver.switchTo().window(window2);
//            driver.navigate().to("https://www.facebook.com");
//            driver.switchTo().window(window1);
//            Mylibrary.sleep(3);
//            driver.switchTo().window(window2);


                    WebDriverManager.chromedriver().setup();
                    WebDriver driver=new ChromeDriver();
                    driver.manage().window().maximize();
                    driver.navigate().to("https://www.amazon.com/");
                    //new tab:
                    JavascriptExecutor js=(JavascriptExecutor)driver;
                    js.executeScript("window.open()");
                    js.executeScript("window.open()");
                    Mylibrary.sleep(3);

                    List<String> allwindows=new ArrayList(driver.getWindowHandles());
                    //
                    String window1=allwindows.get(0),
                            window2=allwindows.get(2),
                            window3=allwindows.get(1);
                    driver.switchTo().window(window2);
                    driver.get("https://www.etsy.com/");
                    driver.switchTo().window(window3);
                    driver.get("https://www.youtube.com");



       driver.navigate().to("https://www.etsy.com/");
                    //driver can't switch it self so it will open on amazon window
                    //we use collection to open the url in new window
                    //List(ArrayList, linkList, vector) - Set(hashSet and sortedSet) - Map(hasMap,TreeSet)
                    //Switch between tabs:

            // bestbuy,amazon, ebay .    halighan bir buyum search price , capture screen shot
            //






                }
            }






