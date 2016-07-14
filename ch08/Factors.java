import java.util.Scanner;

/**
 * Created by Comarch on 2016-07-14.
 */
public class Factors {

    public static int readInput(String variableName){
        Scanner scanner = new Scanner(System.in);
        boolean okay;
        do{
            System.out.printf("Write " + variableName);
            if(scanner.hasNextInt()){
                okay = true;
            } else{
                okay = false;
                System.out.println("Wrong data type!");
            }
        } while(!okay);
        return scanner.nextInt();
    }

    public static void initializeArray(int[] array){
        for(int i=0; i<array.length; i++){
            String message = "element " + i + ": ";
            array[i] = readInput(message);
        }
    }

    public static boolean areFactors(int n, int[] array){
        boolean okay = false;
        int numberOfFactorsInArray = 0;
        for(int i=0; i<array.length; i++){
            int tmp = n % array[i];
            if(n%array[i] == 0){
                numberOfFactorsInArray++;
            }
        }
        if(numberOfFactorsInArray == array.length){
            okay = true;
        }
        return okay;
    }

    public static void main(String[] args){
        int userNumber = readInput("user number: ");
        int arraySize = readInput("array size: ");
        int[] array = new int[arraySize];
        initializeArray(array);
        boolean result = areFactors(userNumber, array);
        System.out.println("Result is: " + result);
    }
}
