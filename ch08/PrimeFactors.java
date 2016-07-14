import com.sun.deploy.util.ArrayUtil;
import org.apache.commons.lang3.ArrayUtils;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Comarch on 2016-07-14.
 */
public class PrimeFactors {

    public static int readInput(String paramName){
        Scanner in = new Scanner(System.in);
        boolean okay;
        do{
            System.out.printf("Write " + paramName + ": ");
            if(in.hasNextInt()){
                okay = true;
            } else{
                okay = false;
            }
        } while (!okay);
        return in.nextInt();
    }

    /*
    * This function puts into array numers write by user
     */
    public static void initArray(int[] array){
        for(int i=0; i<array.length; i++){
            String message = "element " + i + ": ";
            array[i] = readInput(message);
        }
    }

    /*
    * This function return TRUE when input number is prime number
     */
    public static boolean isPrime(int number){
        int numberOfDividers = 0;
        for (int i=0; i<number; i++){
            if((number % i) == 0){
                numberOfDividers++;
            }
        }
        return (numberOfDividers == 2);  // Every prime number has only 2 dividers: 1 and itself
    }

    /*
    * This function returns TRUE when all elements in array are prime numbers
     */
    public static boolean arePrimeNumbers(int[] array){
        int primeNumbersCounter = 0;
        for(int i=0; i<array.length; i++){
            if(isPrime(array[i])){
                primeNumbersCounter++;
            }
        }
        return (primeNumbersCounter == array.length);
    }

    /*
    * This functions returns TRUE when all elemnts in array multiplied are equal to input number
     */
    public static boolean areMultipliesEquals(int number, int[] array){
        int product = 1;
        for(int i=0; i<array.length; i++){
            product *= array[i];
        }
        return (product == number);
    }

    /*
    * This function returns TRUE when all elements in array are prime numbers and multipiled they are equal to input number
     */
    public static boolean arePrimeFactors(int n, int[] array){
        return arePrimeNumbers(array) && areMultipliesEquals(n,array);
    }

    public static void main(String[] args){
        int userNumber = readInput("input number");
        int userArraySize = readInput("array size");
        int[] userArray = new int[userArraySize];
        initArray(userArray);
        boolean result = arePrimeFactors(userNumber, userArray);
        System.out.println("Result is: " + result);
    }
}
