import java.util.Scanner;

/**
 * Created by media on 2016-07-17.
 */
public class Abecedarian {

    /*
    * Returns String write by user in console
     */
    public static String readInput(String paramName){
        Scanner in = new Scanner(System.in);
        System.out.print("Write " + paramName);
        return in.next();
    }

    /*
    * returns TRUE when second letter is string is bigger than first
     */
    public static boolean isNextLetterBigger(String s){
        if(s.charAt(0) < s.charAt(1)){
            return true;
        } else{
            return false;
        }
    }

    /*
    * Returns TRUE when letters in word are alphabetical
     */
    public static boolean isAbecedarian(String s){
        s = s.toUpperCase();
        if(s.length() == 2){
            return isNextLetterBigger(s);
        } else{
            String tmp = s.substring(0,2);
            if(isNextLetterBigger(tmp)){
                s = s.substring(1,s.length());
                return isAbecedarian(s);
            } else {
                return false;
            }
        }
    }


    public static void main(String[] args){
        String userWord = readInput("your word: ");
        System.out.printf("Your answer: " + isAbecedarian(userWord) );
    }
}
