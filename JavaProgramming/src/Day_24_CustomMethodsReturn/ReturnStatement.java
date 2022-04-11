package Day_24_CustomMethodsReturn;

public class ReturnStatement {
    public static void main(String[] args) {
    nameOfMonth(10);

    }

    public static void nameOfMonth (int num){

        if(num < 1 || num > 12){
            System.out.println("Invalid");
                    return;
        }
        String name = (num == 1)? "Jan" : (num == 2)? "Feb" : (num == 3)? "Mar" : (num == 4)? "Apr" :
                (num == 5)? "May" : (num == 6)? "Jun" : (num == 7)? "Jul" : (num == 8)? "Aug" :
                        (num == 9)? "Sep" : (num == 10)? "Oct" : (num == 11)? "Nov" : "Dec";

        System.out.println("Mounth name = " + name);


    }



}
