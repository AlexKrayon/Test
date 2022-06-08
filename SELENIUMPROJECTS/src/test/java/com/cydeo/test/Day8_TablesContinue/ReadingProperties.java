package com.cydeo.test.Day8_TablesContinue;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_test() throws IOException {
        Properties properties = new Properties(); // create an object or properties

        FileInputStream file = new FileInputStream("configuration.properties"); // opened the file from java memory

        //load the object
        properties.load(file);
        //use properties object to read value
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"env\") = " + properties.getProperty("env"));


    }


}
