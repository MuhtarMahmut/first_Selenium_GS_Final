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
public class DropDownBox_Handiling extends Mylibrary {
    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http:www.facebook.com");//or uset get
        driver.manage().window().maximize();
        Mylibrary.sleep(3.5);//java consol will stop.we use thread.sleep and calling it from Mylibrary
        //        act=new Actions(driver);//selenium browser will stop
//        act.pause(3000).perform();
//        new Actions(driver).pause(3000).perform();
        //click month dropdown box
        WebElement monthDD = driver.findElement(By.xpath(".//select[@]id='month'"));
        Select monthSelect = new Select(monthDD);//will give target inside ()
//        monthSelect.selectByIndex(11);//index will take number
//        monthSelect.selectByValue("12");//value was in string format in html
        monthSelect.selectByVisibleText("Aug");//most secure is visible text

        List<WebElement> dropDownBox = driver.findElements(By.tagName("select"));
        for (int i = 0; i < dropDownBox.size(); i++) {
            Select select = new Select(dropDownBox.get(i));
//            System.out.println(dropDownBox.get(i).getText());
            String AA = dropDownBox.get(i).getText();
            if (AA.contains("Month")) {
                select.selectByVisibleText("Feb");
            } else if (AA.contains("Day")) {
                select.selectByVisibleText("18");
            } else {
                select.selectByVisibleText("1967");
            }
            Mylibrary.sleep(2);
            select.selectByIndex(8);
            Mylibrary.sleep(2);

        }

    }


}

