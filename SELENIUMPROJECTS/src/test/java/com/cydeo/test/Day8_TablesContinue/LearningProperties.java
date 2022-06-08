package com.cydeo.test.Day8_TablesContinue;

import org.testng.annotations.Test;

public class LearningProperties {

    @Test
    public void java_properties_reading_test(){
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name")); // bilgisayar programını gösterir
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name")); // bilgisayar user name gösterir.
        System.out.println("System.getProperty(\"browser.name\") = " + System.getProperty("browser.name"));


    }



}
