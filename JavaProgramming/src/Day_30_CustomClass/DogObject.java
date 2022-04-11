package Day_30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObject {

    public static void main(String[] args) {
       Dog dog1 = new Dog(); // Dog objecti bu şekilde oluşturulur.
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'M';
        dog1.size = "Small";
        dog1.color = "White";


        Dog dog2 = new Dog();
        dog2.name = "Kara";
        dog2.breed = "Sivas";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Small";
        dog2.color = "Brown";


        Dog dog3 = new Dog();
        dog3.setInfo("Jane", "Buldok", 3,'F',"Big","Black");

        Dog dog4 = new Dog();
        dog4.setInfo("Lary","USA",2,'F', "Small","Blue");

        Dog dog5 = new Dog();
        dog5.setInfo("Pany", "Yozgat",1,'M',"Big","Gray");



        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);
        System.out.println(dog5);

        dog1.eat();

        dog3.bark();

     System.out.println("--------------------------------------");

     Dog[] dogs = {dog1,dog2,dog3,dog4,dog5};



     ArrayList<Dog> femaleDogs = new ArrayList<>();
     ArrayList<Dog> maleDogs = new ArrayList<>();


     for (Dog each : dogs) {
      if(each.gender == 'F'){
       femaleDogs.add(each);
      }else{maleDogs.add(each);

      }
     }
     System.out.println(femaleDogs);
     System.out.println(maleDogs);






    }
}
