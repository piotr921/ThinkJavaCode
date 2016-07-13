import java.util.Arrays;
import java.util.Random;

/**
 * Created by media on 2016-07-12.
 */
public class MaxElementIndex {

    public static void generateRandom(int[] array){
        Random random = new Random();
        for(int i=0; i<array.length; i++){
            array[i] = random.nextInt(array.length);
        }
    }

    public static int indexOfMax(int[] array){
        int index = 0;
        int value = 0;
        for(int i=0; i<array.length; i++){
            if(array[i] > value){
                index = i;
                value = array[i];
            }
        }
        return index;
    }

    public static void main(String[] args){
        int size = 10;
        int[] numbers = new int[size];
        generateRandom(numbers);
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.printf("\nIndex of max value: %d", indexOfMax(numbers));
    }
}
