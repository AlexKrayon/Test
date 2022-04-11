package Day_24_CustomMethodsReturn;

import java.util.Locale;

public class Practice {
    public static void main(String[] args) {
                initials("Fatih","Balcı");
        System.out.println("--------------------------");
        domain( "fatih.balci@melasoft.com");

        System.out.println("---------------------------------");

        String [] emails = {"aadh@yahoo.com", "kjagakgb@gmail.com", "fvbjavb@melasoft.com"};
        for (String email : emails) {
            domain(email);
        }

        System.out.println("---------------------------------");
        nameOfMonth(3);

        System.out.println("---------------------------------");

        nameOfDay(5);


            }

            public static void initials (String firstName, String lastName){
                System.out.println("Hello World");
                String initial = firstName.charAt(0)+"."+lastName.charAt(0)+".";
                initial=initial.toUpperCase();
                System.out.println("initial = " + initial);
            }

            public static void domain(String email){

        String domain = email.substring(email.indexOf("@")+1 , email.lastIndexOf("."));
                System.out.println("domain = " + domain);
            }

            public static void nameOfMonth (int number){
        String name = "";
        if(number>= 1 && number <= 12){

            name = (number == 1)? "Jan" : (number == 2)? "Feb" : (number == 3)? "Mar" : (number == 4)? "Apr" :
                    (number == 5)? "May" : (number == 6)? "Jun" : (number == 7)? "Jul" : (number == 8)? "Aug" :
                            (number == 9)? "Sep" : (number == 10)? "Oct" : (number == 11)? "Nov" : "Dec";
        }else{
            name = "Invalid";
        }
                System.out.println("Month name = " + name);


            }

            public static void nameOfDay (int number){

        String name = "";
        name = (number == 1)? "Mon" : (number == 2)? "Tue" : (number == 3)? "Wed" : (number == 4)? "Thu" :
                (number == 5)? "Fri" : (number == 6)? "Sat" : (number == 7)? "Sun" : "Invalid."; // if kullanmadan bu şekilde de olur.
                System.out.println("Day name = " + name);

            }


}
