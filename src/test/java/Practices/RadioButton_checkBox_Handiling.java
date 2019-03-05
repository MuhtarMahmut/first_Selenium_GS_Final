package Practices;


import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

import java.util.concurrent.TimeUnit;

public class RadioButton_checkBox_Handiling {
    public static void main(String[] args) throws IOException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.etsy.com/?ref=lgo");

        WebElement searchBox = driver.findElement(By.xpath(".//input[@id='search-query']"));
        searchBox.sendKeys("Wooden Spoon" + Keys.ENTER);
        driver.manage().window().maximize();

        //Implicity wait :
        //Make time out for HTML codes to be fully uploaded so that findElement will work properly
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//        TakesScreenshot mirzat = (TakesScreenshot)driver;
//        //this step will take screeenshot of the browser
//        File myFile = mirzat.getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(myFile, new File("src/test/captures/"+"Zuhraaa.jpg"));
//        driver.close();

        //this is the scrole down and right left method
       Mylibrary.scrollDown(driver,2000);
      Mylibrary.TakeScreenshotsplease(driver,"NewPic");



        driver.quit();

    }

}