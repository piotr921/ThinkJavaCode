import java.util.Scanner;

/**
 * Created by media on 2016-07-07.
 */
public class SquareRootApproximation {

    public static double readInput(){
        Scanner in = new Scanner(System.in);
        boolean okay;
        do {
            System.out.print("Write number: ");
            if(in.hasNextDouble()){
                okay = true;
            } else{
                okay = false;
                String word = in.next();
                System.err.println(word + " is not a number!");
            }
        }while (!okay);
        return in.nextDouble();
    }

    public static double calculateNextGuess(double previous, double number){
        return (previous+number/previous)/2.0;
    }

    public static double squareRoot(double number){
        double x0 = number/2.0;
        double x1 = calculateNextGuess(x0,number);
        while(Math.abs(x0-x1)>0.0001){
            x0 = x1;
            x1 = calculateNextGuess(x0,number);
        }
        return x1;
    }

    public static void main(String[] args){
        double usernumber = readInput();
        System.out.printf("\nYou write: %.2f", usernumber);
        double answer = squareRoot(usernumber);
        System.out.printf("\nYour answer: %f", answer);
    }
}
