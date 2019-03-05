package Practices;

import com.sun.tools.internal.ws.wsdl.document.jaxws.Exception;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.text.html.HTML;
import java.util.concurrent.TimeUnit;

public class Implicity_VS_Explicity {
   //implicity wait: timeouts for HTML codes to be uploaded
    //properly so that the WebElement can be found only
    //applies to : FindElement(s).for both
    //Because FindElement is the only way to make the
    //WebElement out from the browser, in order to create the element You Must need HTML.




    public void method1(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // set up implicity wait

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // time outs elements


    }

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        // set up implicity wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // time outs elements

        driver.navigate().to("https://www.facebook.com/");
        // Expilicity Wait
      WebDriverWait wait = new WebDriverWait(driver,20);
      wait.until(ExpectedConditions.titleContains("FaceBook"));
      wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("XXX"))));
      wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("XXX"))));

            // wait until found the element
      wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath("xxx"))));

        wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.xpath(""))));
        WebElement searchbox = driver.findElement(By.xpath(""));
        searchbox.sendKeys("xxxx");
        wait.until(ExpectedConditions.textToBePresentInElement(searchbox,"xxx"));
        // implicity wait just declare once
        // action is mouse
        WebElement yy=null;
        yy.click();

        Actions act=new Actions(driver);
        act.moveToElement(yy).sendKeys("sadasd").sendKeys(Keys.ENTER).perform();



    }
}
