package Day9_IfAndElse;

public class NameOfDay {
    public static void main(String[] args) {

        int n = 4; // 1 to 7 // String day yazarak her satırda sout yerine day = "Monday" vs yazılabilir
        if(n == 1){
            System.out.println( " Monday"); // day = "Monday"
        }else if(n == 2){
            System.out.println( " Tuesday");  // day = "Tuesday"
        }else if (n == 3){
            System.out.println( " Wednesday");
        }else if(n==4){
            System.out.println( " Thursday");
        }else if (n==5){
            System.out.println( " Friday");
        }else if(n==6){
            System.out.println( " Saturday");
        }else{
            System.out.println( " Sunday");
        }

    }
}
