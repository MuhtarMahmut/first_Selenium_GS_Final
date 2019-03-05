package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Reviw_Actions {

    WebDriver driver;

    Actions act = new Actions(driver);
    public void example() throws InterruptedException {
        WebElement xx = null;
        act.moveToElement(xx);
        act.moveToElement(xx).perform();
        //in webelemnt we can do actions only one by one

        act.moveToElement(xx).click().sendKeys("xxxx").sendKeys(Keys.ENTER).perform();
        act.pause(300).perform();
        //.pause method: sleeps the webdriver
        Thread.sleep(300);
        // it makes the java to sleep

        }

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.navigate().to("");
        WebElement search = driver.findElement(By.xpath(""));
     //   search.sendKeys("");
      //  Mylibrary.sleep(3);

        new Actions(driver).moveToElement(search).sendKeys("asdasdsada").pause(2000).sendKeys(Keys.BACK_SPACE)
                .pause(2000).sendKeys(Keys.BACK_SPACE).pause(2000).sendKeys(Keys.BACK_SPACE).perform();
        for(int i=0; i<3; i++){
            new Actions(driver).sendKeys(Keys.BACK_SPACE).perform();

        }
    }



    }
