package Day_28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {
        String password = "cydeo1990&";
        
        int countUpper = 0,
                countLower = 0,
                countDigit = 0,
                countSpecial = 0;

        for (int i = 0; i < password.length(); i++) {
            char each = password.charAt(i);
            
            if(Character.isUpperCase(each)){
                countUpper++;    
            }else if(Character.isLowerCase(each)){
                countLower++;
            }else if ( Character.isDigit(each)){
                countDigit++;
            } else {
                   countSpecial++; 
                }
            }
        System.out.println("countUpper = " + countUpper);
        System.out.println("countLower = " + countLower);
        System.out.println("countDigit = " + countDigit);
        System.out.println("countSpecial = " + countSpecial);
        
        boolean hasUpper = countUpper > 0;
        boolean hasLower = countLower > 0;
        boolean hasDigit = countDigit > 0;
        boolean hasSpecial = countSpecial > 0;
        
        boolean strongPassword = password.length() >= 8 && !password.contains(" ") && hasDigit && hasSpecial && hasLower && hasUpper;

        System.out.println("strongPassword = " + strongPassword);
        
        
            
            
        }
        
        
        
    }




