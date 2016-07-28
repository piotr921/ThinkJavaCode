/**
 * Created by Comarch on 2016-07-21.
 */
public class RationalClient {
    public static void main(String[] args){
        Rational number = new Rational(767,1900);
        Rational toAdd = new Rational(100,89);
        /*
        number.setDenominator(2);
        number.setNumerator(9);
        */
        /*
        number.printRational(number);
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
        */
        number.add(toAdd);
        System.out.println("Result: " + number);
    }
}
