import java.util.Scanner;

/**
 * Created by media on 2016-07-09.
 */
public class GaussFunction {

    public static int readInput(String name){
        Scanner in = new Scanner(System.in);
        boolean okay;
        do{
            System.out.print("Write value of " + name + ": ");
            if(in.hasNextInt()){
                okay = true;
            }else{
                okay = false;
                System.err.print(in.toString() + " is not a number!");
            }
        }while (!okay);
        return in.nextInt();
    }

    public static float selectSign(int n){
        if((n % 2) == 0){
            return 1;
        }else {
            return -1;
        }
    }

    public static float calculateComponent(int x, int n){
        if(n == 0){
            return 1;
        }else{
            float tmp_n = (float) n;
            float tmp_x = (float) x;
            return (x/n)*calculateComponent(x,n-1);
        }
    }

    public static float gauss(int x, int n){
        float result = 0;
        while(n>0){
            result += selectSign(n)*calculateComponent(x,2*n);
            n--;
        }
        return result;
    }

    public static void main(String[] args){
        int base = readInput("x");
        int accuracy = readInput("n");
        float answer = gauss(base,accuracy);
        System.out.printf("\nYour answer is: %f", answer);
    }
}
