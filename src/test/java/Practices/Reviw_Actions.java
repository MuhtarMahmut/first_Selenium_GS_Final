package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Reviw_Actions {
    WebDriver driver;

    // all the external execution
    Actions act=new Actions(driver);

    public void example(){
        WebElement xx=null;
        xx.sendKeys("xxx");
        act.moveToElement(xx);    // any actions without perfrom commant, won't be excuted.
        act.moveToElement(xx).perform();   // YOU MUST put the perform in order to execute.

        act.moveToElement(xx).click().sendKeys("xxxx").sendKeys(Keys.ENTER).perform();

        act.pause(3000).perform();
                // .pause method:   sleeps the webbrowser.
       // Thread.sleep(3000);  it sleeps the java.
    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.google.com");
        WebElement search=driver.findElement(By.xpath("//input[@title='Search']"));
    //    search.sendKeys("asdasdasd");
    //    Mylibrary.sleep(3);
     //   search.sendKeys(Keys.CONTROL+"a"+Keys.BACK_SPACE);
        Actions act=new Actions(driver);

       new Actions(driver).moveToElement(search).sendKeys("asdasdasd").pause(2000)
              .sendKeys(Keys.BACK_SPACE).pause(2000).sendKeys(Keys.BACK_SPACE)
               .sendKeys(Keys.CONTROL+"a").pause(3000).sendKeys(Keys.BACK_SPACE).perform();
//        new Actions(driver).moveToElement(search).sendKeys("MuhtarMahmut").perform();
//        for(int i=0; i<5;i++)
//            new Actions(driver).sendKeys(Keys.BACK_SPACE).pause(1500).perform();


    }


}
