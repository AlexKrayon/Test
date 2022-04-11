package Day_36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.setInfo("Bugy", "Sivas", "Small", "White", 'M',2);
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        //dog.hunt();

        System.out.println(dog);


        Cat cat = new Cat();
        cat.setInfo("Blue", "Ankara", "Small", "White", 'F',1);
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        //cat.bark();
        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Black Tiger", "Tanzania", "Big", "Brown", 'M',12);
        tiger.eat();
        tiger.drink();
        tiger.sleep();
        tiger.move();
        //tiger.bark();
        System.out.println(tiger);


    }
}
