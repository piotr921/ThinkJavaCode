/**
 * Created by Comarch on 2016-07-21.
 */
public class ForDebuggingCh11 {

    private static int divide(int number, int divider){
        int result = number;
        int i = 1;
        while(result > divider){
            result = number % (i*divider);
        }
        return result;
    }

    private static int findGCD(int numerator, int denominator){
        int rest = 1;
        while(rest != 0){
            rest = divide(numerator, denominator);
            numerator = denominator;
            denominator = rest;
        }
        return denominator;
    }

    public static void main(String[] args){
        int x = findGCD(500,4000);
        System.out.println("result = " + x);
    }
}
