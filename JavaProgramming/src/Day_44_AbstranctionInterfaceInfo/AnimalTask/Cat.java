package Day_44_AbstranctionInterfaceInfo.AnimalTask;

public final class Cat extends Animal implements Playable{
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " eats Ekmek");
    }
    public void miyav(){
        System.out.println(getName()+ " is Miyaving");

    }

    public void play() {
        System.out.println(getName()+ " is playing with ball");
    }
}
