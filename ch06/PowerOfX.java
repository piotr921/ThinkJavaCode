import java.util.Scanner;

/**
 * Created by media on 2016-07-07.
 */
public class PowerOfX {

    public static int readInput(String parametername){
        Scanner in = new Scanner(System.in);
        System.out.print("Write value of " + parametername + ": ");
        return in.nextInt();
    }

    public static int power(int X, int n){
        if(n==0){
            return 1;
        } else {
            return X*power(X,n-1);
        }
    }

    public static void main(String[] args){
        int base = readInput("X");
        int exponent = readInput("n");

        int answer = power(base,exponent);
        System.out.printf("\nYour answer is: %d", answer);
    }
}
