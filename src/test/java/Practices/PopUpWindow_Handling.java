package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpWindow_Handling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.bestbuy.com/");

        Mylibrary.sleep(3);
        Actions act = new Actions(driver);
        act.click().perform();
    }
}
