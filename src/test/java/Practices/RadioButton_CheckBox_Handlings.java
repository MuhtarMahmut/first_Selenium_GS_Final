package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class RadioButton_CheckBox_Handlings {
    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.etsy.com/");

        WebElement searchbox=driver.findElement(By.xpath(" //*[@id=\"search-query\"]"));
        searchbox.sendKeys("Wooden Spoon" + Keys.ENTER);
        driver.manage().window().maximize();
        // Implicity wait:
        // makes time out for HTML codes to be fully uploaded so that findElements will work properly

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      //  WebElement xx=driver.findElement(By.xpath("//span[contains(text(),'On sale')]"));
       // xx.click();

//       Mylibrary.ClickDynamic(driver,"On sal");
//       Mylibrary.ClickDynamic(driver,"Free shi");
//       Mylibrary.ClickDynamic(driver,"Ceramic");

        WebElement Onsale=Mylibrary.DynamicElement(driver,"a","On sal");
     //   Onsale.click();
        WebElement FreeShippng=Mylibrary.DynamicElement(driver,"a","Free shi");
      //  FreeShippng.click();

        Mylibrary.scrollplease(driver,2000);

       Mylibrary.TakeScreenshotsplease(driver,"NewPicture");

//        WebElement xx=driver.findElement(By.xpath(".//*[@id='search-filter-reset-form']/div[3]/fieldset/div/label/a"));
//        xx.click();




    }
}
