/**
 * Recursion exercise.
 */
public class Recurse {

    /**
     * Returns the first character of the given String.
     */
    public static char first(String s) {
        return s.charAt(0);
    }

    /**
     * Returns all but the first letter of the given String.
     */
    public static String rest(String s) {
        return s.substring(1);
    }

    /**
     * Returns all but the first and last letter of the String.
     */
    public static String middle(String s) {
        return s.substring(1, s.length() - 1);
    }

    /**
     * Returns the length of the given String.
     */
    public static int length(String s) {
        return s.length();
    }

    /*
    * Prints every char of input string in different line
     */
    public static void printString(String s){
        int noOfLoopIterations = length(s);
        for(int i=0; i<noOfLoopIterations; i++){
            System.out.println(first(s));
            s = rest(s);
        }
    }

    /*
    * Prints every char of input string in different line backwards
     */
    public static void printBackward(String s){
        if(length(s) == 1){
            System.out.println(first(s));
        } else{
            printBackward(rest(s));
            System.out.println(first(s));
        }
    }

    /*
    * Returns input string with reverse letters
     */
    public static String reverseString(String s){
        String rev = "";
        if(length(s) == 1){
            rev += first(s);
        } else{
            reverseString(rest(s));
            rev += first(s);
        }

        return rev;
    }

    /*
    * Returns TRUE when input string is a palindrome
     */
    public static boolean isPalindrome(String s){
        if(length(s) == 1){
            return true;
        } else if(length(s) == 2){
            return (first(s) == rest(s).toCharArray()[0]);
        } else{
            if(first(s) == rest(s).toCharArray()[length(s)-2]){
                return isPalindrome(middle(s));
            }
            else {
                return false;
            }
        }
    }

    public static void main(String[] args){
        String userText = "kajaki";
        /*
        System.out.print("\nfirst: " + first(userText));
        System.out.print("\nrest: " + rest(userText));
        System.out.print("\nmiddle: " + middle(userText));
        */
        // printString(userText);
        // printBackward(userText);
        // String reverseUser = reverseString(userText);
        System.out.println(isPalindrome(userText));
    }

}
