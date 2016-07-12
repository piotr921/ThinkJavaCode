/**
 * Created by media on 2016-06-30.
 */

import java.util.Scanner;

public class Multiadd {

    public static double multiadd(double a, double b, double c){
        return a*b+c;
    }

    public static void displayMessage(String functionName, boolean ok){
        String information;
        if(ok){
            information = "properly.";
        } else{
            information = "badly";
        }
        System.out.println("Function " + functionName + " works " + information);
    }

    public static void main(String[] args){
        boolean isworkingcorrect = false;
        String messagetouser;
        Scanner in = new Scanner(System.in);

        double test = multiadd(1.0,2.0,3.0);
        double result1 = multiadd(Math.cos(180.0/4.0),0.5,Math.sin(180.0/4.0));
        double result2 = multiadd(Math.log10(10.0),1,Math.log10(20.0));

        System.out.printf("Result 1 is: %.3f\n", result1);
        System.out.printf("Result 2 is: %.3f", result2);

        System.out.print("\nWrite number: ");
        double result3Input = in.nextDouble();
        double result3 = multiadd(result3Input,Math.exp(-result3Input),Math.sqrt(1-Math.exp(-result3Input)));
        System.out.printf("Result 3 is: %.3f", result3);
        /*
        if(result == 5){
            isworkingcorrect = true;
        }

        displayMessage("multiadd", isworkingcorrect);
        */
    }
}
