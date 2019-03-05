package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class DropDownBoxHandling extends Mylibrary{

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new  ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();

       // Mylibrary.sleep(3);// java sleep

        act = new Actions(driver);
       act.pause(3000).perform();

        // new Actions(driver).pause(3000).perform();
        WebElement month = driver.findElement(By.xpath(".//select[@id='month']"));
        Select monthslect = new Select(month);
        monthslect.selectByIndex(11);// index will take number
        monthslect.selectByValue("12");// value was in String format in html
        monthslect.selectByVisibleText("Aug");// must be string format

        // most secure one is visible text
        List<WebElement> dropDownBox = driver.findElements(By.tagName("select"));
        System.out.println(dropDownBox.size());
        for (int i = 0; i< dropDownBox.size(); i++){
            Select select = new Select(dropDownBox.get(i));
            String AA = dropDownBox.get(i).getText();
            if (AA.contains("Month")){
                select.selectByVisibleText("Otc");
            }else if(AA.contains("Day")){
                select.selectByVisibleText("12");
            }else{
                select.selectByVisibleText("2010");
            }
           // select.selectByIndex(8);

        }




    }

}
