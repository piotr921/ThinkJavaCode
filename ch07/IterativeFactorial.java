import java.util.Scanner;

/**
 * Created by media on 2016-07-08.
 */
public class IterativeFactorial {

    public static int readInput(){
        Scanner in = new Scanner(System.in);
        boolean okay;
        do{
            System.out.println("Write number: ");
            if(in.hasNextInt()){
                okay = true;
            } else {
                okay = false;
                System.err.println(in.toString() + " is not a number");
            }
        } while (!okay);
        return in.nextInt();
    }

    public static int factorial(int input){
        int result = 1;
        while (input > 0){
            result *= input;
            input--;
        }
        return result;
    }

    public static void main(String[] args){
        int base = readInput();
        int answer = factorial(base);
        System.out.printf("\nYour answer is: %d", answer);

    }
}
