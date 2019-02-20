package Utilities;

import org.openqa.selenium.interactions.Actions;

public class Mylibrary {
    public static Actions act;

    public static void sleep(double a){
        try {
            Thread.sleep((int)(a*1000));
        } catch (InterruptedException e) {

        }
    }
}
