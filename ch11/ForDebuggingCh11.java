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
        if(numerator - denominator == 0){
            return numerator;
        } else if(numerator - denominator > 0){
            return findGCD(numerator-denominator, denominator);
        } else{
            return findGCD(numerator,denominator-numerator);
        }
    }

    public static Rational reduce(Rational number){
        Rational result = new Rational(number.getNumerator(),number.getDenominator());
        int gcd = findGCD(number.numerator, number.denominator);
        result.setNumerator(result.getNumerator()/gcd);
        result.setDenominator(result.getDenominator()/gcd);
        return result;
    }

    public static void main(String[] args){
        Rational r = new Rational(1071,462);
        Rational result = reduce(r);
        System.out.println("Result: " + result);
        System.out.println("r: " + r);
        System.exit(0);
    }
}
