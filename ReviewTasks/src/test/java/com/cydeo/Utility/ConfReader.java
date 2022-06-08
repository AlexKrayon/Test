package com.cydeo.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfReader {

   private static Properties properties = new Properties();


    static {
        {
            try {
                FileInputStream file;
                file = new FileInputStream("configuration.properties");
                properties.load(file);
                file.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
    public static String getProperty(String keyword){
        return  properties.getProperty(keyword);
    }







}
