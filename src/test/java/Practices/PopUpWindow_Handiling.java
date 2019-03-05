package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpWindow_Handiling {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.bestbuy.com/");
        Mylibrary.sleep(2);
//        Actions act = new Actions(driver);
//        act.click().perform();
        //this will do the action to clcik anywhere from the site and make the box disappear
        driver.navigate().refresh();
        new Actions(driver).click().perform();

    }
}
