package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckBox_RadioButton_Handling {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://www.etsy.com");

        WebElement searchbox = driver.findElement(By.xpath(".//input[@id= 'search-query']"));
        searchbox.sendKeys("WoodenSpoon" + Keys.ENTER);
        // impicitywait : makes  time out

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //
        // WebElement firstcheckbox = driver.findElement(By.xpath("//span[contains(text(),'On sale')]"));


        TakesScreenshot mirzat = (TakesScreenshot)driver;
        // this step will take screenshot of the current browser
        File myfile = mirzat.getScreenshotAs(OutputType.FILE);

        FileUtils.copyFile(myfile,new File("src/test/captures/" + "ankar.jpg"));

        Mylibrary.TakeScreenshotsplease(driver, "Ezize");

        JavascriptExecutor scrollDown =(JavascriptExecutor) driver;// scrooldown action

       // scrollDown.executeScript("scroll(1000,1000)"); //  horizantol, vertical

      //  scrollDown.executeScript("scroll(0,3000");
       // Mylibrary.sleep(2);
      //
        //  scrollDown.executeScript("0,0");

        Mylibrary.scrollplease(driver,2000);



        }
    }

