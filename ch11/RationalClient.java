/**
 * Created by Comarch on 2016-07-21.
 */
public class RationalClient {
    public static void main(String[] args){
        Rational number = new Rational(3,13);
        /*
        number.setDenominator(2);
        number.setNumerator(9);
        */
        /////
        number.printRational(number);
        ////
        String s = number.toString();
        System.out.println(s);

        number.negate();
        s = number.toString();
        System.out.println("After negation: " + s);
        number.negate();

        number.swap();
        s = number.toString();
        System.out.println("After swap: " + s);

        double result = number.toDouble(number);
        System.out.println("Result = " + result);
    }
}
