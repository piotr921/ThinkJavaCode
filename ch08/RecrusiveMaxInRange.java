import java.util.Scanner;

/**
 * Created by media on 2016-07-16.
 */
public class RecrusiveMaxInRange {

    public static int readInput(String variableName){
        Scanner in = new Scanner(System.in);
        boolean okay;
        do{
            System.out.print("Write " + variableName);
            if(in.hasNextInt()){
                okay = true;
            } else{
                okay = false;
            }
        } while(!okay);
        return in.nextInt();
    }

    public static void initArray(int[] array){
        int tmp = 0;
        String message = "";
        for(int i=0; i<array.length; i++){
            message = "element no. " + i + ": ";
            tmp = readInput(message);
            array[i] = tmp;
        }
    }

    /*
    * This method returns max element of array from specified in input ranges
     */
    public static int maxInRange(int[] array, int li, int mi){
        if(mi == li){
            return array[mi];
        } else{
            if(array[mi]>maxInRange(array,li,mi-1)){
                return array[mi];
            } else{
                return maxInRange(array,li,mi-1);
            }
        }
    }

    /*
    * This method returns max element of input array
     */
    public static double max(int[] array){
        double result = (double) maxInRange(array,0,array.length-1);
        return result;
    }

    public static void main(String[] args){
        int arraySize = readInput("array size: ");
        int[] userArray = new int[arraySize];
        initArray(userArray);
        //int lowIndex = readInput("lower index: ");
        //int highIndex = readInput("higher index: ");
        double maxElement = max(userArray);
        System.out.printf("Result is: %f", maxElement);
    }
}
