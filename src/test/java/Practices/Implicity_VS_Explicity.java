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

import java.util.concurrent.TimeUnit;

public class Implicity_VS_Explicity {
    // Implicity wait:
    // timeouts for HTML codes to be uploaded properly so that the Webelement can be found
        // only applies to: FindElement(s).
            // bceause findelemnt(s) is the only way make the webelement out from the browser, in order to create
                // the element YOU MUST Need HTML.


    public void method1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // setUp tyhe implicity wait:
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                    // timeouts for elemnts to be found.


    }

    // Explicity Wait:
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.navigate().to("https://www.facebook.com");

        // Explicity wait declaration
        WebDriverWait wait=new WebDriverWait(driver, 50);
          wait.until(ExpectedConditions.titleContains("Facebook"));
          wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@id='u_0_n']"))));
          wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("xxx"))));
            wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
        WebElement seacrbox=driver.findElement(By.xpath(""));
        seacrbox.sendKeys("asdasd");
            wait.until(ExpectedConditions.textToBePresentInElement(seacrbox,"asdasd"));


            WebElement yy=null;
            yy.click();

        Actions act=new Actions(driver);
        act.moveToElement(yy).sendKeys("sadasd").sendKeys(Keys.ENTER).perform();

    }

}
