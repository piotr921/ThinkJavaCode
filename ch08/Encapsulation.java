import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by media on 2016-07-10.
 */
public class Encapsulation {

    public static int readInput(String paramname){
        Scanner in = new Scanner(System.in);
        boolean okay;
        do{
            System.out.printf("Write " + paramname + ": ");
            if(in.hasNextInt()){
                okay = true;
            } else {
                okay = false;
            }
        }while(!okay);
        return in.nextInt();
    }
    public static double[] powArray(double[] a, double power){
        double[] results = new double[a.length];
        for (int i=0; i<a.length; i++){
            results[i] = Math.pow(a[i], power);
        }
        return results;
    }

    public static double[] randomArray(int size){
        Random random = new Random();
        double[] array = new double[size];
        for(int i=0;i<array.length;i++){
            int tmp = random.nextInt(10);
            array[i] = (double) tmp;
        }
        return array;
    }

    public static void printArray(double[] arr){
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args){
        double array[] = randomArray(readInput("array size"));
        int power = readInput("power value");

        System.out.print("Input array: ");
        printArray(array);

        double powerarray[] = powArray(array,power);
        System.out.print("Output array: ");
        printArray(powerarray);
    }
}
