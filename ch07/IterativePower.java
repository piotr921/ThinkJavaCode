import java.util.Scanner;

/**
 * Created by media on 2016-07-08.
 */
public class IterativePower {

    public static int readInput(String numberName){
        Scanner in = new Scanner(System.in);
        boolean okay;
        do{
            System.out.println("Write " + numberName + ": ");
            if(in.hasNextInt()){
                okay = true;
            } else {
                okay = false;
                System.err.println(in.toString() + " is not a number!");
            }
        } while(!okay);
        return in.nextInt();
    }

    public static int iterativePowerOfX(int X, int n){
        int result = 1;
        while(n>0){
            result *= X;
            n--;
        }
        return result;
    }

    public static void main(String[] args){
        int base = readInput("X");
        int exponent = readInput("n");
        int answer = iterativePowerOfX(base,exponent);
        System.out.printf("\nYour answer is: %d", answer);
    }
}
