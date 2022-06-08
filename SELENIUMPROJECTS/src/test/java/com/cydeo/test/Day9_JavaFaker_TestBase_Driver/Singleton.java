package com.cydeo.test.Day9_JavaFaker_TestBase_Driver;

public class Singleton {
    //create private constructor
    public Singleton(){

    }

    private static String word;

    public static String getWord(){

        if(word == null){
            System.out.println("First time call. Word object is null. "+ "Assigning value to it now.");
            word= "something";
        }else {
            System.out.println("Word already has value.");
        }
        return word;
    }


}
