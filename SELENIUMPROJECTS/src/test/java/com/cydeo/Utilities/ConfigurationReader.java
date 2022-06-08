package com.cydeo.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties = new Properties(); // create an object or properties

    static {

        try {
            FileInputStream file = new FileInputStream("configuration.properties"); // opened the file from java memory
            //load the object
            properties.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("File not found in the ConfigurationReader class.");
            e.printStackTrace();
        }
    }


    public static String getProperty(String keyword){
        return properties.getProperty(keyword);


    }



}
