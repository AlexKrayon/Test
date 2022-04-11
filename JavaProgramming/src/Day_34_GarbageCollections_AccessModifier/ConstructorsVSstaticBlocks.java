package Day_34_GarbageCollections_AccessModifier;

public class ConstructorsVSstaticBlocks {

    static {
        System.out.println("Static Block");
    }

    public ConstructorsVSstaticBlocks(){
        System.out.println("Constructors");
    }

    public static void main(String[] args) {
        System.out.println("Main Method");
        new ConstructorsVSstaticBlocks();
        new ConstructorsVSstaticBlocks();
        new ConstructorsVSstaticBlocks();
        new ConstructorsVSstaticBlocks();

    }




}
