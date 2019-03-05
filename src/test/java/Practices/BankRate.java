package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class BankRate {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.bankrate.com/");

        // How To do MouseHover:
        Actions act=new Actions(driver);

        List<WebElement> bootstarps=driver.findElements(By.xpath(".//a[@class='global-navigation__horizontal-item']"));
       act.moveToElement(bootstarps.get(0)).perform();

       List<WebElement> allClickableLink=driver.findElements(By.tagName("a"));
       for(WebElement each: allClickableLink){
            String AA = each.getText();
           if(AA.equals("Reverse mortgages")){
               each.click();
               break;

           }
       }



    }

}
