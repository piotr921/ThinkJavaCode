import java.util.Scanner;

/**
 * Created by Comarch on 2016-07-18.
 */
public class Scrabble {

    public static String readInput(String paramName){
        Scanner in = new Scanner(System.in);
        System.out.print("\n Write " + paramName + ": ");
        return in.nextLine();
    }

    /*
    * Returns TRUE when input char is in input string
     */
    public static boolean isInString(char letter, String word){
        boolean okay = false;
        for(int i=0; i<word.length(); i++){
            if(letter == word.charAt(i)){
                okay = true;
                break;
            }
        }
        return okay;
    }

    /*
    * Returns input string without input char
     */
    public static String removeLetterFromWord(char letter, String word){
        int index = 0;
        for(int i=0; i<word.length(); i++){
            if(letter == word.charAt(i)){
                index = i;
                break;
            }
        }
        if(index == word.length()-1){
            return word.substring(0,index);
        } else{
            return word.substring(0,index) + word.substring(index+1, word.length()-1);
        }
    }

    public static boolean canSpell(String tiles, String word){
        boolean okay  = true;
        char tmp;
        for(int i=0; i<word.length(); i++){
            tmp = word.charAt(i);
            if(isInString(tmp, tiles)){
                tiles  = removeLetterFromWord(tmp, tiles);
            } else{
                okay = false;
            }
        }
        return okay;
    }

    public static void main(String[] args){
        String tiles = readInput("tiles word");
        String userWord = readInput("user word");
        System.out.print("\nResult: " + canSpell(tiles, userWord));
    }
}
