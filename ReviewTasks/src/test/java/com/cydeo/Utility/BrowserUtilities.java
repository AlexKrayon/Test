package com.cydeo.Utility;

public class BrowserUtilities {

    public static void sleep (int seconds){
        seconds*=1000;
        try {
            Thread.sleep(seconds);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
