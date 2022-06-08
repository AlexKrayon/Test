package com.cydeo.test.Day9_JavaFaker_TestBase_Driver;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerIntro {

    @Test
    public void test1(){
        Faker faker = new Faker();
        //Faker faker = new Faker(new Locale("tr"));

        System.out.println("faker.name().firstName() = " + faker.name().firstName());
        System.out.println("faker.name().lastName() = " + faker.name().lastName());

        System.out.println("faker.name().fullName() = " + faker.name().fullName());
        
        String randomNumber = faker.numerify("###-###-####");
        System.out.println("randomNumber = " + randomNumber);
        System.out.println("faker.numerify() = " + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"###-###-####\") = "
                + faker.numerify("###-###-####"));

        System.out.println("faker.numerify(\"90-312-###-####\") = "
                + faker.numerify("90-312-###-####"));

        System.out.println("faker.letterify(\"???-????\") = "
                + faker.letterify("???-????"));

        System.out.println("faker.bothify(\"??#-##?-????\") = "
                + faker.bothify("??#-##?-????"));

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard());

        System.out.println("faker.finance().creditCard() = " + faker.finance().creditCard().replaceAll("-"," "));

        //System.out.println("faker.file().fileName() = " + faker.file().fileName());

        System.out.println("faker.chuckNorris().fact() = "
                + faker.chuckNorris().fact().replaceAll("Chuck Norris","Yavuz Bey"));


    }




}
