import java.util.Arrays;

/**
 * Created by media on 2016-07-17.
 */
public class ForDebugging09 {

    public static boolean isNextLetterBigger(String s){
        if(s.charAt(0) < s.charAt(1)){
            return true;
        } else{
            return false;
        }
    }

    public static boolean inCharArray(char letter, char[] array){
        boolean okay = false;
        for(int i=0; i<array.length; i++){
            if(letter == array[i]){
                okay = true;
                break;
            }
        }
        return okay;
    }

    public static String removeLetterByIndex(String s, int index){
        return s.substring(0,index) + s.substring(index+1,s.length());
    }

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

    public static int numberOfOccurances(char letter, String word){
        int counter = 0;
        for(int i=0; i<word.length(); i++){
            if(letter == word.charAt(i)){
                counter++;
            }
        }
        return counter;
    }

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

    public static void main(String[] args){

        /*
        char c = 'a';
        char[] array = new char[4];
        array[0] = 'q';
        array[1] = 'l';
        array[2] = 'z';
        array[3] = 'b';
        //System.out.print("\nResult: " + isCharInArray(c, array));
        char[] array2 = new char[3];
        array2[0] = 'q';
        array2[1] = 'l';
        array2[2] = 'z';
        //array2[3] = 'w';

        /*
        String s = "hakunamatata";
        int i = 5;
        */

        char c = 'a';
        String s1 = "mamaitataa";
        String s2 = "iaaaammtto";
        boolean res = areTheSameOccurance(s1,s2);
        System.out.print(res);

    }
}
