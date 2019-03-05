package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Implicity_VS_Explicity {

//Implicitly wait:
        // timeouts for HTML codes to be uploaded properly so that the webElement can be found
        //only applies to : FindElement(s)
        //because findelement(s) is the only way make the webElemnt out from the browser, in order
            //the element YOU MUST NEED HTML

    public void method(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //the test will never fails when we use explicet wait
        driver.navigate().to("https://www.facebook.com/");



        WebDriverWait wait = new WebDriverWait(driver,20);
        wait.until(ExpectedConditions.titleContains("Facebook"));
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(""))));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
            wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath(""))));
        WebElement seacrbox=driver.findElement(By.xpath(""));
        seacrbox.sendKeys("asdasd");
        wait.until(ExpectedConditions.textToBePresentInElement(seacrbox,"asdasd"));



        WebElement yy=null;
        yy.click();

        Actions act=new Actions(driver);
        act.moveToElement(yy).sendKeys("sadasd").sendKeys(Keys.ENTER).perform();




    }
}
