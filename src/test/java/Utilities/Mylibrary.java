package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Mylibrary {
public static Actions act;

    public static void sleep(double a){
        try {
            Thread.sleep((int)(a*1000));
        } catch (InterruptedException e) {

        }
    }

    public static WebElement DynamicElement(WebDriver driver,String tagname, String codition){
        List<WebElement> allclickable=driver.findElements(By.tagName(tagname));
        for(WebElement each: allclickable) {
            if (each.getText().toLowerCase().contains(codition.toLowerCase())) {
                return each;
            }
        }
        return null;
    }

    public static void TakeScreenshotsplease(WebDriver driver, String SaveAs){
        TakesScreenshot mirzat=(TakesScreenshot)driver;
        File myfile=mirzat.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(myfile, new File("src/test/captures/"+SaveAs+".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void scrollplease(WebDriver driver, int y){
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("scroll(0,"+y+")");

    }




}
