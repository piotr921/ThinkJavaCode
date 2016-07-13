import java.util.Arrays;

/**
 * Created by media on 2016-07-13.
 */
public class FindPrimeNumbersTest {

    /*
    * This method sets FALSE in array indexes, which are not correspond to prime numbers and returns number of replacements
    */
    public static int testMarkArrayElements(int firstValue, boolean[] array){
        int replacementsCounter = 0, loopCounter=1 ,index = firstValue;
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

    public static boolean[] testInitArrayWithTrue(boolean[] inputArray){
        for(int i=0; i<inputArray.length; i++){
            if((i != 0)||(i!=1)){
                inputArray[i] = true;
            }
        }
        return inputArray;
    }

    public static void main(String[] args){
        boolean[] testBoolean = new boolean[10];

        /*for(int i=0; i<testBoolean.length; i++){
            testBoolean[i] = true;
        }

        int numberOfReplacements = testMarkArrayElements(2,testBoolean);
        System.out.println(Arrays.toString(testBoolean));
        System.out.printf("\nNumber of Replacements: %d", numberOfReplacements);
        */
        boolean[] output = testInitArrayWithTrue(testBoolean);
        System.out.println(Arrays.toString(testBoolean));
    }
}
