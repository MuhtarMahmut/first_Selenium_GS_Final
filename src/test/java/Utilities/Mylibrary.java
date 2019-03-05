package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Mylibrary {

    public static void sleep(double a){
        try {
            Thread.sleep((int)(a*1000));
        } catch (InterruptedException e) {

        }


    }
    //take screenshot method
    public static void TakeScreenshotsplease(WebDriver driver, String SaveAs){
        TakesScreenshot mirzat=(TakesScreenshot)driver;
        File myfile=mirzat.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(myfile, new File("src/test/captures/"+SaveAs+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    //scroll down method
    public static void scrollDown(WebDriver driver, int y){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("scroll(0, "+y+")");


    }

    public static void waitTitle(WebDriverWait wait, String titlecomtains){
        wait.until(ExpectedConditions.titleContains(titlecomtains));


    }

}

