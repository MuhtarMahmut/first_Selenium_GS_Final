package Practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CheckBox_RadioButton_Handlings {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.etsy.com/");

        WebElement searchbox=driver.findElement(By.xpath(".//input[@id='search-query']"));
        searchbox.sendKeys("Wooden Spoon" + Keys.ENTER);
        driver.manage().window().maximize();
        // Implicity wait:
        // makes time out for HTML codes to be fully uploaded so that findElements will work properly

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
}
