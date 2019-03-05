package Practices;

import Utilities.Mylibrary;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Review_Action {
    WebDriver driver;
    // all the external execution;
    Actions act = new Actions(driver);
    public void example(){
        WebElement xx = null;
        xx.sendKeys("xxx");
        act.moveToElement(xx);// any action without perform command , wont be executed
        act.moveToElement(xx).perform();// you most put the perform on order to excute

        act.moveToElement(xx).click().sendKeys("xxx").sendKeys(Keys.ENTER).perform();
        act.pause(3000).perform();




    }

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("");
        WebElement search = driver.findElement(By.xpath(""));
        search.sendKeys("xxx");
        Mylibrary.sleep(3);
        search.sendKeys(Keys.CONTROL+ "a"+ Keys.BACK_SPACE);

        new Actions(driver).moveToElement(search).sendKeys("sdffgghh").pause(2000)
                .sendKeys(Keys.BACK_SPACE).pause(2000).sendKeys(Keys.BACK_SPACE).perform();

        for(int i =0; i<3; i++){
            new Actions(driver).sendKeys(Keys.BACK_SPACE).pause(1500).perform();
        }


    }
}
