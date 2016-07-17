import java.util.Scanner;

/**
 * Created by media on 2016-07-17.
 */
public class Anagram {

    public static String readInput(String paramName){
        Scanner in = new Scanner(System.in);
        System.out.print("\nWrite " + paramName + ": ");
        return in.next();
    }

    /*
    * Returns TRUE when input char is in array
     */
    public static boolean inCharArray(char letter, char[] array){
        boolean okay = false;
        for(int i=0; i<array.length; i++){
            if(array[i] == letter){
                okay = true;
                break;
            }
        }
        return okay;
    }

    /*
    * Returns array of chars with every letter in word
     */
    public static char[] lettersInWord(String word){
        int letterIndex = 0;
        char[] tmp = new char[word.length()];
        for(int i=0; i<word.length(); i++){
            if(!inCharArray(word.charAt(i), tmp)){
                tmp[letterIndex] = word.charAt(i);
                letterIndex++;
            }
        }
        char[] letters = new char[letterIndex];
        for(int i=0; i<letterIndex; i++){
            letters[i] = tmp[i];
        }
        return letters;
    }

    /*
    * Returns TRUE when in both arrays are the same letters
     */
    public static boolean areTheSameLetters(char[] first, char[] second){
        boolean okay = true;
        if(first.length == second.length){
            for(int i=0; i<first.length; i++){
                if(!inCharArray(first[i], second)){
                    okay = false;
                    break;
                }
            }
        } else{
            okay = false;
        }
        return okay;
    }

    /*
    * Returns number of occurances of input char in input string
     */
    public static int numberOfOccurances(char letter, String word){
        int counter = 0;
        for(int i=0; i<word.length(); i++){
            if(letter == word.charAt(i)){
                counter++;
            }
        }
        return counter;
    }

    /*
    * Returns TRUE when every letter in both words occurance the same number of times.
    * INPUT STRINGS MUST HAVE THE SAME LENGTH!!
     */
    public static boolean areTheSameOccurance(String first, String second){
        boolean okay = true;
        for(int i=0; i<first.length(); i++){
            char tmp = first.charAt(i);
            if(!(numberOfOccurances(tmp, first) == numberOfOccurances(tmp, second))){
                okay = false;
            }
        }
        return okay;
    }

    public static boolean areAnagrams(String first, String second){
        boolean okay;
        if(first.length() == second.length()){
            char[] firstLetters = lettersInWord(first);
            char[] secondLetters = lettersInWord(second);
            if(areTheSameLetters(firstLetters,secondLetters)){
                if(areTheSameOccurance(first,second)){
                    okay = true;
                } else{
                    okay = false;
                }
            } else{
                okay = false;
            }
        } else{
            okay = false;
        }
        return okay;
    }

    public static void main(String[] args){
        String word1 = readInput("first word");
        String word2 = readInput("second word");
        System.out.print("Result: " + areAnagrams(word1,word2));
    }
}
