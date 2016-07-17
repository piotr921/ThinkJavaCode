import java.util.Scanner;

/**
 * Created by media on 2016-07-16.
 */
public class LettersHistogram {

    public static String readInput(String paramName){
        Scanner in = new Scanner(System.in);
        System.out.print("\nWrite " + paramName);
        return in.nextLine();
    }

    public static int[] letterHist(String word){
        int[] histogram = new int[26]; // number of letters in alphabet
        word = word.toUpperCase();
        int histIndex;
        for(int i=0; i<word.length(); i++){
            histIndex = word.charAt(i) - 65;
            histogram[histIndex]++;
        }
        return histogram;
    }

    public static void displayHist(int[] histogram){
        char letter;
        for(int i=0; i<histogram.length; i++){
            letter = (char) (65+i);
            System.out.print("\nLetter " + letter + " occurs " + histogram[i] + " times.");
        }
    }


    public static void main(String[] args){
        String userWord = readInput("your word: ");
        int[] letterHistogram = letterHist(userWord);
        displayHist(letterHistogram);
    }
}
