import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by media on 2016-07-12.
 */
public class FindPrimeNumbers {

    public static int readInput(String paramName){
        Scanner in = new Scanner(System.in);
        boolean okay;
        do{
            System.out.print("\n Write " + paramName);
            if(in.hasNextInt()){
                okay = true;
            } else{
                okay = false;
                System.out.println(in.toString() + " is not a number!");
            }
        } while(!okay);
        return in.nextInt();
    }

    /*
    * This method sets TRUE value to every element in input array
     */
    public static void initArrayWithTrue(boolean[] inputArray){
        for(int i=0; i<inputArray.length; i++){
            if((i!=0)||(i!=1)){
                inputArray[i] = true;
            }
        }
    }

    /*
    * This method sets FALSE in array indexes, which are not correspond to prime numbers and returns number of replacements
     */
    public static int markArrayElements(int firstValue, boolean[] array){
        int replacementsCounter = 0, loopCounter=1 ,index = 2*firstValue;
        while(index<array.length){
            if(array[index]){
                replacementsCounter++;
                array[index] = false;
            }
            loopCounter++;
            index = firstValue*loopCounter;
        }
        return replacementsCounter;
    }

    /*
    * This fuction returns index of first true value in array starts from input number
     */
    public static int findFirstTrue(int startIndex, boolean[] array){
        int result = 0;
        for(int i=startIndex+1; i<array.length; i++){
            if(array[i]){
                result = i;
                break;
            }
        }
        return result;
    }

    public static boolean[] sieve(int n){
        boolean[] result = new boolean[n];
        initArrayWithTrue(result);
        int p = 2;
        int numberOfReplacements = 1;
        while(numberOfReplacements != 0){
            numberOfReplacements = markArrayElements(p,result);
            p = findFirstTrue(p,result);
        }
        return result;
    }

    public static void main(String[] args){
        int maxValue = readInput("max value: ");
        boolean[] result = sieve(maxValue);
        System.out.println(Arrays.toString(result));
    }
}
