import java.util.Scanner;

/**
 * Created by media on 2016-07-08.
 */
public class Expotential {

    public static double readInput(String paramname){
        Scanner in = new Scanner(System.in);
        boolean okay;
        do{
            System.out.print("Write value of " + paramname + ": ");
            if(in.hasNextDouble()){
                okay = true;
            }else {
                okay = false;
                System.err.println(in.toString() + " is not a number!");
            }
        }while (!okay);
        return in.nextDouble();
    }

    public static float factorial(int number){

        if(number == 0){
            return (float) 1.0;
        }
        else {
            return number*factorial(number-1);
        }
    }

    public static float myexp(int x, int n){
        float result = 0;
        while(n >= 0){
            result += Math.pow(x,n)/factorial(n);
            n--;
        }
        return result;
    }

    public static float calculateComponent(int x, int n){
        if(n == 0){
            return 1;
        } else{
            //System.out.printf("\nDo mnozenia: %f", (4.0/n));
            float y = (float) x;
            return ((y/n)*calculateComponent(x,n-1));
        }
    }

    public static float myexpSimplified(int x, int n){
        float result = 0;
        while(n>=0){
            result += calculateComponent(x,n);
            n--;
        }
        return result;
    }

    public static void check(double x){
        int n = 25;
        float exp = (float) Math.exp(x);
        int tmp_x = (int) x;
        float myexp = myexpSimplified(tmp_x,n);
        System.out.printf("X = %d \t Computer result = %f \t My result = %f",(int)x,exp,myexp);
    }

    public static void main(String[] args){
        double expotential = readInput("x");
        //int numberofelements = readInput("n");
        /*
        float answer = myexp(expotential,numberofelements);
        float answersimplified = myexpSimplified(expotential,numberofelements);
        System.out.printf("\nYour answer is: %f", answer);
        System.out.printf("\nYour simplified answer is: %f", answersimplified);
        */
        check(expotential);
    }
}
