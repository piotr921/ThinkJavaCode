import java.util.Scanner;

/**
 * Created by media on 2016-07-17.
 */
public class Doubloon {

    public static String readInput(String paramName){
        Scanner in = new Scanner(System.in);
        System.out.print("Write " + paramName + ": ");
        return in.next();
    }

    /*
    * Returns TRUE when input char is in array
     */
    public static boolean isCharInArray(char letter, char[] array){
        boolean okay = false;
        for(int i=0; i<array.length; i++){
            if(letter == array[i]){
                okay = true;
                break;
            }
        }
        return okay;
    }

    /*
    * This function returns input string without character with input index
     */
    public static String removeLetterByIndex(String s, int index){
        return s.substring(0,index) + s.substring(index+1,s.length());
    }

    public static boolean isDoubloon(String s){
        int noOfRepetedLetters = 0;
        String tmp = "";
        char letter;
        char[] searchedLetters = new char[s.length()];
        boolean okay = true;

        for(int i=0; i<s.length(); i++){
            if(!isCharInArray(s.charAt(i), searchedLetters)){
                letter = s.charAt(i);
                tmp = removeLetterByIndex(s,i);
                if(tmp.indexOf(letter) != -1 ){
                    searchedLetters[noOfRepetedLetters] = letter;
                    noOfRepetedLetters++;
                } else{
                    okay = false;
                    break;
                }
            }
        }
        return okay;
    }

    public static void main(String[] args){
        String userWord = readInput("your word");
        userWord.toLowerCase();
        System.out.print("Result: " + isDoubloon(userWord));
    }
}
