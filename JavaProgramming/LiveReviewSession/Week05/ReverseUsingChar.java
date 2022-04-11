package Week05;

public class ReverseUsingChar {
    public static void main(String[] args) {

        String word = "Fatih";

        System.out.println(word.charAt(4));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(0));

        String reversedWord = "";
        reversedWord+=word.charAt(4);
        reversedWord+=word.charAt(3);
        reversedWord+=word.charAt(2);
        reversedWord+=word.charAt(1);
        reversedWord+=word.charAt(0);

        System.out.println("reversedWord = " + reversedWord);

        if(word.equals(reversedWord)){
            System.out.println("The word is Palindrome");
        }else{
            System.out.println("The word is NOT Palindrome");
        }



    }
}
