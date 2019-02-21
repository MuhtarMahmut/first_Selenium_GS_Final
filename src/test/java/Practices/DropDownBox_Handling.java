package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.List;


public class DropDownBox_Handling extends Mylibrary{
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
            driver.navigate().to("http://www.facebook.com");
            driver.manage().window().maximize();

         Mylibrary.sleep(3.5);
   //    new Actions(driver).pause(3000).perform();

        // first Step:  Creating the elemnts of the drop box:
        WebElement month=driver.findElement(By.xpath(".//select[@id='month']"));
        Select monthslect=new Select(month);
  //      monthslect.selectByIndex(11);   // index will take number
    //        monthslect.selectByValue("12");    // value was in STring format in html
        monthslect.selectByVisibleText("Aug");   // must be in String format.
          //  the most secure one is: visibleText

        List<WebElement> dropdownboxes=driver.findElements(By.tagName("select"));
        for (int i=0;i<dropdownboxes.size(); i++){
            Select select=new Select(dropdownboxes.get(i));
            String AA=dropdownboxes.get(i).getText();
                    if(AA.contains("Month"))
                        select.selectByVisibleText("Oct");
                    else if(AA.contains("Day"))
                        select.selectByVisibleText("12");
                    else
                        select.selectByVisibleText("2010");

                    Mylibrary.sleep(2);

        }



    }

}
